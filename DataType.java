package com.datatype;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //int num = 1;
        int num1;
        float num2;
        char character;
        boolean bool;
        String word;
        double num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer value: ");
        num1 = sc.nextInt();


        System.out.println("Enter a floating value: ");
        num2 = sc.nextFloat();


        System.out.println("Enter your last grade at school: ");
        character = sc.next().charAt(0);

        System.out.println("Are you crazy? True or False? ");
        bool = sc.nextBoolean();


        System.out.println("Enter your nationality: ");
        word = sc.next();


        System.out.println("Enter a decimal value: ");
        num3 = sc.nextDouble();

        System.out.println("int -->" + num1);
        System.out.println("float -->" +num2);
        System.out.println("char -->" + character);
        System.out.println("boolean -->" + bool);
        System.out.println("String -->" + word);
        System.out.println("double -->" + num3);
    }
}
