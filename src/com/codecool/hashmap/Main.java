package com.codecool.hashmap;

public class Main {

    public static void main(String[] args) {
        System.out.println("Initializing HashMap...");
        HashMap hashMap = new HashMap();
        System.out.println(hashMap + "\n");

        System.out.println("Filling HashMap...");
        hashMap.add("potato", 5);
        hashMap.add("carrot", 3);
        hashMap.add("apple", 1);
        hashMap.add("beet", 2);
        hashMap.add("strawberry", 8);
        hashMap.add("peach", 4);
        hashMap.add("tomato", 3);
        hashMap.add("pepper", 6);
        hashMap.add("zucchini", 10);
        hashMap.add("radish", 13);
        hashMap.add("avocado", 1);
        hashMap.add("mango", 0);
        hashMap.add("apricot", 5);
        hashMap.add("blackberry", 8);
        System.out.println(hashMap + "\n");

        System.out.println("Getting 'strawberry'...");
        System.out.println("strawberry: " + hashMap.getValue("strawberry") + "\n");

        hashMap.remove("pepper");
        System.out.println("Removing 'pepper'...");
        System.out.println("Element 'pepper' successfully removed.");
        System.out.println(hashMap + "\n");

        hashMap.clearAll();
        System.out.println("Clearing HashMap...");
        System.out.println("Successfully cleared HashMap.");
        System.out.println(hashMap);
    }

}
