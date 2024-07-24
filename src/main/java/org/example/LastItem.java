package org.example;
import java.util.Scanner;
import java.util.ArrayList;


public class LastItem {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){
        System.out.println("Enter an item:  ");
        String item = sc.nextLine();
        if(item.isEmpty()) {
            break;
        }
        list.add(item);

    }
        if(!list.isEmpty()) {
        System.out.println("The last item in the list is:" + list.get(list.size()-1));
        } else {
            System.out.println("No items were entered Sunny Boy!");
        }
    }
}