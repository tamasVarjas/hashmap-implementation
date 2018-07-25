package com.codecool.hashmap;

import java.util.LinkedList;

public class HashMap {

    private int bucketSize = 16;
    private LinkedList<Element>[] elements = new LinkedList[bucketSize];

    public void add(String key, Integer value) {
        int position = getHash(key);
        LinkedList<Element> list = elements[position];

        for (Element element : list) {
            if (element.getKey().equals(key)) {
                throw new IllegalArgumentException("Key already exists!");
            }
        }
        Element newElement = new Element(key, value);
        list.add(newElement);
    }

    private int getHash(String key) {
        return key.hashCode() % bucketSize;
    }

}
