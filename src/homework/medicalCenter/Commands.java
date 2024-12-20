package homework.medicalCenter;

public interface Commands {
    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_DATA_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PRINT_TODAY_PATIENT = "7";

    static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + ADD_DOCTOR + " for add doctor");
        System.out.println("Please input " + SEARCH_DOCTOR_BY_PROFESSION + " for search doctor by profession");
        System.out.println("Please input " + DELETE_DOCTOR_BY_ID + " for delete doctor by id");
        System.out.println("Please input " + CHANGE_DOCTOR_DATA_BY_ID + " for change data doctor by id");
        System.out.println("Please input " + ADD_PATIENT + " for add patient");
        System.out.println("Please input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for print all patient by doctor id");
        System.out.println("Please input " + PRINT_TODAY_PATIENT + " for print all patient today");
    }
}
