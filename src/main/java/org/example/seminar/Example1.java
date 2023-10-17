package org.example.seminar;

import java.io.InputStream;
import java.io.Serializable;

public class Example1 <T extends Comparable, V extends InputStream & Serializable, K extends Number> {
    private T type;
    private V val;
    private K key;
    Example1(T type, V value, K key) {
        this.type = type;
        this.val = value;
        this.key = key;
    }

    public T getType() {
        return type;
    }
    public V getVal() {
        return val;
    }
    public K getKey() {
        return key;
    }

    public void showClassT() {
        System.out.println(type.getClass().getName());
    }
    public void showClassV() {
        System.out.println(val.getClass().getName());
    }
    public void showClassK() {
        System.out.println(key.getClass().getName());
    }
}
