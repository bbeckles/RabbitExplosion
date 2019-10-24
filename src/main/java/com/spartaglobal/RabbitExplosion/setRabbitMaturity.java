package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class setRabbitMaturity {

    public List<IFemaleRabbit> setFemaleMaturity(List<IFemaleRabbit> femaleRabbitList){

        RabbitCreation rabbitCreation = new RabbitCreation();
        RabbitAge rabbitAge = new RabbitAge();

        for (int i = 0; i < femaleRabbitList.size() ; i++) {

            if ( femaleRabbitList.get(i).getAge()> 3 && !femaleRabbitList.get(0).getReproductionReady()) {
                femaleRabbitList.get(0).setReproductionReady(true);
                femaleRabbitList.get(0).canGetPregnant(true);
                System.out.println("Female rabbit is mature ");
            }
        }

       return femaleRabbitList;

        }

        public List <IRabbit> setMaleMaturity (List<IRabbit> maleRabbitList){

        RabbitCreation rabbitCreation = new RabbitCreation();
            RabbitAge rabbitAge = new RabbitAge();


            for (int i = 0; i < maleRabbitList.size() ; i++) {

                if (maleRabbitList.get(i).getAge() > 3 && !maleRabbitList.get(0).getReproductionReady()) {
                    maleRabbitList.get(0).setReproductionReady(true);
                    System.out.println("Male rabbit is mature ");
                }
            }
        return maleRabbitList;
    }
}
