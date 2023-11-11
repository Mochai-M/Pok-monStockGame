import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Mekaeel Malik
 * @version 1.0
 */
public class MyWorld extends World
{

    // natalie 11/7/2023
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1);
        
        setPaintOrder(Line.class,LineGraph.class);
        addObject(new LineGraph(),800,400);
        
        addObject(new Line(400), 1600,400);
    }
}
