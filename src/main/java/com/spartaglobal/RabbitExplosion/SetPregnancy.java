package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class SetPregnancy {

    public List<IFemaleRabbit> setFemalePregnancy(List<IFemaleRabbit> femaleRabbitList, List<IRabbit> maleRabbitList){
        RabbitAge rabbitAge = new RabbitAge();
        setRabbitMaturity setRabbitMaturity = new setRabbitMaturity();

        for (int i = 0; i < femaleRabbitList.size(); i++) {
            for (int j = 0; j < maleRabbitList.size(); j++) {

                if (femaleRabbitList.get(i).getAge() >= 3 && maleRabbitList.get(i).getAge() >= 3){
                    femaleRabbitList.get(i).canGetPregnant(true);
                    femaleRabbitList.get(i).setIsPregnant(true);

                    // System.out.println("Female is pregnant");

                }

            }

        }

        return femaleRabbitList;
    }
}
