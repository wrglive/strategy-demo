package com.sky.marshall.demo.strategy;

public class TigerAnimalStrategy extends BaseAnimalStrategy {

    @Override
    public void eat() {
        System.out.println("肉食主义者");
    }

    @Override
    public void sports() {
        System.out.println("捕猎就是运动");
    }
}
