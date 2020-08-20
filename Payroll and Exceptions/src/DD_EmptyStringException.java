/**
 * @author Dolunay Dagci
 * Date: 2.17.19
 * CISS 111-360
 * Asignment: Ch11 Payroll and Exceptions
 *Exception Handler for invalid name
 */

public class DD_EmptyStringException extends Exception {

    /**
     *
     * @param msg
     */
    public DD_EmptyStringException(String msg) {
        super("You have entered an empty string for name."+ msg);
    }

    public DD_EmptyStringException() {
        super("You have entered an empty string for name.");
    }
}
