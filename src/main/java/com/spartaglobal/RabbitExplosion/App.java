package com.spartaglobal.RabbitExplosion;

import java.util.TimerTask;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Rabbit rabbit = new Rabbit();


        RabbitSimulator rabbitSimulator = new RabbitSimulator();
        rabbitSimulator.simulationStart();





    }
}
