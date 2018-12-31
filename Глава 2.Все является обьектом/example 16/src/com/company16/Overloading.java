package com.company16;

//: object/Overloading

/**Example of method overloading
 * @author Brus Eckel
 */
public class Overloading {

    /**
     * the entry point into the application
     * @param args array of string arguments
     */
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Tree t=new Tree(i);
            t.info();
            t.info("Перегруженный метод");
        }
        new Tree();
    }
}
