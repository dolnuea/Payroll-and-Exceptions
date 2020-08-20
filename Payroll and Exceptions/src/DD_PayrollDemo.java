/**
 * @author Dolunay Dagci
 * Date: 2.17.19
 * CISS 111-360
 * Asignment: Ch11 Payroll and Exceptions
 * This is a Demo class to test exceptions.
 */

import java.util.Scanner;

public class DD_PayrollDemo {


    /**
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int ID;
        double hourlyWage;
        double hours;

        DD_PayRoll employee = new DD_PayRoll(); //a default reference object of DD_Payroll Class to access it's methods

        /**
         * Enter name and check exceptions
         */
        System.out.println("Enter name please: ");
        name = scanner.next();
        try {
            if (name.equals(" ") || name.isEmpty()){
                throw new DD_EmptyStringException(); } else {
                employee.setEmployeeName(name); }
        }
        catch (DD_EmptyStringException e){
            System.out.println(e.getMessage());
            do {
                System.out.println("Try again");
                name = scanner.next();
            } while (name.equals(" ") || name.isEmpty());
            if (!(name.equals(" ") || name.isEmpty())) employee.setEmployeeName(name);}

        /**
         * Enter ID and check exceptions
         */
        System.out.println("Enter your ID number: ");
        ID = scanner.nextInt();
        try {
            if (ID <= 0) {
                throw new DD_InvalidIDException(); }
            else {
                employee.setID(ID); }
        }
        catch (DD_InvalidIDException e){
            System.out.println(e.getMessage());
            do {
                System.out.println("Try again");
                ID = scanner.nextInt();
            } while (ID <= 0);
            if (!(ID <= 0)) employee.setID(ID);
        }

        /**
         * Enter hours and check exceptions
         */
        System.out.println("How many hours do you work? ");
        hours = scanner.nextDouble();
        try {
            if (hours < 0 || hours > 84) {
                throw new DD_InvalidHoursException(); } else {
                employee.setHoursWorked(hours);
            }
        }
        catch (DD_InvalidHoursException e){
            System.out.println(e.getMessage());
            do {
                System.out.println("Try again");
                hours = scanner.nextDouble();
            } while (hours < 0 || hours > 84);
            if (!((hours < 0 || hours > 84))) employee.setHoursWorked(hours);}

        /**
         * Enter pay rate and check exceptions
         */
        System.out.println("Type in hourly pay rate please: ");
        hourlyWage = scanner.nextDouble();
        try {
            if (hourlyWage < 0 || hourlyWage > 25){
                throw new DD_InvalidWageException(); }
            else { employee.setPayRate(hourlyWage);}
        }
        catch (DD_InvalidWageException e){
            System.out.println(e.getMessage());
            do {
                System.out.println("Try again");
                hourlyWage = scanner.nextDouble();
            } while ((hourlyWage < 0 || hourlyWage > 25));
            if (!((hourlyWage < 0 || hourlyWage > 25))) employee.setPayRate(hourlyWage);}

        //Print employee info
        System.out.println(employee.toString());
    }
}

