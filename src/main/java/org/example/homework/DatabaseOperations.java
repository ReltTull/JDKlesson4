package org.example.homework;

public interface DatabaseOperations <T> {
    void save(T data);
    void delete(int id);
    T read(int id);
}
