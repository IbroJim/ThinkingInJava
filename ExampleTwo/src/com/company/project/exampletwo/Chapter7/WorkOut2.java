package com.company.project.exampletwo.Chapter7;

import com.company.project.exampletwo.Chapter7.music.Note;
import com.company.project.exampletwo.HomeWork;


public class WorkOut2 extends HomeWork {

    private static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    private static void tuneAll(Instrument[] e){
        for(Instrument i:e){
            tune(i);
        }
    }


    @Override
    protected void info() {
        System.out.println("Добавьте новый подтип Instrument в программу Music.java. Убедитесь в том, что полиформизм работает правильно и для этого нового типа");
    }

    @Override
    protected void run() {
    Instrument[] orchestra={new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind(),new Guitar()};
    tuneAll(orchestra);
    }

    @Override
    protected void nameProject() {
        System.out.println("2) Задание 7");
    }
    private class Instrument{
        void play(Note n){ System.out.println("Instrument play()"); }
        String what(){ return "Instrument";}
        void adjust(){ System.out.println("Adjusting Instrument"); }
    }
    private class Wind extends Instrument{
        @Override
        void play(Note n) {
            System.out.println("Wind.play()"+n);
        }

        @Override
        String what() {
            return "Wind";
        }

        @Override
        void adjust() {
            System.out.println("Adjusting Wind");
        }
    }
    private class Percussion extends Instrument{
        @Override
        void play(Note n) {
            System.out.println("Percussion.play()");
        }

        @Override
        String what() {
            return "Percussion";
        }

        @Override
        void adjust() {
            System.out.println("Adjusting Percussion");
        }
    }
    private class Stringed extends Instrument{
        @Override
        void play(Note n) {
            System.out.println("Stringed.play()");
        }

        @Override
        String what() {
            return "Stringed";
        }

        @Override
        void adjust() {
            System.out.println("Adjusting Stringed");;
        }
    }
    private class Brass extends Wind{
        @Override
        void play(Note n) {
            System.out.println("Brass.play()");
        }
        @Override
        void adjust() {
            System.out.println("Adjusting Bras");
        }
    }
    private class Woodwind extends Wind{
        @Override
        void play(Note n) {
            System.out.println("Woodwind.play()");
        }

        @Override
        String what() {
            return "Woodwind";
        }
    }
    private class Guitar extends Instrument{
        @Override
        void play(Note n) {
            System.out.println("Мой тип-Guitar.play()");
        }

        @Override
        String what() {
            return "Guitar";
        }

        @Override
        void adjust() {
            System.out.println("Adjusting Guitar");
        }
    }
}
