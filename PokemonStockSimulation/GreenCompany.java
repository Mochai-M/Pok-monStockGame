import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class GreenCompany here.
 * 
 * @author Mekaeel
 * @version November 9th
 */
public class GreenCompany extends Companies
{
    protected static int currentValue = 50;
    protected static int newValue;
    protected int iteration;
    
    protected GreenfootImage points;
    
    public GreenCompany(int v) {
        super();
        iteration = 0;
        
        points = new GreenfootImage(50,600);
        points.setColor(Color.GREEN);
        
        setImage(points);
    }
    
    /**
     * Act - do whatever the GreenCompany wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act();
    }
    
    public void newPoint(int x1, int y1, int x2, int y2) {
        points.drawLine(x1,y1,x2,y2);
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
        return "GreenCompany";
    }
}
