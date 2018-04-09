package com.gupaoedu.homework.factory.test;

import com.gupaoedu.homework.factory.abstra.AbstractFactory;
import com.gupaoedu.homework.factory.abstra.MobileFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new MobileFactory();
        factory.getHuaWei();
        factory.getIphone();
    }
}
