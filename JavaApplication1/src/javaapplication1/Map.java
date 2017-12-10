/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Graphics2D;

/**
 *
 * @author Gamer
 */
public class Map extends Object implements Paint{
    public Map(int mx,int my)
    {
        maxx=mx;
        maxy=my;
    }
    public static Map instance=new Map(1000,1000);
    public Map getMap()
    {
        return instance;
    }
    
    public void Draw(Graphics2D g)
    {
        System.out.println("map \n"+"size:"+maxx+" "+maxy);
    }
    
    public int maxx,maxy;
}