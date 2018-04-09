package com.gupaoedu.homework.factory.method;

import com.gupaoedu.homework.factory.entity.MobilePhone;

/**
 * 工厂接口
 * 实现标准化生产
 */
public interface Factory {
    MobilePhone getMobile();
}
