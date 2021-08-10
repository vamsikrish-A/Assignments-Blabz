package com.vamsi.empwage;

public class wageformonthUC5 {
    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int Emp_Rate_per_hour = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;

    public static void main(String[] args) {
        // Variables
        int empHrs = 0, empWage = 0, totalEmpWage = 0;
        // Computation
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case Is_Part_Time:
                    empHrs = 4;
                    break;
                case Is_Full_Time:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * Emp_Rate_per_hour;
            totalEmpWage += empWage;
            System.out.println("emp Wage" + empWage);
        }
        System.out.println("Total Emp Wages:"+ totalEmpWage);
    }
}
