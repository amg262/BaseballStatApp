/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballstatapp;

/**
 *
 * Custom exception class that will be prompt when user enters invalid
 * login information, whether its user or password
 * 
 * @author Andy
 */
public class IllegalLoginException extends Exception {

    private static final String ERR = "Invalid Login";
    
    /**
     *
     */
    public IllegalLoginException() {
        super(ERR);
    }

    /**
     *
     * @param ERR
     */
    public IllegalLoginException(String ERR) {
        super(ERR);
    }

    /**
     *
     * @param ERR
     * @param thrwbl
     */
    public IllegalLoginException(String ERR, Throwable thrwbl) {
        super(ERR, thrwbl);
    }

    /**
     *
     * @param thrwbl
     */
    public IllegalLoginException(Throwable thrwbl) {
        super(thrwbl);
    }
    
}
