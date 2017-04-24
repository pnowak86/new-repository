package com.myapp;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Hello Wordlna!");
        String a = "88.8";
        String b = "235";
        int c = 13;

        double acc = -9.81;
        double time = 10;
        double velo = 1;
        double posi = 8.0;

        double gravity = (0.5*acc*(time*time)) + (velo*time) +posi;

        System.out.println(gravity);

    }

    public static void calculatePosition()
    {





    }
}
