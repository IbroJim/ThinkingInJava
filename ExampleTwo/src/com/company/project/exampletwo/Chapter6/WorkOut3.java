package com.company.project.exampletwo.Chapter6;

import com.company.project.exampletwo.HomeWork;

public class WorkOut3 extends HomeWork {
    @Override
    protected void info() {
        System.out.println("Измените пример Detergent.java, чтобы в нем использовалось делегирование");
    }

    @Override
    public void run() {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        detergent.toString();
    }

    @Override
    protected void nameProject() {
        System.out.println("3) Задание 11");
    }

  private   class Cleanser{
         private String s="Cleanser";
         public void append(String a){ s+=a;
             System.out.println(s);}
         public void dilute(){append("dilute()");}
         public void apply(){append("apply ()");}
         public void scrub(){append("scrub()");}
      @Override
      public String toString() {
          return s;
      }
    }

   private class Detergent{
        private Cleanser cleanser=new Cleanser();

        public void scrub(){
            cleanser.scrub();
            cleanser.append("Detergent.scrub");
        }
        public void foam(){
            cleanser.append("foam()");
        }
        public void dilute(){
            cleanser.dilute();
        }
        public void apply(){
            cleanser.apply();
        }

   }

}
