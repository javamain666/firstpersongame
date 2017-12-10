/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 *
 * @author Gamer
 */
public class Player extends Object {
    public Player()
    {
        super();
        this.type=Type.PLAYER;
    }
    public Player(String n,int posx,int posy)
    {
        super();
        setName(n);
        this.setPos(posx, posy);
        this.type=Type.PLAYER;
    }
    @Override
    public void Draw(Graphics2D g)
    {
        
        g.setColor(Color.red);
        g.fillRect(this.pos.x, this.pos.y, this.pos.x+20,  this.pos.y+20);
        //g.drawLine(0+this.getPos().x, 0+getPos().y, 50+getPos().x, 0+getPos().y);
        //g.drawLine(0+this.getPos().x, 0+getPos().y, getPos().x, 50+getPos().y);
        //g.drawLine(0+this.getPos().x, 50+getPos().y, 50+getPos().x, 50+getPos().y);
        //g.drawLine(50+this.getPos().x, 0+getPos().y, 50+getPos().x, 50+getPos().y);
       //System.out.println( "name:"+getName()+"\n"+"pos:"+this.getPos().x+" " + this.getPos().y);

    }
    
    
    public Features feature; // характеристики
}
