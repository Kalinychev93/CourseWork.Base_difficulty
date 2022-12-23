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

    public static void calculatedSum(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма зарплат в месяц составляет = " + sum);
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
        System.out.println("Самая высокая зарплата у сотрудника - " + EmployeeWithMaxSalary + ", она составляет " + maximumSalary);
    }

}
