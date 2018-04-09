package com.gupaoedu.homework.prototype;

public class CloneSheep extends Sheep{
    public Object cloneSheep() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
