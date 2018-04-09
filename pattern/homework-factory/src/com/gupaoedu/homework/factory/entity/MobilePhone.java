package com.gupaoedu.homework.factory.entity;

/**
 * 手机接口
 * 所有品牌手机都要实现打电话和玩游戏功能
 */
public interface MobilePhone {
    public String getBrand ();
    public void call ();
    public void play ();
}
