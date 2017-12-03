/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Random;

/**
 *
 * @author Gamer
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="This is my new game!!!";
        System.out.println(s);
        
        ObjectContainer container=new ObjectContainer();
        
        container.addObject(Map.instance);
        
        Player p =new Player("alex",100, 200);
        container.getInstance().addObject(p);
        
        for(int i=0; i<1000; i++)
        {
            Tree t=new Tree("tree"+i,(int) (Math.random() * Map.instance.maxx),(int) (Math.random() * Map.instance.maxy) );
            container.getInstance().addObject(t);
        }
        
        for(Object o : container.getInstance().getObjectList())
        {
            o.Draw();
        }
    }
    
}
