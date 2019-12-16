package com.sky.marshall.demo.strategy;

/**
 * 策略基类, 用来维护通用的行为
 * @author live
 */
public abstract class BaseAnimalStrategy implements AnimalStrategy{
    @Override
    public void sleep() {
        System.out.println("动物都是一种睡觉方式");
    }
}
