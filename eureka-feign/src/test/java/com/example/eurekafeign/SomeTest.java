package com.example.eurekafeign;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SomeTest {
    @Test
    public void Lambda(){
        List<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 100 ; i++) {
            Random ran = new Random();
            int x = ran.nextInt(2);
            String color = x == 1?"RED":"GREEN";
            Apple apple = new Apple();
            apple.setColor(color);
            apple.setWeight(ran.nextInt(100)+50);
            apples.add(apple);
        }
        apples.forEach((apple) -> System.out.println(apple.getWeight()));
        System.out.println("--------------------------------"+apples.size());

      /*  apples = Apple.appleFilter(apples,new appleFilter(){

            @Override
            public boolean accept(Apple apple) {
                if("RED".equals(apple.getColor()) && 100 < apple.getWeight()){
                    return  true;
                }
                return false;
            }
        });*/
        apples = Apple.appleFilter(apples,(Apple apple) -> "RED".equals(apple.getColor())&&100 < apple.getWeight());

        apples.forEach((apple) -> System.out.println(apple.getWeight()+apple.getColor()));


    }



    @Test
    public void lamT(){
        int res = lamTest((x) -> {x = x * 2; x++ ;return x;},10);
        System.out.println(res);
    }

    static int lamTest(LamIn lam,int x){
        return lam.lam(x);
    }
    static int x  = 155;

    @Test
    public void threadTest(){

    }


    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if (x > 100){
                        x -= 100;
                    }
                    System.out.println(x);
                }
            }
        });

        t1.start();
        System.out.println(t1.getName()+"启动了"+x);
        Thread t2 = new Thread(() -> {while(true){if (x < 100){x += 100;
            System.out.println(x);}System.out.println(x);}});
        t2.start();
        System.out.println(t2.getName()+"启动了"+x);
    }


}
