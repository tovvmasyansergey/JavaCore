package homework.medicalCenter.storage;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.model.Profession;
import homework.medicalCenter.util.DateUtil;

import java.util.Date;

public class PersonStorage {
    private Person[] persons = new Person[10];
    private int size = 0;

    public void add(Person person) {
        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;
    }

    private void extend() {
        Person[] tmp = new Person[size + 10];
        System.arraycopy(persons, 0, tmp, 0, size);
        persons = tmp;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                System.out.println(person);
            }
        }
    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                System.out.println(person);
            }
        }
    }

    public void searchDoctorByProfession(Profession profession) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession() == profession) {
                    System.out.println(persons[i]);
                }
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor && person.getId().equals(id)) {
                deletePersonByIndex(i);

            }
        }
    }

    private void deletePersonByIndex(int i) {
        for (int j = i; j < size; j++) {
            persons[j] = persons[j + 1];
        }
        size--;
    }


    public Doctor getDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Doctor && person.getId().equals(id)) {
                return (Doctor) person;

            }
        }
        return null;
    }

    public void searchPatientByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = persons[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void printTodayPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                Patient patient = (Patient) persons[i];
                if (DateUtil.isSameDay(today, patient.getRegisterDateTime())) {
                    System.out.println(patient);
                }
            }
        }
    }


    public boolean isDoctorAvailable(Date registerDateTime,Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof  Patient){
                Patient patient = (Patient) persons[i];
                if (patient.getDoctor().equals(doctor) && patient.getRegisterDateTime().equals(registerDateTime)){
                    return false;
                }
            }
        }
        return true;
    }

    public void printProfession() {
        Profession[] values = Profession.values();
        for (Profession value : values) {
            System.out.println(value);
        }
    }
}

