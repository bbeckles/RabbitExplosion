package com.spartaglobal.RabbitExplosion;

public interface IRabbit {

    int setAge(int age);
    int getAge();


    boolean getAlive();
    boolean setAlive(boolean alive);

    boolean getReproductionReady();
    boolean setReproductionReady(boolean reproductionReady);

}
