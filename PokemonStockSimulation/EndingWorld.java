import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndingWorld extends World
{
    private int clock;
    private GreenfootImage background;
    private GreenfootImage start;
    
    /**
     * Constructor for objects of class EndingWorld.
     * 
     */
    public EndingWorld(GreenfootImage background)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1);
        this.background = background;
        setBackground(background);
        
        addObject(new fadingRectangle(1600,800),800,400);
    }
    
    public void act() {
        
    }
}
