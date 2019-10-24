package com.spartaglobal.RabbitExplosion;

import java.util.ArrayList;
import java.util.List;

public class RabbitCreation {

    private List<IFemaleRabbit> femaleRabbitList = new ArrayList<>();
    private RabbitManager rabbitManager = new RabbitManager();

    public List rabbitManager(int age, boolean alive, boolean reproductionReady, boolean pregnant, int birth){
        femaleRabbitList.add(rabbitManager.createFemaleRabbit(age, alive, reproductionReady, pregnant, birth));

        return femaleRabbitList;
    }


    private List<IRabbit> maleRabbitList = new ArrayList<>();
    private RabbitManager maleRabbitManager = new RabbitManager();

    public void maleRabbitManager(int age, boolean alive, boolean reproductionReady){
        maleRabbitList.add(maleRabbitManager.createRabbit(age, alive, reproductionReady));
    }

    public void addFirstPair(){
        femaleRabbitList.add(rabbitManager.createFemaleRabbit(0,true,false,false,0));
        maleRabbitList.add( rabbitManager.createRabbit(0,true,false));
    }



        public List<IFemaleRabbit> getFemaleRabbit(){

            return femaleRabbitList;
        }

        public List<IRabbit> getMaleRabbit(){
        return maleRabbitList;
        }

        }

