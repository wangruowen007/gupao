package com.gupaoedu.homework.delegate;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher implements target{
    private Map<String,target> map;

    {
        map = new HashMap<>();
        map.put("做饭",new TeammateA());
        map.put("扫地",new TeammateB());
    }

    @Override
    public String houseWork(String command) {
        return map.get(command).houseWork(command);
    }
}
