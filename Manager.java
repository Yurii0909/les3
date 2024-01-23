package org.example;
class Manager extends Employee {
    public Manager(String name, String dateOfBirth, int salary) {
        super(name, dateOfBirth, salary);
    }

    public static void increaseSalary(Employee[] employees) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.salary *= 2;
            }
        }
    }
}