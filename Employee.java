package org.example;

import java.util.Arrays;

class Employee {
    private String name;
    private String dateOfBirth;
    int salary;

    public Employee(String name, String dateOfBirth, int salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public int compareDates(String date1, String date2) {
        String[] parts1 = date1.split("-");
        String[] parts2 = date2.split("-");

        int year1 = Integer.parseInt(parts1[0]);
        int month1 = Integer.parseInt(parts1[1]);
        int day1 = Integer.parseInt(parts1[2]);

        int year2 = Integer.parseInt(parts2[0]);
        int month2 = Integer.parseInt(parts2[1]);
        int day2 = Integer.parseInt(parts2[2]);

        if (year1 != year2) {
            return Integer.compare(year1, year2);
        } else if (month1 != month2) {
            return Integer.compare(month1, month2);
        } else {
            return Integer.compare(day1, day2);
        }
    }
}