package org.example.seminar;

import java.io.*;

public class MySerializableInputStream implements Serializable {
    private transient InputStream inputStream;

    public MySerializableInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        this.inputStream = new FileInputStream("example.txt");
    }
}