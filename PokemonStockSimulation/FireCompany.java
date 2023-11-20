import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class FireCompany here.
 * 
 * @author Mekaeel
 * @version November 9th
 */
public class FireCompany extends Companies
{
    protected static int currentValue = 50;
    protected static int newValue;
    protected int iteration;
    
    protected greenfoot.Color color;
    
    public FireCompany() {
        super();
        iteration = 0;
        
        color = Color.RED;
        
        setImage(points);
    }
    
    public FireCompany(int v) {
        super();
        iteration = 0;
        
        currentValue = v;
        
        color = Color.RED;
        
        setImage(points);
    }
    
    /**
     * Act - do whatever the FireCompany wants to do. This method is called whenever
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
        newValue = x;
    }
    
    public String toString(){
        return "FireCompany";
    }
}
