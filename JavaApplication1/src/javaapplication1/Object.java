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

public class Object implements Paint{
    
    public Object()
    {
        name="";
        type=Type.NULL;
        pos=new Position(0, 0);
        id=i++;
    }    
    private static int i=0;
        
    
    public int getID()
    {
            
            return id;
    }
    public Position getPos()
    {
        return new Position(pos.x,pos.y);
    }
    public void setPos(int _x,int _y)
    {
        this.pos.x=_x;
        this.pos.y=_y;
    }
    public void changePos(int _x, int _y)
    {
        this.pos.x+=_x;
        this.pos.y+=_y;
    }
    public void Draw(Graphics2D g)
    {
        System.out.println("draw object");
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }

    
    public enum Type{NULL, PLAYER, TREE, ENEMY};
    public  Type type;
    private String name;
    public Position pos;
    private int id;
}
