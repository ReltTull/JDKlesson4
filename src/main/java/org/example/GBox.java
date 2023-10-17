package org.example;

public class GBox<T> {
    private T value;

    GBox(T val) {
        this.value = val;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void showType() {
        System.out.printf("Type is %s, value %s \\n", value.getClass().getName(), getValue());
    }
}
