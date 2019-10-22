package com.spartaglobal.RabbitExplosion;

public class FemaleRabbit extends Rabbit implements IFemaleRabbit {
     private int birth;
    private boolean pregnant;

    @Override
    public boolean getIsPregnant() {
        return this.pregnant;
    }

    @Override
    public void setIsPregnant(boolean pregnant) {
        this.pregnant = pregnant;
    }

    @Override
    public int getGiveBirth() {
        return this.birth;
    }

    @Override
    public int setGiveBirth(int giveBirth) {
         this.birth = birth;
        return giveBirth;
    }
}
