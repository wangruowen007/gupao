package com.gupaoedu.homework.delegate;

public class TeammateA implements target {
    @Override
    public String houseWork(String command) {
        return "A的工作是"+command;
    }
}
