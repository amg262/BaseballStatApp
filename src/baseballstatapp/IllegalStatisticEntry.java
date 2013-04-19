/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package baseballstatapp;

/**
 *
 * Custom exception thrown when user enters a value that is not conducive to
 * being a legitimate statistic. Whether its NaN, or its range is too large, or
 * its null or empty
 * 
 * @author Andy
 */
public class IllegalStatisticEntry extends IllegalArgumentException {

    /**
     *
     */
    public static final String ERR = "Invalid Stat Entry!";

    /**
     *
     */
    public IllegalStatisticEntry() {
        super(ERR);
    }

    /**
     *
     * @param ERR
     */
    public IllegalStatisticEntry(String ERR) {
        super(ERR);
    }

    /**
     *
     * @param ERR
     * @param thrwbl
     */
    public IllegalStatisticEntry(String ERR, Throwable thrwbl) {
        super(ERR, thrwbl);
    }

    /**
     *
     * @param thrwbl
     */
    public IllegalStatisticEntry(Throwable thrwbl) {
        super(thrwbl);
    }
    
    
}
