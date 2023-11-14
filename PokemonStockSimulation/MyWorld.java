import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Mekaeel Malik, Natalie Huang
 * @version 1.0
 */
public class MyWorld extends World
{
<<<<<<< Updated upstream

    // natalie 11/7/2023
=======
    //load images into a temporary array
    //GreenfootImage[] images = new GreenfootImage[];
    //new GreenfootImage("*add image*");
    //do four times for each emotion
    //icon will then be equal to new icon(images);
    
    //private GreenfootImage[] images; 
    GreenfootImage icon1 = new GreenfootImage(
>>>>>>> Stashed changes
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
<<<<<<< Updated upstream
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1,false);
        
        setPaintOrder(Line.class,LineGraph.class);
        
        addObject(new LineGraph(),800,400);
        
        addObject(new FireCompany(400), 1625,300);
        addObject(new WaterCompany(400), 1625,300);
=======
        super(1100, 650, 1); 
        
>>>>>>> Stashed changes
    }
    
}
