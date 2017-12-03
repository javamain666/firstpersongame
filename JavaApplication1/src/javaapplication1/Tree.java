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
public class Tree extends Object{
    public Tree(String n, int x, int y)
    {
        setPos(x, y);
        setName(n);
    }
    public enum Type
    {
        hvoinii, listvennii
    }
   
    public void Draw()
    {
        System.out.println( "name:"+getName()+"\n"+"pos:"+this.getPos().x+" " + this.getPos().y);
    }
    public Type treetype=Type.hvoinii;

}
