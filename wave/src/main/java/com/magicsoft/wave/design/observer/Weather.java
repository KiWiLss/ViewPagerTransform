package com.magicsoft.wave.design.observer;

/**
 * Created by 刘少帅 on 2017/11/14
 * 自定义的观察对象
 */

public class Weather {
    private String description;

    public Weather(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "description='" + description + '\'' +
                '}';
    }
}
