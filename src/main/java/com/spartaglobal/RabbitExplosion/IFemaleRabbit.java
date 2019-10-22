package com.spartaglobal.RabbitExplosion;

public interface IFemaleRabbit extends IRabbit {
    boolean getIsPregnant();
    void setIsPregnant(boolean pregnant);

    int  getGiveBirth ();
    int setGiveBirth(int birth);

    void  canGetPregnant ( boolean canGetPregnant)




}