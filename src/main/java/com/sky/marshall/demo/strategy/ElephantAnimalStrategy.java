package com.sky.marshall.demo.strategy;

public class ElephantAnimalStrategy extends BaseAnimalStrategy{

    @Override
    public void eat() {
        System.out.println("食草的");
    }

    @Override
    public void sports() {
        System.out.println("散步");
    }
}
