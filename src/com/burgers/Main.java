package com.burgers;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    private static ShoppingList getArrayList() {
        ShoppingList list = new ShoppingList();


        while (true) {
            System.out.println("Please enter an item (press q to stop)");
            String line = scanner.nextLine();

            if(line.toLowerCase().equals("q")) break;
            list.addItem(line);

        }

        return list;
    }








    public static void main(String args[]) {
      MobilePhone p = new MobilePhone();
      p.start();
    }

}
