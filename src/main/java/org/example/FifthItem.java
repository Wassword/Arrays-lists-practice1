package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listOfStrings = new ArrayList<>();


        //continously taking user input
       while (true) {
           System.out.println("Enter the string: ");
           String userInput = sc.nextLine();
           if (userInput.isEmpty()) {
               break; //exits the loop is user enters empty array
           }
           listOfStrings.add(userInput); //add input to user input list
       }
       //check if there are atleast 5 items in the list
        if (listOfStrings.size() >= 5) {
            System.out.println("The fifth item in the list is  " + listOfStrings.get(4));
        } else  {
            System.out.println("There were less than 5 items entered. ");

       }
    }
}
