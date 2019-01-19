package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

import java.util.Date;

/**Exercise number 2 line output and the current number
 * @author  Bruce Eckel
 * @version 4.0
 */

public class WorkOut15 extends HomeWork {

    /**
     * information workout
     */
    @Override
    protected void info() {
        System.out.println("Возьмите программу из упражнения 2 и добавьте к ней документация в коментариях." +
                "Извлеките эту документацию в HTML-файл с помощью javadoc и просмотрите полученную страницу в браузере");
    }

    /**
     * start project method
     */
    @Override
    protected void run() {
        System.out.println("Селям Алейкум");
        String name="Ibraim";
        testMethod(name);
        System.out.println(new Date());
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 15");
    }

    /**Method to output the name
     * @param name string parameter for name
     */
    private static void testMethod(String name){
        System.out.println(name+" Акьай");
    }

}
