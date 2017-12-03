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

public class Object implements Paint{
    
    public Object()
    {
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
        pos=new Position(_x,_y);
    }
    public void Draw()
    {
        
    }
    public void setName(String n)
    {
        name=n;
    }
    public String getName()
    {
        return name;
    }
    private String name;
    private Position pos;
    private int id;
}
