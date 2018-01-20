/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.JFrame;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.TexturePaint;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.util.List;

/**
 *
 * @author Gamer
 */
public class JavaApplication1 extends JPanel  implements KeyListener{

    
    static final int WIDTH=800, HEIGHT=375;
    public String getName(){
        return "Paints";
    }
    public int getWidth(){
        return WIDTH;
    }
    public int getHeight(){
        return HEIGHT;
    }
    
    public void keyPressed(KeyEvent e) {
        
        
    }
 
    public void keyReleased(KeyEvent e) {     
    }
 
    public void keyTyped(KeyEvent e) {             
    
        List<Object> ol=ObjectContainer.instance.getInstance().getObjectByType(Object.Type.PLAYER);
        System.out.println("presed char :"+e.getKeyChar());
        
        if( e.getKeyChar()=='a' )
        {
                //System.out.println("a");
                for(Object o: ol)
                {
                    o.changePos(-5, 0);
                }
                
        }
        if( e.getKeyChar()=='w' )
        {
                 for(Object o: ol)
                {
                    o.changePos(0, -5);
                }
               
        }
        if( e.getKeyChar()=='s' )
        {
                 for(Object o: ol)
                {
                    o.changePos(0, 5);
                }
             
        }
        if( e.getKeyChar()=='d' )           
        {
                 for(Object o: ol)
                {
                    o.changePos(5, 0);
                }
             
        }
        
        this.repaint();
    }
    
    public void paint(Graphics g1) {
    Graphics2D g = (Graphics2D) g1;
    // Paint the entire background using a GradientPaint.
    // The background color varies diagonally from deep red to pale blue
    //g.setPaint(new GradientPaint(0, 0, new Color(150, 0, 0), WIDTH, HEIGHT,
    //    new Color(200, 200, 255)));
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, WIDTH, HEIGHT); // fill the background

  
    /**
     * @param args the command line arguments
     */
     
            for(Object o:container.getInstance().getObjectList())
            {
                o.Draw(g);
            }
        
    }
    public static ObjectContainer container;
    
    public static void main(String[] args) {
        // TODO code application logic here
        String s="This is my new game!!!";
        System.out.println(s);
        
        container=new ObjectContainer();
        
        container.addObject(Map.instance);
        
        Player p =new Player("alex",100, 200);
        container.getInstance().addObject(p);
        
        for(int i=0; i<100; i++)
        {
            Tree t=new Tree("tree"+i,(int) (Math.random() * Map.instance.maxx),(int) (Math.random() * Map.instance.maxy) );
            container.getInstance().addObject(t);
        }
        
        JFrame f = new JFrame();
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        JavaApplication1 ja=new JavaApplication1();
        f.setContentPane(ja);
        f.addKeyListener( ja);
        f.setSize(800,375);
        f.setVisible(true);
        
        
        for(int i=0; i<100; i++)
        {
            Enemy enemy=new Enemy( (int) (Math.random() * Map.instance.maxx),(int) (Math.random() * Map.instance.maxy));
            //Tree t=new Tree("tree"+i,(int) (Math.random() * Map.instance.maxx),(int) (Math.random() * Map.instance.maxy) );
            container.getInstance().addObject(enemy);
        }
        
        
        for(Object o : container.getInstance().getObjectList())
        {
           // o.Draw();
        }
    }
    
}
