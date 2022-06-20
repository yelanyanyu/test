package com.homework03;

import java.util.*;

/**
 * @author yelanyanyu@zjxu.edu.cn
 * @version 1.0
 */
public class DAO<T> {
    Map<String, T> map;

    public DAO() {
        map = new HashMap<>();
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        Set<Map.Entry<String, T>> entries = map.entrySet();
        ArrayList<T> ts = new ArrayList<>();
        for (Map.Entry<String, T> entry : entries) {
            T value = entry.getValue();
            ts.add(value);
        }
        return ts;
    }

    public void delete(String id) {
        map.remove(id);
    }
}
