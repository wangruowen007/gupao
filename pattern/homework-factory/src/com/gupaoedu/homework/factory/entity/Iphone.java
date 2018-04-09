package com.gupaoedu.homework.factory.entity;

public class Iphone implements MobilePhone {
    @Override
    public String getBrand() {
        return "苹果";
    }

    @Override
    public void call() {
        System.out.println("使用苹果打电话");
    }

    @Override
    public void play() {
        System.out.println("使用苹果玩游戏");
    }
}
