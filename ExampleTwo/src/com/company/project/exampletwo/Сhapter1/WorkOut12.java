package com.company.project.exampletwo.Сhapter1;

import com.company.project.exampletwo.HomeWork;

import java.util.Date;

public class WorkOut12 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("Найдите вторую версию пирограммы HelloDate.java, представляющую пример простой документации в коментарияхю" +
                "Выполните команду javadoc  для этого файла и просмотрите результаты в браузере.");
    }

    @Override
    protected void run() {
        System.out.println("Нужно запускать в javadoc");
    }

    @Override
    protected void nameProject() {
        System.out.println("Задание 12");
    }

    /**Первая программа пример книги
     * Выводит строку и текущее число
     * @author Brus Eckel
     * @author www.MindView.net
     * version 4.0
     */
    static class HelloDate{
        /** Точка входа в класс приложения
         * @param args Массив строковых аргументов
         */
        public static void main(String[] args){
            System.out.println("Привет, сегодня; ");
            System.out.println(new Date());
        }
    }
}
