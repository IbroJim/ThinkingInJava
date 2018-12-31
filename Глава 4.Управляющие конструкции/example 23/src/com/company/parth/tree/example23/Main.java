package com.company.parth.tree.example23;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a=1,b=1,c=0;
        boolean check=true;
        Scanner scanner=new Scanner(System.in);
        int value=scanner.nextInt();
        while (check) {
                c = a + b;
                System.out.println(c);
                b=a;
                a=c;
                c=0;
                if(value==a){
                    check=false;
                }

        }
    }
}
