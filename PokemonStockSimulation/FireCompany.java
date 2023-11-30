import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Holds all the relevant values for the fire company, but also serves as the display
 * for all of the stock values. It has a bunch of code nested within this act function
 * that does this without bleeding into the Comanies act whatsoever.
 * 
 * @author Mekaeel
 * @version November 14th
 */
public class FireCompany extends Companies
{
    protected static int currentValue = 400;
    protected static int newValue;
    protected static int previousValue = 400;
    protected static boolean modified;    
    
    protected int iteration;
    
    protected boolean header = false;
    
    protected greenfoot.Color color;
    
    /**
     * Constructor for FireCompany that takes in an initial value to start at
     * and also sets the other differentiating factors between this class and others
     */
    public FireCompany() {
        super();
        iteration = 0;
        modified = false;
        
        color = new Color(252,81,76);
        
        setImage(points);
    }
    
    /**
     * Constructor for FireCompany that is instead for the stock header that is displayed
     * at the top of the screen
     * 
     * @ Companies uno: Company of the pokemon on the left
     * @ Companies dos: Company of the pokemon on the right
     */
    public FireCompany(Companies uno, Companies dos) {
        header = true;
        
        company1 = uno;
        company2 = dos;
        
        clock = 0;
    }
    
    /**
     * Act - do whatever the FireCompany wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   
        //if the actor is not the header class
        if(header == false) {
            
            // shift it 2 pixels to the left
            setLocation(getX() - 2, getY());
            
            // call the super class that plots a new point on the graph
            super.act();
            
            // if the clock value is 49
            if(clock == 49) {
                // and the iteration of the object is zero
                if(iteration == 0) {
                    // take a snapshot of the current image
                    finishedPoints = new GreenfootImage(getImage());
                    
                    // then clear the current image
                    points = new GreenfootImage(lineWidth,550);
                    
                    // and set this part of the graphs image to the snapshot
                    setImage(finishedPoints);
                    
                    // then finally add in a new object to the world
                    ((MyWorld)getWorld()).addObject(new FireCompany(),spawnPoint,275);
                }
                
                // add one to the iteration of the FireCompany object regardles of the iteration
                incrementIteration();
            }
            
            // if the FireCompany objects iteration reaches 18, remove it as it is fully offscreen
            if (getIteration() > 17) {
                ((MyWorld)getWorld()).removeObject(this);
            }
        }
        // this is the code that runs in the firecompanies stock header (only one of them)
        else {
            // checks and changes the arrow on the header depending on how the stock is doing
            changeInValue();
            
            // increments the clock by one and at a consistent pace because there is only one fire company header
            clock++;
            
            // resets the clock if it reaches 50
            if(clock >= 50) {
                clock = 0;
            }
        }
    }
    
    /**
     * Getter method for currentValue
     */
    public int getCurrentValue() {
        return currentValue;
    }
    
    /**
     * Getter method for newValue
     */
    public int getNewValue() {
        return newValue;
    }
    
    /**
     * Getter method for iteration
     */
    public int getIteration() {
        return iteration;
    }
    
    /**
     * Getter method for modified
     */
    public boolean wasModified() {
        return modified;
    }
    
    /**
     * Setter method for modified
     */
    public void resetModified() {
        modified = false;
    }
    
    /**
     * Getter method for color
     */
    public greenfoot.Color getColor() {
        return color;
    }
    
    /**
     * Setter method for iteration that increments it
     */
    public void incrementIteration() {
        iteration++;
    }
    
    /**
     * Setter method for currentValue
     */
    public void updateCurrentValue(int x) {
        currentValue = x;
    }
    
    /**
     * Setter method for newValue
     */
    public void setNewValue(int x) {
        if(x > 535) {
            newValue = 535;
        } else if(x < 15) {
            newValue = 15;
        } else {
            newValue = x;
        }
        modified = true;
    }
    
    /**
     * toString method to give other functions a string value to check against
     */
    public String toString(){
        return "Fire";
    }
    
    // images for the stock header
    protected GreenfootImage increasing = new GreenfootImage("images/fireGood.png");
    protected GreenfootImage decreasing = new GreenfootImage("images/fireBad.png");
    
    /**
     * Changes the stock header based on how the stock has changed from its initial price
     */
    public void changeInValue() {
        if(currentValue > previousValue) {
            setImage(decreasing);
        } else {
            setImage(increasing);
        }
    }
}
