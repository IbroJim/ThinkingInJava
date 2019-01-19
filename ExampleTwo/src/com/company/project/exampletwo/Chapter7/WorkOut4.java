package com.company.project.exampletwo.Chapter7;

import com.company.project.exampletwo.HomeWork;

public class WorkOut4 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Измените упражнения 12 так, чтобы один из встроенных обьектов был общим и для него использовался подсчет ссылок. Пакажите, что он правильно работает");
    }

    @Override
    protected void run() {
    Rodent[] rodents=new Rodent[]{new Mouse(),new Hamster(),new Hamster()};
    for(Rodent rodent:rodents){
        rodent.myName();
    }
    }

    @Override
    protected void nameProject() {
        System.out.println("4) Задание 15");
    }

    private static class Rodent{
        public void myName(){

        }
        public void  myAge(int i){

        }
    }
    private static class Mouse extends Rodent{
        private static int count=0;

        Mouse(){
            System.out.println("Мышь "+count+" была создана");
        }
        @Override
        public void myName() {
            System.out.println("Привет меня зовут мышь"+count);
        }

        @Override
        public void myAge(int i) {
            System.out.println("Мне "+i+" месяца");
        }
    }
    private static class Hamster extends Rodent{
        static int count=0;
        Hamster(){
            System.out.println("хомяк "+count+" был создана");
        }

        @Override
        public void myName() {
            System.out.println("Привет меня зовут хомяк"+count);
        }

        @Override
        public void myAge(int i ){
            System.out.println("Мне "+i+" годв");
        }
    }
}
