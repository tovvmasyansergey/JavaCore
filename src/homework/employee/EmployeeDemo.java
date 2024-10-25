package homework.employee;

import homework.employee.model.Company;
import homework.employee.model.Employee;
import homework.employee.storage.CompanyStorage;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        Company company = new Company("12", "aa", "aa", "3333");
        companyStorage.add(company);
        company.setEmployeeCount(3);
        employeeStorage.add(new Employee("aa", "aa", "a001", 22, company, "dd", new Date(), DateUtil.stringToDate("12/03/1998")));
        employeeStorage.add(new Employee("aa", "aa", "a002", 33, company, "dd", new Date(), DateUtil.stringToDate("12/06/2024")));
        employeeStorage.add(new Employee("aa", "aa", "a003", 44, company, "aa", new Date(), DateUtil.stringToDate("23/05/2023")));
        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    getEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_ID:
                    companyStorage.print();
                    System.out.println("Please input company id");
                    String companyId = scanner.nextLine();
                    Company companyById = companyStorage.getCompanyById(companyId);
                    if (companyById != null) {
                        employeeStorage.searchEmployeeByCompany(companyById);
                    } else {
                        System.out.println("Company does not exist");
                    }
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeeBySalaryRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION:
                    changePositionByIdEmployeeId();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEES:
                    employeeStorage.printByStatus(true);
                    break;
                case INACTIVATE_EMPLOYEE_BY_ID:
                    inactivateEmployee();
                    break;
                case ACTIVE_EMPLOYEE_BY_ID:
                    activateEmployee();
                    break;
                case PRINT_ALL_COMPANIES:
                    companyStorage.print();
                    break;
                default:
                    System.out.println("wrong index");
                    break;
            }

        }
    }

    private static void addCompany() {
        System.out.println("Please input id,name,address,phoneNumber");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById == null) {
            Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company was added!");
        } else {
            System.out.println("Company with " + companyId + "already exist");
        }
    }


    private static void activateEmployee() {
        employeeStorage.printByStatus(false);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is active");
        } else {
            employee.setActive(true);
            System.out.println("Status changed");
            employee.getCompany().setEmployeeCount(employee.getCompany().getEmployeeCount() + 1);
        }
    }

    private static void inactivateEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is inactive");
        } else {
            employee.setActive(false);
            System.out.println("Status changed");
            employee.getCompany().setEmployeeCount(employee.getCompany().getEmployeeCount() - 1);
        }
    }

    private static void changePositionByIdEmployeeId() {
        employeeStorage.printByStatus(true);
        System.out.println("Please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Wrong employee ID, please try again");
        } else {
            System.out.println("Please input new position name");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("Position changed");
        }


    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("Please input minPrice, maxPrice salary");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        try {
            double minPrice = Double.parseDouble(salaryRange[0]);
            double maxPrice = Double.parseDouble(salaryRange[1]);
            if (maxPrice > minPrice) {
                employeeStorage.searchBySalaryRange(minPrice, maxPrice);
            } else {
                System.out.println("minPrice should be less then maxPrice");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Incorrect number values,please try again");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Please input min and max salary");
        }
    }

    private static void getEmployeeById() {
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("employee with " + employeeId + " id does not exist");
        } else {
            System.out.println(employee);
        }
    }

    private static void addEmployee() throws ParseException {
        if (companyStorage.getSize() == 0) {
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("Please choose company id");
        String companyId = scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null) {
            System.out.println("Please input name,surname,employeeId,salary,position,dateOfBirthday(15/02/2023)");
            String employeeDataStr = scanner.nextLine();
            String[] employeeData = employeeDataStr.split(",");
            String employeeId = employeeData[2];
            Employee employeeById = employeeStorage.getEmployeeById(employeeId);
            if (employeeById == null) {
                Employee employee = new Employee(employeeData[0], employeeData[1], employeeData[2], Double.parseDouble(employeeData[3]), companyById, employeeData[4], new Date(), DateUtil.stringToDate(employeeData[5]));
                employeeStorage.add(employee);
                companyById.setEmployeeCount(companyById.getEmployeeCount() + 1);
                System.out.println("Employee was added");
            } else {
                System.out.println("Employee with " + employeeId + " id already exist");
            }
        } else {
            System.out.println("Wrong company id! Please try again");
        }
    }
}