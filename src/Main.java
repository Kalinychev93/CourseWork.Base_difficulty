public class Main {
    public static void main(String[] args) {
        System.out.println("Курсовая работа. Базовая сложность.");
        System.out.println("");

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Иван", "Федорович", "Крузенштерн", 1, 25000);
        employees[1] = new Employee("Лев", "Николаевич", "Толстой", 2, 3750);
        employees[2] = new Employee("Иван", "Сергеевич", "Тургенев", 3, 27000);
        employees[3] = new Employee("Петр", "Аркадьевич", "Столыпин", 4, 7800);
        employees[4] = new Employee("Анна", "Андреевна", "Ахматова", 5, 3300);

//      Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        System.out.println("Задание 8a. Все данные по сотрудникам:");
        EmployeeUtility.printAllEmployees(employees);
        System.out.println("");

//      Посчитать сумму затрат на зарплаты в месяц.
        System.out.println("Задание 8b:");
        System.out.println("Сумма затрат на зарплаты в месяц = " + EmployeeUtility.calculatedSum(employees));
        System.out.println("");

//      Найти сотрудника с минимальной зарплатой.
        System.out.println("Задание 8c:");
        System.out.println(EmployeeUtility.findEmployeeWithMinimalSalary(employees));
        System.out.println("");

//      Найти сотрудника с максимальной зарплатой.
        System.out.println("Задание 8d:");
        EmployeeUtility.findEmployeeWithMaximumSalary(employees);
        System.out.println("");

//      Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        System.out.println("Задание 8e:");
        System.out.println("Среднее значение зарплаты = " + EmployeeUtility.findAverageSalary(employees));
        System.out.println("");

//      Получить Ф. И. О. всех сотрудников (вывести в консоль).
        System.out.println("Задание 8f. Ф. И. О. всех сотрудников:");
        EmployeeUtility.printNames(employees);
        System.out.println("");
    }
}