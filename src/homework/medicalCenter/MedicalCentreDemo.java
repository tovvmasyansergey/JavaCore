package homework.medicalCenter;

import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Profession;
import homework.medicalCenter.storage.PersonStorage;
import homework.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class MedicalCentreDemo implements Commands {
    static private Scanner scanner = new Scanner(System.in);
    static private PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorData();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientByDoctor();
                    //  personStorage.print();
                    break;
                case PRINT_TODAY_PATIENT:
                    personStorage.printTodayPatients();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }
    }


    private static void printAllPatientByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor's id");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(id);
        if (doctor != null) {
            personStorage.searchPatientByDoctor(doctor);
        } else {
            System.out.println("doctor with " + id + " does not exist");
        }
    }

    private static void addPatient() throws ParseException {
        personStorage.printDoctors();
        System.out.println("Please choose doctor's id");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(id);
        if (doctor != null) {
            System.out.println("Please input id,name,surname,phone,registerDateTime(26-02-2023 14:00)");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(registerDateTime, doctor)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurName(patientData[2]);
                    patient.setPhone(patientData[3]);
                    patient.setDoctor(doctor);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("patient registered!");
                } else {
                    System.out.println("doctor is unavailable in that time, please choose another time");
                }

            } catch (ParseException e) {
                System.out.println("Incorrect date time format, please try again!");
            }


        }
    }

    private static void changeDoctorData() {
        personStorage.printDoctors();
        System.out.println("Please input id");
        String id = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(id);
        if (doctorById != null) {
            personStorage.printProfession();
            System.out.println("Please input name,surname,email,phone,profession");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            try {
                doctorById.setProfession(Profession.valueOf(doctorData[4]));
                doctorById.setName(doctorData[0]);
                doctorById.setSurName(doctorData[1]);
                doctorById.setPhone(doctorData[2]);
                doctorById.setEmail(doctorData[3]);
             //   personStorage.add(doctorById);
                System.out.println("Doctor was updated");
            } catch (IllegalArgumentException e) {
                System.out.println("Please input right profession");
            }



        } else {
            System.out.println("doctor with " + id + " does not exists!");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose id");
        String doctorId = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorById(doctorId);
        if (doctor != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("Wrong id,please try again");
        }
    }

    private static void searchDoctorByProfession() {
        personStorage.printProfession();
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        try {
            personStorage.searchDoctorByProfession(Profession.valueOf(profession));
        } catch (IllegalArgumentException e){
            System.out.println("Please input right profession");
        }
    }
    private static void addDoctor() {
        personStorage.printProfession();
        System.out.println("Please input id,name,surname,email,phone,profession");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(doctorData[1]);
            doctor.setSurName(doctorData[2]);
            doctor.setPhone(doctorData[3]);
            doctor.setEmail(doctorData[4]);
            try {
                doctor.setProfession(Profession.valueOf(doctorData[5]));
            } catch (IllegalArgumentException e) {
                System.out.println("Please input right profession");
            }
            personStorage.add(doctor);
            System.out.println("Doctor added");
        } else {
            System.out.println("doctor with " + doctorId + " already exists!");
        }
    }
}