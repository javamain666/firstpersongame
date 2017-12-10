/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gamer
 */
public class ObjectContainer {
    public static ObjectContainer instance=new ObjectContainer();
    public ObjectContainer()
    {
        objectArray=new ArrayList<Object>();
    }
    public ObjectContainer getInstance()
    {
        return instance;
    }
    public void addObject( Object o)
    {
        objectArray.add(o);
    }
    public List<Object> getObjectList( )
    {
        return objectArray;
    }
    public List<Object> getObjectByType(Object.Type t)
    {
        List<Object> ol=new ArrayList<Object>();
        for(Object o: this.objectArray)
        {
            if(o.type==t)
                ol.add(o);
        }
        return ol;
    }
    
    private List<Object> objectArray;
}
