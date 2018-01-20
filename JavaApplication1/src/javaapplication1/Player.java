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
        this.compos=new Pair<Position,Position>(new Position(), new Position());
    }
    public Player(String n,int posx,int posy)
    {
        super();
        setName(n);
        this.setPos(posx, posy);
        this.type=Type.PLAYER;
        this.compos=new Pair<Position,Position>(new Position(), new Position());
        Position position=this.compos.getKey();
        position = this.pos;
        Position pos2=this.compos.getValue();
        pos2.x=0; 
        pos2.y=0;
    }
    @Override
    public void Draw(Graphics2D g)
    {
        
        g.setColor(Color.red);
        int xc=this.pos.x;
        int yc=this.pos.y;
        int metrix=20;
        g.fillRect(xc, yc, metrix,  metrix);
        System.out.println("fillRect:"+xc+" "+yc);
        g.drawLine(compos.getKey().x, compos.getKey().y, compos.getValue().x-compos.getKey().x,  compos.getValue().y-compos.getKey().y);
        System.out.println("compos "+compos.getKey().x + " " + compos.getKey().y +" "+compos.getValue().x + " " + compos.getValue().y);
        //g.drawLine(0+this.getPos().x, 0+getPos().y, 50+getPos().x, 0+getPos().y);
        //g.drawLine(0+this.getPos().x, 0+getPos().y, getPos().x, 50+getPos().y);
        //g.drawLine(0+this.getPos().x, 50+getPos().y, 50+getPos().x, 50+getPos().y);
        //g.drawLine(50+this.getPos().x, 0+getPos().y, 50+getPos().x, 50+getPos().y);
       //System.out.println( "name:"+getName()+"\n"+"pos:"+this.getPos().x+" " + this.getPos().y);

    }
    
    public Pair<Position,Position> compos;
    public Features feature; // характеристики
}
