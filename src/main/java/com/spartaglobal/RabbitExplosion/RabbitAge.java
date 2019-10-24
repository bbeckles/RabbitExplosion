package com.spartaglobal.RabbitExplosion;

import java.util.List;

public class RabbitAge {



    public List<IFemaleRabbit> changeFemaleAge(int month, List<IFemaleRabbit> femaleRabbitList) {
        for (int i = 0; i < femaleRabbitList.size() ; i++) {
            femaleRabbitList.get(i).setAge(month);
            System.out.println("Female Age " + femaleRabbitList.get(i).getAge());
        }

        return femaleRabbitList;

    }

  public List<IRabbit> changeRabbitAge(int month, List<IRabbit> maleRabbitList){
      for (int i = 0; i < maleRabbitList.size() ; i++) {
          maleRabbitList.get(i).setAge(month);
          System.out.println("Male Age " + maleRabbitList.get(i).getAge());
      }
       return maleRabbitList;
  }
}
