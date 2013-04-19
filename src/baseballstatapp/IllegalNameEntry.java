/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballstatapp;

/**
 *
 * Exception used for assessing whether user entered an incorrect name
 * inside the form. Different and independent from a stat entry
 * 
 * @author Andy
 */
public class IllegalNameEntry extends Exception {

    private static final String ERR = "Invalid Name!";

    /**
     *
     */
    public IllegalNameEntry() {
        super(ERR);
    }

    /**
     *
     * @param ERR
     */
    public IllegalNameEntry(String ERR) {
        super(ERR);
    }

    /**
     *
     * @param ERR
     * @param thrwbl
     */
    public IllegalNameEntry(String ERR, Throwable thrwbl) {
        super(ERR, thrwbl);
    }

    /**
     *
     * @param thrwbl
     */
    public IllegalNameEntry(Throwable thrwbl) {
        super(thrwbl);
    }

    /**
     *
     * @param string
     * @param thrwbl
     * @param bln
     * @param bln1
     */
    public IllegalNameEntry(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    
    
}
