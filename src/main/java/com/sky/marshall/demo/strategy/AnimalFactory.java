package com.sky.marshall.demo.strategy;

public class AnimalFactory {
    private AnimalFactory() {
    }

    public static AnimalStrategy newInstance(AnimalEnum animalEnum) throws Exception {
        final Class<?> aClass = Class.forName(animalEnum.getClassName());
        final AnimalStrategy animalStrategy = (AnimalStrategy) aClass.newInstance();
        return animalStrategy;
    }
}
