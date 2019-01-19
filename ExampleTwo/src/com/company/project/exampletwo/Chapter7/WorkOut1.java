package com.company.project.exampletwo.Chapter7;

import com.company.project.exampletwo.HomeWork;

public class WorkOut1 extends HomeWork {

    @Override
    protected void info() {
        System.out.println("Включите в базовый класс Shapes.java новый метод, выводящий сообщение, но не переопределяйте его в производных классах." +
                "Обьясните результат.  Переопределите его в одном из производгых классов и посмотрите, что происходит. Наконец, переопределите метод во всех производных");
    }

    @Override
    protected void run() {
        System.out.println("У нас есть клас Shape от которого наследуется 3 класса и в каждом из них переопределяется метод myNAme");
     Shape[] shapes=new Shape[]{new Circle(),new Square(),new Triangle()};
     for(int i=0;i<shapes.length;i++){
         shapes[i].myName();
     }
    }

    @Override
    protected void nameProject() {
        System.out.println("1) Задание 3");
    }
    private class Shape{
        public void myName(){
            System.out.println("Привет я фигура");
        }
    }
    private class Circle extends Shape{

        @Override
        public void myName() {
            System.out.println("Привет я круг");
        }
    }
    private class Square extends Shape{
        @Override
        public void myName() {
            System.out.println("Привет я квадрат");
        }
    }
    private class Triangle extends Shape{
        @Override
        public void myName() {
            System.out.println("Привет я треугольник");
        }
    }
}
