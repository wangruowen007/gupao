package com.gupaoedu.homework.factory.abstra;

import com.gupaoedu.homework.factory.entity.MobilePhone;
import com.gupaoedu.homework.factory.method.HuaWeiFactory;
import com.gupaoedu.homework.factory.method.IphoneFactory;

public class MobileFactory extends AbstractFactory {
    @Override
    public MobilePhone getIphone() {
        return new IphoneFactory().getMobile();
    }

    @Override
    public MobilePhone getHuaWei() {
        return new HuaWeiFactory().getMobile();
    }
}
