package com.gupaoedu.homework.singleton;

public class Weather {

    private Integer temperature = 20;

    private String wind = "NorthWest";

    private Weather(){}

    private static final Weather weather = new Weather();

    public static Weather getWeather() {
        return weather;
    }
}
