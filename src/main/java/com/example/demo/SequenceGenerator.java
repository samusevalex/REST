package com.example.demo;

public class SequenceGenerator {

    private long value = 1;

    public long getNext(){
        return value++;
    }
}
