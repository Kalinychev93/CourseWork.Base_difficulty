public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа. Базовая сложность.");
        System.out.println("");

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иван", "Федорович", "Крузенштерн", 1, 5000);
        employees[1] = new Employee("Лев", "Николаевич", "Толстой", 2, 3750);
        employees[2] = new Employee("Иван", "Сергеевич", "Тургенев", 3, 1800);
        employees[3] = new Employee("Петр", "Аркадьевич", "Столыпин", 4, 7800);
        employees[4] = new Employee("Анна", "Андреевна", "Ахматова", 5, 3300);

//      Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        System.out.println("Задание 8a. Все данные по сотрудникам:");
        EmployeeUtility.printAllEmployees(employees);
        System.out.println("");

//      Получить Ф. И. О. всех сотрудников (вывести в консоль).
        System.out.println("Задание 8f. Ф. И. О. всех сотрудников:");
        EmployeeUtility.printNames(employees);
        System.out.println("");

        EmployeeUtility.calculatedSum(employees);

        EmployeeUtility.findEmployeeWithMaximumSalary(employees);

    }
}