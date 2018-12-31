package com.company.parth;

public class Main {
    static void  f(Letter f){
        f.a=10.2f;
    }
    public static void main(String[] args) {
	Letter letter=new Letter();
	letter.a=10.1f;
        System.out.println(letter.a);
	f(letter);
        System.out.println(letter.a);

    }
}
