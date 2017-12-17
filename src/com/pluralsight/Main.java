package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Starting number: ");

        int n = keyboard.nextInt();
        int count = 1;
        int highest = 0;

        System.out.print(n + "\t");

        while (n != 1) {
            if ( n % 2 == 0 ){
                n = n / 2;
            }
            else {
                n = (n * 3) + 1;
            }
            if (n > highest){
                highest = n;
            }
        count++;
        System.out.print(n + "\t");
        }
        System.out.println();
        System.out.println("There are a total of " + count + " numbers in this response");
        System.out.println("The highest number in this response is " + highest);

    }
}
