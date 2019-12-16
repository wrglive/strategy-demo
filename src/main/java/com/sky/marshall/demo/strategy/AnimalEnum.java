package com.sky.marshall.demo.strategy;

/**
 * 维护策略的枚举.
 * @author live
 */
public enum AnimalEnum {

    ELEPHANT(1, "com.sky.marshall.demo.strategy.ElephantAnimalStrategy"),
    TIGER(2, "com.sky.marshall.demo.strategy.TigerAnimalStrategy"),
    ;

    int index;
    String className;

    AnimalEnum(int index, String className) {
        this.index = index;
        this.className = className;
    }

    public int getIndex() {
        return index;
    }

    public String getClassName() {
        return className;
    }

}
