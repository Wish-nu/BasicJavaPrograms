package com.practice;
public class Main {
    private String name;

    public static void main (String args[]){
        String name;
        String colour;
        String breed;
        String origin;
        boolean canRun;
        Main dog = new Main();
        Main cat = new Main();

        dog.name = "Bruno";
        cat.name = "Tom";
        System.out.println(dog.name);
        System.out.println(cat.name);


    }

}

