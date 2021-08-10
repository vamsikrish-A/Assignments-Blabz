package com.vamsi.empwage;

import java.util.Random;

public class EmwageUC3 {
    public static void main(String[] args) {
        // Constants
        int Is_Part_Time = 1;
        int Is_Full_Time = 2;
        int Emp_Rate_per_Hour = 20;
        // Variables
        int empHrs = 0;
        int empWage = 0;
        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == Is_Part_Time)
            empHrs = 4;
        else if (empCheck == Is_Full_Time)
            empHrs = 8;
        else
            empHrs = 0;

        empWage = empHrs * Emp_Rate_per_Hour;
        System.out.println("Emp Wage: " + empWage);
    }
}


