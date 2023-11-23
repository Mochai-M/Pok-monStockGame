import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class GreenCompany here.
 * 
 * @author Mekaeel
 * @version November 14th
 */
public class GreenCompany extends Companies
{
    protected static int currentValue = 50;
    protected static int newValue;
    protected int iteration;
    protected greenfoot.Color color;
    
    public GreenCompany(int v) {
        super();
        iteration = 0;
        
        currentValue = v;

        color = Color.GREEN;
    }
    
    /**
     * Act - do whatever the GreenCompany wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
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
        if( x > 600) {
            newValue = 580;
        } else if(x < 0) {
            newValue = 0;
        } else {
            newValue = x;
        }
    }
    
    public String toString(){
        return "GreenCompany";
    }
}
