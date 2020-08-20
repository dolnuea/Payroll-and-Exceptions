/**
 * @author Dolunay Dagci
 * Date: 2.17.19
 * CISS 111-360
 * Asignment: Ch11 Payroll and Exceptions
 *  Payroll class from chapter 6
 */
public class DD_PayRoll {

    String employeeName;
    int ID;
    double payRate; //hourly
    double hoursWorked;
    double federalTax = 0.12; //federal income tax rate %12
    double stateTax = 0.04; //state income tax rate  %4

    /**
     * Constructor
     * @param employeeName
     * @param ID
     */
    public DD_PayRoll(String employeeName, int ID) {
        this.employeeName = employeeName;
        this.ID = ID;
    }

    /**
     * Default Constructor
     */
    public DD_PayRoll() {
        employeeName = null;
        ID = 0;
        payRate = 0;
        hoursWorked = 0;
        federalTax = 0;
        stateTax = 0;
    }

    //Methods

    /**
     *
     * @return gross pay
     */
    public double grossPay() {
        return payRate * hoursWorked;
    }

    /**
     *
     * @return pay after taxes
     */
    public double payAfterTaxes() { //pay after deductions
        double federalTaxes = federalTax * grossPay();
        double stateTaxes = stateTax * grossPay();
        double deduction = stateTaxes + federalTaxes;
        return grossPay() + deduction;
    }


    //Getter Setter

    /**
     *
     * @return employee's name
     */
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    /**
     *
     * @return ID number
     */
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     *
     * @return hourly pay rate
     */
    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    /**
     *
     * @return hours worked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     *
     * @return federal tax
     */
    public double getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(double federalTax) {
        this.federalTax = federalTax;
    }

    /**
     *
     * @return state tax
     */
    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        this.stateTax = stateTax;
    }

    @Override
    public String toString() {
        return "Name: " + getEmployeeName() + "\nID: " + getID() + "\nHours Worked: " + getHoursWorked()+ "\nHourly Pay Rate: " + getPayRate() + "\nTotal Pay: " + payAfterTaxes();
    }
}
