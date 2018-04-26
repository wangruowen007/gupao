package com.gupaoedu.homework.delegate;

public class TeammateB implements target {
    @Override
    public String houseWork(String command) {
        return "B的工作是"+command;
    }
}
