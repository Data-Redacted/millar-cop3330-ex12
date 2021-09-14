package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 hudson millar
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Enter the principal" );
        int pr = scan.nextInt();

        System.out.println( "Enter the rate" );
        float rate = scan.nextFloat();

        System.out.println( "Enter the num of years" );
        int yr = scan.nextInt();

        double in = rate*pr*yr*.01;
        System.out.println("The investment will be worth "+String.format("%.2f", (pr+in)));
    }
}
