package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter numbers: ");
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            integers.add(input);

        }
        int sum = 0;
        for (int i = 0; i < integers.size(); i++) {
            sum += integers.get(i);
            System.out.println("sum of this list: " + sum);
        }
    }
}


