package com.vamsi.empwage;

public class EmpWageUC6 {
    public static final int Is_Part_Time = 1;
    public static final int Is_Full_Time = 2;
    public static final int Emp_Rate_per_hour = 20;
    public static final int NUM_OF_WORKING_DAYS = 2;
    public static final int Max_Hrs_In_Month = 10;

    public static void main(String[] args) {
        // Variables
        int empHrs = 0, totalempHrs = 0, totalWorkingDays = 0;
        // Computation
        while(totalempHrs <= Max_Hrs_In_Month && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
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
            totalempHrs += empHrs;
            System.out.println("Days#: " +totalWorkingDays + " Emp Hr:" +empHrs);
        }
        int totalEmpWage = totalempHrs * Emp_Rate_per_hour;
        System.out.println("Total Emp Wages:"+ totalEmpWage);
    }

}
