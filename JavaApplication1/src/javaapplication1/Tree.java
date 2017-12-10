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
public class Tree extends Object{
    public Tree(String n, int x, int y)
    {
        super();
        setPos(x, y);
        setName(n);
        this.type=Object.Type.TREE;
    }
    public enum TypeTree
    {
        hvoinii, listvennii
    }
   
    public void Draw(Graphics2D g)
    {
        g.setColor(Color.GREEN);
        g.fillRect(this.getPos().x, this.getPos().y, this.getPos().x+20,  this.getPos().y+20);
        
        /*g.setColor(Color.WHITE);
        g.drawLine(0+this.getPos().x, 0+getPos().y, 50+getPos().x, 0+getPos().y);
        g.drawLine(0+this.getPos().x, 0+getPos().y, 0+getPos().x, 50+getPos().y);
        g.drawLine(0+this.getPos().x, 50+getPos().y, 50+getPos().x, 50+getPos().y);
        g.drawLine(50+this.getPos().x, 0+getPos().y, 50+getPos().x, 50+getPos().y);
        */
        //System.out.println( "name:"+getName()+"\n"+"pos:"+this.getPos().x+" " + this.getPos().y);
    }
    public TypeTree treetype=TypeTree.hvoinii;

}
