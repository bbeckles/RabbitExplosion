package com.spartaglobal.RabbitExplosion;

public class RabbitManager {

    public  Rabbit createRabbit(int age, boolean alive, boolean reproductionReady ){
        Rabbit maleRabbit = new Rabbit();
        maleRabbit.setAge(age);
        maleRabbit.setAlive(alive);
        maleRabbit.setReproductionReady(reproductionReady);

        return maleRabbit;
    }

    public FemaleRabbit createFemaleRabbit( int age, boolean alive, boolean reproductionReady, boolean pregnant, int birth ){
        FemaleRabbit femaleRabbit = new FemaleRabbit();
        femaleRabbit.setAge(age);
        femaleRabbit.setAge(age);
        femaleRabbit.setAlive(alive);
        femaleRabbit.setReproductionReady(reproductionReady);
        femaleRabbit.setGiveBirth(birth);
        femaleRabbit.setIsPregnant(pregnant);

        return femaleRabbit;

    }


}
