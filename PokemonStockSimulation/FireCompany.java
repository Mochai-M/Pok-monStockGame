import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class FireCompany here.
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
    
    public FireCompany() {
        super();
        iteration = 0;
        modified = false;
        
        color = new Color(252,81,76);
        
        setImage(points);
    }
    
    public FireCompany(int v) {
        header = true;
        clock = 0;
    }
    
    /**
     * Act - do whatever the FireCompany wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {      
        if(header == false) {
            setLocation(getX() - 2, getY());
            
            super.act();
            
            if(clock == 49) {
                if(iteration == 0) {
                    finishedPoints = new GreenfootImage(getImage());
                    
                    points = new GreenfootImage(lineWidth,550);
                    
                    setImage(finishedPoints);
                    
                    ((MyWorld)getWorld()).addObject(new FireCompany(),spawnPoint,275);
                }
                
                incrementIteration();
            }
                
            if (getIteration() > 17) {
                ((MyWorld)getWorld()).removeObject(this);
            }
        }
        else {
            changeInValue();
            
            clock++;
            
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
     * Getter method for currentNewValue
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
     * Getter method for iteration
     */
    public boolean wasModified() {
        return modified;
    }
    
    /**
     * Setter method for iteration
     */
    public void resetModified() {
        modified = false;
    }
    
    /**
     * Getter method for iteration
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
     * Setter method for currentValue
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
    
    public String toString(){
        return "Fire";
    }
    
    protected GreenfootImage increasing = new GreenfootImage("images/fireGood.png");
    protected GreenfootImage decreasing = new GreenfootImage("images/fireBad.png");
    
    public void changeInValue() {
        if(currentValue > previousValue) {
            setImage(decreasing);
        } else {
            setImage(increasing);
        }
    }
}
