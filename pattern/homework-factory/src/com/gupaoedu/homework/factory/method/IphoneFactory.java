package com.gupaoedu.homework.factory.method;

import com.gupaoedu.homework.factory.entity.Iphone;
import com.gupaoedu.homework.factory.entity.MobilePhone;

public class IphoneFactory implements Factory {

    @Override
    public MobilePhone getMobile() {
        return new Iphone();
    }
}
