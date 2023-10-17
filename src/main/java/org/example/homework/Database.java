package org.example.homework;

import java.util.ArrayList;
import java.util.List;

public class Database <T> implements DatabaseOperations <T> {
    private List<T> dataStorage = new ArrayList<>();
    @Override
    public void save(T data) {
        dataStorage.add(data);
    }

    @Override
    public void delete(int id) {
        dataStorage.remove(id);
    }

    @Override
    public T read(int id) {
        return dataStorage.get(id);
    }
}
