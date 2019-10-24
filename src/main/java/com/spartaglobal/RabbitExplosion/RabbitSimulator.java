package com.spartaglobal.RabbitExplosion;

import java.util.ArrayList;
import java.util.List;

public class RabbitSimulator {


    public void  simulationStart(){
      int months = 0;
        int year = 10;
        RabbitCreation rabbitCreation = new RabbitCreation();
        rabbitCreation.addFirstPair();

        List<IFemaleRabbit> femaleRabbitList = rabbitCreation.getFemaleRabbit();
        List<IRabbit> maleRabbitList = rabbitCreation.getMaleRabbit();
        setRabbitMaturity setRabbitMaturity = new setRabbitMaturity();
        RabbitAge rabbitAge = new RabbitAge();
        RabbitManager rabbitManager = new RabbitManager();
        SetPregnancy setPregnancy = new SetPregnancy();

        while(months < year){


            femaleRabbitList = rabbitAge.changeFemaleAge(months,femaleRabbitList);
           maleRabbitList = rabbitAge.changeRabbitAge(months,maleRabbitList);

           femaleRabbitList = setRabbitMaturity.setFemaleMaturity(femaleRabbitList);
           maleRabbitList = setRabbitMaturity.setMaleMaturity(maleRabbitList);

           femaleRabbitList = setPregnancy.setFemalePregnancy(femaleRabbitList,maleRabbitList);

            femaleRabbitList = rabbitCreation.getFemaleRabbit();
            maleRabbitList = rabbitCreation. getMaleRabbit();



            months++;

            System.out.println( months);




        }










    }
}
