public class EmployeeUtility {

    public static void printAllEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void printNames(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getLastName() + " " + employees[i].getFirstName() + " " + employees[i].getPatronymic());
        }
    }

    public static int calculatedSum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static void findEmployeeWithMaximumSalary(Employee[] employees) {
        int maximumSalary = -1;
        String EmployeeWithMaxSalary = "Сотрудник с максимлаьной зарплатой";
        for (Employee employee : employees) {
            if (employee.getSalary() > maximumSalary) {
                maximumSalary = employee.getSalary();
                EmployeeWithMaxSalary = employee.getFirstName() + " " + employee.getPatronymic() + " " + employee.getLastName();
            }
        }
        System.out.println("Максимальная зарплата у сотрудника - " + EmployeeWithMaxSalary + ", она составляет " + maximumSalary);
    }
    public static String findEmployeeWithMinimalSalary(Employee[] employees) {
        int minimumSalary = calculatedSum(employees);
        String EmployeeWithMinSalary = "Сотрудник с минимальной зарплатой";
        for (Employee employee : employees) {
            if (employee.getSalary() < minimumSalary) {
                minimumSalary = employee.getSalary();
                EmployeeWithMinSalary = employee.getFirstName() + " " + employee.getPatronymic() + " " + employee.getLastName();
            }
        }
        return "Минимальная зарплата у сотрудника - " + EmployeeWithMinSalary + ", она составляет "+ minimumSalary;
    }

    public static int findAverageSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        int averageSalary = sum / employees.length;
        return averageSalary;
    }
}
