public class Employee {
    private String firstName;
    private String patronymic;
    private String lastName;
    private int department;
    private int salary;
    private int id;
    private static int counter;


    public Employee(String firstName, String patronymic, String lastName, int department, int salary) {
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        id = 1 + counter++;//здесь можно оставить "id = counter++", но я не был уверен, что бывает id = 0
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Ф.И.О. сотрудника: " + firstName + " " + patronymic + " " + lastName + ", Отдел № " + department + ", заработная плата = " + salary + ", id =  " + id;
    }
}
