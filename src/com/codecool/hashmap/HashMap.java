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
        var list = elements[position];

        for (var element : list) {
            if (element.getKey().equals(key)) {
                throw new IllegalArgumentException("Key already exists!");
            }
        }
        var newElement = new Element(key, value);
        list.add(newElement);
    }

    public Integer getValue(String key) {
        int position = getHash(key);
        var list = elements[position];

        for (var element : list) {
            if (element.getKey().equals(key)) {
                return element.getValue();
            }
        }
        throw new IllegalArgumentException("No element with specified key!");
    }

    public void remove(String key) {
        int position = getHash(key);
        var list = elements[position];

        for (var element : list) {
            if (element.getKey().equals(key)) {
                list.remove(element);
                return;
            }
        }
        throw new IllegalArgumentException("No element with specified key!");
    }

    public void clearAll() {
        for (var list : elements) {
            list.clear();
        }
    }

    private int getHash(String key) {
        return abs(key.hashCode() % bucketSize);
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(elements) + "}";
    }

}
