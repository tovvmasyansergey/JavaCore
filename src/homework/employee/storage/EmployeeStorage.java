package homework.employee.storage;


import homework.employee.model.Company;
import homework.employee.model.Employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
        System.out.println();
    }

    public Employee getEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().equals(id)) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchEmployeeByCompany(Company company) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().equals(company)) {
                System.out.println(employees[i]);
            }
        }
    }

    public void searchBySalaryRange(double minPrice, double maxPrice) {
        for (int i = 0; i < size; i++) {
            if (minPrice <= employees[i].getSalary() && employees[i].getSalary() <= maxPrice) {
                System.out.println(employees[i]);
            }
        }
    }

    public void printByStatus(boolean isActive){
        for (int i = 0; i < size; i++) {
        if (employees[i].isActive() == isActive){
            System.out.println(employees[i]);
            }
        }
    }
}
