package com.gupaoedu.homework.strategy;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyyMMdd");
        Travel travel = new Travel("1",df.format(new Date()));

        travel.arrive(TrivalType.DRIVE);
    }
}
