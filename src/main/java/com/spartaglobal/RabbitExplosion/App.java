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

        System.out.println( "Hello World!" );

        GlobalTimer globalTimer = new GlobalTimer(10);
        System.out.println(globalTimer);


    }
}
