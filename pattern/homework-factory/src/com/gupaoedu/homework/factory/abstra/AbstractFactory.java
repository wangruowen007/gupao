package com.gupaoedu.homework.factory.abstra;

import com.gupaoedu.homework.factory.entity.MobilePhone;

public abstract class AbstractFactory {
    /**
     * 获取苹果手机
     * @return
     */
    public abstract MobilePhone getIphone ();

    /**
     * 获取华为手机
     * @return
     */
    public abstract MobilePhone getHuaWei ();
}
