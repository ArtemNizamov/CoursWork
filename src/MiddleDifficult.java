public class MiddleDifficult {
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

        increaseSalary(20);
        System.out.println("Максимальная зарплата в первом отделе = " + findMaxSalaryEmployeeOfTeam(1));
        System.out.println("Минимальная зарплата во втором отделе = " + findMinSalaryEmployeeOfTeam(2));
        System.out.println("Средняя зарплата по третьем отделу = " + CalculateAverageSalaryOfTeam(3));
        System.out.println("Общая зарплата сотрудников во втором отделе = " + CalculateTotalSalaryOfTeam(2));
        increaseSalaryOfTeam(2, 50);
        System.out.println("Минимальная зарплата во втором отделе = " + findMinSalaryEmployeeOfTeam(2));
        printTeam(2);

        employeeMinSalaryOfNumber(200000);

        System.out.println();

        employeeMaxSalaryOfNumber(120000);


    }

    public static void increaseSalary(int percent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }

    public static Employee findMinSalaryEmployeeOfTeam(int teamNumber) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != teamNumber) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findMaxSalaryEmployeeOfTeam(int teamNumber) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartment() != teamNumber) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static int CalculateTotalSalaryOfTeam(int teamNumber) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static int CalculateAverageSalaryOfTeam(int teamNumber) {
        int membersCount = 0;
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                sum += employee.getSalary();
                membersCount++;
            }
        }
        return (int) (sum / (float) membersCount);
    }

    public static void increaseSalaryOfTeam(int teamNumber, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }

    public static void printTeam(int teamNumber) {
        for (Employee employee : employees) {
            if (employee.getDepartment() == teamNumber) {
                System.out.println("Имя сотрудника = " + employee.getFullName());
            }
        }
    }

    public static void employeeMinSalaryOfNumber(int minSalary) {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                result = employee;
                System.out.println("employee = " + employee);
            }
        }
    }
    public static void employeeMaxSalaryOfNumber(int maxSalary) {
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getSalary() >= maxSalary) {
                result = employee;
                System.out.println("employee = " + employee);
            }
        }
    }
}