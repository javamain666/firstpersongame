/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Gamer
 */
public class Features {
    public class Mesure
    {
        public Mesure(int v, int max, int min)
        {
            value=v; 
            maxvalue=max; minvalue=min;
        }
        public int value;
        public int maxvalue;
        public int minvalue;
    }
    public Mesure health=new Mesure(100,100,0);
    public Mesure age=new Mesure(23,100,0);
    public Mesure demage=new Mesure(50,100,0);
}
