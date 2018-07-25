package com.codecool.hashmap;

import java.util.Arrays;
import java.util.LinkedList;

import static java.lang.Math.abs;

public class HashMap {

    private int bucketSize = 16;
    private LinkedList<Element>[] elements = new LinkedList[bucketSize];

    public HashMap() {
        for (int i = 0; i < bucketSize; i++) {
            elements[i] = new LinkedList<>();
        }
    }

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

    public Integer getValue(String key) {
        int position = getHash(key);
        LinkedList<Element> list = elements[position];

        for (Element element : list) {
            if (element.getKey().equals(key)) {
                return element.getValue();
            }
        }
        throw new IllegalArgumentException("No element with specified key!");
    }

    private int getHash(String key) {
        return abs(key.hashCode() % bucketSize);
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(elements) + "}";
    }

}
