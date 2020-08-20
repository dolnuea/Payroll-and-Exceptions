/**
 * @author Dolunay Dagci
 * Date: 2.17.19
 * CISS 111-360
 * Asignment: Ch11 Payroll and Exceptions
 * Exception Handler for invalid hours
 */
public class DD_InvalidHoursException extends Exception {

    /**
     *
     * @param msg
     */
    public DD_InvalidHoursException(String msg){
        super("Error: An invalid number is given to number of hours worked. You cannot enter a negative number for hours worked. Hours worked is not allowed to be greater than 84." + msg);
    }
    public DD_InvalidHoursException(){
        super("Error: An invalid number is given to number of hours worked. You cannot enter a negative number for hours worked. Hours worked is not allowed to be greater than 84.");
    }

}
