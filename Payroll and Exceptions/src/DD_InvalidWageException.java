/**
 * @author Dolunay Dagci
 * Date: 2.17.19
 * CISS 111-360
 * Asignment: Ch11 Payroll and Exceptions
 *Exception Handler for invalid pay rate
 */
public class DD_InvalidWageException extends Exception {

    /**
     *
     * @param msg
     */
    public DD_InvalidWageException(String msg){
        super("Error: An invalid number is given to hourly pay rate. You cannot enter a negative number or a value greater than 25." + msg);
    }

    public DD_InvalidWageException(){
        super("Error: An invalid number is given to hourly pay rate. You cannot enter a negative number or a value greater than 25.");
    }
}
