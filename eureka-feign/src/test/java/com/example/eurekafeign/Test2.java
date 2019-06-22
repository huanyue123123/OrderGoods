package com.example.eurekafeign;

import com.example.eurekafeign.weather.ArrayOfString;
import com.example.eurekafeign.weather.WeatherWebService;
import com.example.eurekafeign.weather.WeatherWebServiceSoap;
import org.junit.Test;

import java.util.List;

public class Test2 {

    @Test
    public void someTest(){

        WeatherWebService weatherWebService = new WeatherWebService();
        WeatherWebServiceSoap weatherWebServiceSoap = weatherWebService.getWeatherWebServiceSoap();
        ArrayOfString array = weatherWebServiceSoap.getWeatherbyCityName("天津");

        List<String> list = array.getString();
        int i = 0;
        for(String str:list){
            System.out.println(i++ + ": "+ str);
        }





    }
}
