/**
 * @author Dolunay Dagci
 * Date: 2.17.19
 * CISS 111-360
 * Asignment: Ch11 Payroll and Exceptions
 *Exception Handler for invalid ID
 */
public class DD_InvalidIDException extends Exception {

    /**
     *
     * @param msg
     */
    public DD_InvalidIDException(String msg){
        super("Error: You have entered an invalid value for ID. ID cannot be 0 or negative number." + msg);
    }

    public DD_InvalidIDException(){
        super("Error: You have entered an invalid value for ID. ID cannot be 0 or negative number.");
    }
}
