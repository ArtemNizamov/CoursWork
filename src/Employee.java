public class Employee {
    public static int counter;
    public Integer id;
    public String fullName;
    public int department;
    public int salary;


    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }

    public String getFullName() {
        return fullName;
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
        return "Полное имя = " + fullName + '\'' +
                ", отдел = " + department + '\'' +
                ", зарплата = " + salary + '\'' +
                ", Id = " + id + '\'';
    }
}
