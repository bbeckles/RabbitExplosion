package com.spartaglobal.RabbitExplosion;

import java.util.Timer;
import java.util.TimerTask;

public  class Rabbit implements IRabbit {

    int getAge;
    boolean reproductionReady;
    boolean alive;
    int age;


    public void printRabbit(){
        System.out.println("Rabbit is here");
    }



    @Override
    public int setAge(int age) {
        return this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public boolean getAlive() {
        return this.alive;
    }

    @Override
    public boolean setAlive(boolean alive) {
        return this.alive = alive;

    }

    @Override
    public boolean getReproductionReady() {
        return this.reproductionReady;
    }

    @Override
    public boolean setReproductionReady(boolean reproductionReady) {
        return this.reproductionReady = reproductionReady;
    }
}
