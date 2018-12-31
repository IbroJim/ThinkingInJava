package com.company15;

import java.util.Date;

/**Exercise number 2 line output and the current number
 * @author  Bruce Eckel
 * @version 4.0
 */
public class Main {
    /**The entry point to class and application
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        System.out.println("Селям Алейкум");
        String name="Ibraim";
        testMethod(name);
        System.out.println(new Date());
    }
    /**Method to output the name
     * @param name string parameter for name
     */
    private static void testMethod(String name){
        System.out.println(name+" Акьай");
    }

}
