package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut16 extends HomeWork {

    @Override
    protected void info() {
        System.out.println("Найдите в главе 5 пример Overloading.java и добавьте в него коментарии javadoc." +
                "Преобразуйте их в страницу HTML и просмотрите ее в браузере");
    }

    @Override
    protected void run() {
        for(int i=0;i<5;i++){
            Tree t=new Tree(i);
            t.info();
            t.info("Перегруженный метод");
        }
        new Tree();
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 16");
    }

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
}
