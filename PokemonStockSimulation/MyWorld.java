import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Mekaeel Malik, Natalie Huang
 * @version 1.0
 */
public class MyWorld extends World
{

    // natalie 11/7/2023
    //load images into a temporary array
    //GreenfootImage[] images = new GreenfootImage[];
    //new GreenfootImage("*add image*");
    //do four times for each emotion
    //icon will then be equal to new icon(images);
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    { 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1, false);
        
        setPaintOrder(Line.class,LineGraph.class);
        
        addObject(new LineGraph(),800,400);
    
        FireCompany redCompany = new FireCompany(400);
        addObject(redCompany, 1625,300);
        
        WaterCompany blueCompany = new WaterCompany(400);
        addObject(blueCompany, 1625,300);
        
        
    }
    
    public void act(){
        //spawns random weather effects 
        if(Greenfoot.getRandomNumber(1000) == 0){
            int weatherType = Greenfoot.getRandomNumber(4); 
            
            if(weatherType == 0){
                addObject(new BlueEffect(), 900, -300);
            }
            else if(weatherType == 1){
                addObject(new GreenEffect(), 900, -300);
            }
            else if(weatherType == 2){
                addObject(new RedEffect(), 900, -300);
            }
            else{
                addObject(new PinkEffect(), 900, -300);
            }
        }
    }
}
