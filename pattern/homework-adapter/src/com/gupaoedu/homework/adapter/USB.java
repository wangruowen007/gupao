package com.gupaoedu.homework.adapter;

public class USB {
    public void connect() {
        System.out.println("连接成功");
    }

    public Data tramsfer(String type) {
        return new Data(type);
    }
}
