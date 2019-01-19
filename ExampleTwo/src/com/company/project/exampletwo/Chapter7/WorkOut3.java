package com.company.project.exampletwo.Chapter7;

import com.company.project.exampletwo.HomeWork;

public class WorkOut3 extends HomeWork {


    @Override
    protected void info() {
        System.out.println("Включите класс Pickle в программу Sandwich.java");
    }

    @Override
    protected void run() {
  new Sandwich();
    }

    @Override
    protected void nameProject() {
        System.out.println("3) Задание 11");
    }
    private class Meal{
        Meal(){
            System.out.println("Meal");
        }
    }
    private class Bread{
        Bread(){
            System.out.println("Bread");
        }
    }
    private class Pickle{
        Pickle(){
            System.out.println("Pickle");
        }
    }
    private class Fish extends Pickle{
        Fish(){
            System.out.println("Fish");
        }
    }
    private class Cheese{
        Cheese(){
            System.out.println("Cheese");
        }
    }
    private class Lettuce{
        Lettuce(){
            System.out.println("Lettuce");
        }
    }
    private class Lunch extends Meal{
        Lunch(){
            System.out.println("Lunch");
        }
    }
    private class Portatable extends Lunch{
        Portatable(){
            System.out.println("Portatable");
        }
    }
    private class Sandwich extends Portatable{
        Bread bread=new Bread();
        Fish fish=new Fish();
        Cheese cheese=new Cheese();
        Lettuce lettuce=new Lettuce();
    }
}
