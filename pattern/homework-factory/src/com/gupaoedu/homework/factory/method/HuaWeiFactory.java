package com.gupaoedu.homework.factory.method;

import com.gupaoedu.homework.factory.entity.HuaWei;
import com.gupaoedu.homework.factory.entity.MobilePhone;

public class HuaWeiFactory implements Factory{
    @Override
    public MobilePhone getMobile() {
        return new HuaWei();
    }
}
