package org.example;
import java.util.Scanner;
import java.util.ArrayList;


public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter an integer: ");

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            integers.add(num);
        }
        System.out.println("Done entering into the list ");
        System.out.println("What numbers are you looking for in this list");
        int number = sc.nextInt();

        if (integers.contains(number)) {
            System.out.println( number + " is at index of " + integers.indexOf(number));

        } else {
            System.out.println(number + " is not in the list.. Toodaloo!! ");
        }


    }

}
