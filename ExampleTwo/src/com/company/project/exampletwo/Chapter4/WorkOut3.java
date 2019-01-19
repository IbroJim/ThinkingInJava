package com.company.project.exampletwo.Chapter4;

import com.company.project.exampletwo.HomeWork;

public class WorkOut3 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Измените предыдущее упражнение так, чтобы метод finalize обязательно был исполнен");
    }

    @Override
    protected void run() {
        new Book(true);
        System.gc();
    }

    @Override
    protected void nameProject() {
        System.out.println("3) Задание 11");
    }

    class Book{
        boolean checkedOut=false;
        Book(boolean checkOut){
            checkedOut=checkOut;
        }

        void checkIn(){
            checkedOut=false;
        }

        public void finalize(){
            if(checkedOut){
                System.out.println("Ошибка: checkOut");
            }
        }
    }
}
