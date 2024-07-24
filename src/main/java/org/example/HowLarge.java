package org.example;
import java.util.Scanner;
import java.util.ArrayList;


public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();


        while (true) {
            System.out.println("Enter a string: ");

            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            listOfStrings.add(input);
        }
        System.out.println("The total amount of items in the list was: " + listOfStrings.size());
    }
}
