package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

public class WorkOut13 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Запустите программы Documentation1.java, Documentation2.java и Documentation3.java в javadoc." +
                "Прсомотрите результате в браузере");
    }

    @Override
    protected void run() {
        System.out.println("Нужно запускать в javadoc");

    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 13");
    }

    /** review to the class*/
    public class Documentation1 {

        /**a comment to a variable*/
        public int i;

        /**a comment to a method*/
        public void f(){};
    }

    /**
     * <pre>
     *  System.out.println(new Date());
     * </pre>
     */
    public class Documentation2 {

    }
    /**
     * possible <em> even </em> insert list
     * <ol>
     *  <li>Paragraph one
     *  <li>Paragraph two
     *  <li>Paragraph three
     * </ol>
     */
    public class Documentation3 {


    }
}
