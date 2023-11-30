import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Sub class for green company that holds the specific variables used by 
 * the green company that also draws the line from the current value to the next.
 * 
 * @author Mekaeel
 * @version November 29th, 2023
 */

public class GreenCompany extends Companies
{
    protected static int currentValue = 50;
    protected static int newValue;
    protected static int previousValue = 200;
    protected static boolean modified;
    
    protected int iteration;
    protected greenfoot.Color color;
    
    /**
     * Constructor for GreenCompany that takes in an initial value to start at
     * and also sets the other differentiating factors between this class and others
     */
    public GreenCompany(int v) {
        super();
        iteration = 0;
        modified = false;
        
        currentValue = v;

        color = new Color(110,194,68);
    }
    
    /**
     * Act - do whatever the GreenCompany wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
        changeInValue();
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
        if( x > 535) {
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
        return "Plant";
    }
    
    // images for the stock headers
    protected GreenfootImage increasing = new GreenfootImage("images/greenGood.png");
    protected GreenfootImage decreasing = new GreenfootImage("images/greenBad.png");
    
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
