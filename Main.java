package org.example;
public class Main {
    
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Doe", "1980-01-01", 1000),
                new Employee("Jane Smith", "1990-05-15", 1000),
                new Manager("Mike Johnson", "1975-12-31", 5000)
        };

        System.out.println("Исходная зарплата сотрудников:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }

        Manager.increaseSalary(employees);

        System.out.println("\nЗарплата сотрудников после повышения:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }
}