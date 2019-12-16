package com.sky.marshall.demo.strategy;

/**
 * 这里用的是反射获取到实例, 日常开发当然也可托管给spring  用注入bean的方式去获取 实例.
 *
 * @author Live
 */
public class Main {
    public static void main(String[] args) throws Exception {
        run(AnimalEnum.ELEPHANT);
        run(AnimalEnum.TIGER);
    }

    private static void run(AnimalEnum animalEnum) throws Exception {
        final AnimalStrategy animalStrategy = AnimalFactory.newInstance(animalEnum);

        animalStrategy.eat();
        animalStrategy.sleep();
        animalStrategy.sports();
    }
}
