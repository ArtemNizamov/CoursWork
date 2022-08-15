public class Main {
    private static final Employee[] employees = new Employee[10];


    public static void main(String[] args) {

        Employee emp1 = new Employee("Василий Владимирович Штраусов", 1, 120000);
        Employee emp2 = new Employee("Сергей Иванович Бурунов", 1, 160000);
        Employee emp3 = new Employee("Александр Григорьевич Гнилин", 1, 190000);
        Employee emp4 = new Employee("Альберт Муратович Шизгер", 2, 150000);
        Employee emp5 = new Employee("Евгений Васильевич Крюков", 2, 132000);
        Employee emp6 = new Employee("Владлен Маркович Альтшуллер", 2, 500000);
        Employee emp7 = new Employee("Артур Григорьевич Пирожков", 3, 124000);
        Employee emp8 = new Employee("Геннадий Ильич Ляпунов", 3, 182000);
        Employee emp9 = new Employee("Олег Сергеевич Хованов", 3, 110000);
        Employee emp10 = new Employee("Екатерина Леонидовна Ползова", 3, 230000);

        System.out.println("emp1 = " + emp1);

        System.out.println("emp2 = " + emp2);

        System.out.println("emp3 = " + emp3);

        System.out.println();

        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        employees[3] = emp4;
        employees[4] = emp5;
        employees[5] = emp6;
        employees[6] = emp7;
        employees[7] = emp8;
        employees[8] = emp9;
        employees[9] = emp10;

        System.out.println();

        printEmployees();

        System.out.println();

        System.out.println("Сумма всех зарплат сотрудников = " + calculateTotalSalary());

        System.out.println();

        System.out.println("Сотрудник с самой низкой зарплатой = " + findEmployeeWithMinSalary());

        System.out.println();

        System.out.println("Сотрудник с самой высокой зарплатой = " + findEmployeeWithMaxSalary());

        System.out.println();

        System.out.println("Средняя зарплата сотрудников = " + findEmployeeWithAverageSalary());

        System.out.println();

        printFullNamesOfEmployees();


    }
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static int findEmployeeWithAverageSalary() {
        int averageSalary = calculateTotalSalary() / employees.length;
        for (Employee employee : employees) {
        }
        return averageSalary;
    }
    public static void printFullNamesOfEmployees() {
        for (Employee employee : employees) {
            System.out.println("Имя сотрудника = " + employee.getFullName());
        }
    }
}