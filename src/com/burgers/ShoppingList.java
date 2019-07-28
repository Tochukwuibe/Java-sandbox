package com.burgers;

import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<String> list;

    public ShoppingList() {
        this.list = new ArrayList<String>();
    }


    public void addItem(String item) {
        this.list.add(list.size(), item);
    }

    public void removeItem(String item){
        removeItem(list.indexOf(item));
    }

    public boolean hasItem(String item) {
        return list.contains(item);
    }


    public String removeItem(int index) {
        if(index >= 0 && index < list.size()) return list.remove(index);
        return null;
    }

    public void setItem (int index, String item) {
        list.set(index, item);
    }

    public String get(int index) {
        if(index >= list.size()) return null;
        return list.get(index);
    }

    public String get(String item) {

        int index = list.indexOf(item);
        if(index >= 0) return get(index);

        return null;
    }






    public void print() {

        System.out.println("You have " + list.size() + " in your shopping list");

        int index = 1;
        for (String str: list) {
            System.out.println(index + ") " + str);
        }
    }






}
