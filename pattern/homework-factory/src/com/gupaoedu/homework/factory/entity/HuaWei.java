package com.gupaoedu.homework.factory.entity;

public class HuaWei implements MobilePhone {

    @Override
    public String getBrand() {
        return "华为";
    }

    @Override
    public void call() {
        System.out.println("用华为打电话");
    }

    @Override
    public void play() {
        System.out.println("用华为玩游戏");
    }
}
