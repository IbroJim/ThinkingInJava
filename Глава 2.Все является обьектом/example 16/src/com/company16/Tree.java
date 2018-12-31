package com.company16;
//: object/Overloading

/**Example of method Tree
 * @author Brus Eckel
 */
public class Tree {
    int height;

    /**constructor
     *
     */
    Tree(){
        System.out.println("Сажаем росток");
        height=0;
    }

    /** constructor overload
     *
     * @param initialHeight
     */
    Tree(int initialHeight){
         height=initialHeight;
         System.out.println("Создание нового дерева высотой "+height+" м.");
    }

    /**
     *
     */
    void info(){
        System.out.println("Дерево высотой "+height+" м.");
    }

    /**overload method
     *
     * @param s
     */
    void info(String s){
        System.out.println(s+":Дерево высотой  "+height+" м.");
    }
}
