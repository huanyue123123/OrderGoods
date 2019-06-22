package com.example.eurekafeign;

import java.util.ArrayList;
import java.util.List;

public class Apple {

    private String color;

    private Integer weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public static List<Apple> appleFilter(List<Apple> appleList, appleFilter appleFilter){
        List<Apple> resList = new ArrayList<Apple>();
        for (Apple apple:appleList) {
            if(appleFilter.accept(apple)){
                resList.add(apple);
            }
        }
        return resList;
    }

}
