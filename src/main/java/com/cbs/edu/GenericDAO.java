package com.cbs.edu;

public interface GenericDAO<K, T> {

    void add(T t);

    T getElementById(K key);

}
