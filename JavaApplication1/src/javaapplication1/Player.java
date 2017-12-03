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
public class Player extends Object {
    public Player()
    {
        super();
        
    }
    public Player(String n,int posx,int posy)
    {
        super();
        setName(n);
        this.setPos(posx, posy);
    }
    
    public void Draw()
    {
       System.out.println( "name:"+getName()+"\n"+"pos:"+this.getPos().x+" " + this.getPos().y);

    }
    public Features feature; // характеристики
}
