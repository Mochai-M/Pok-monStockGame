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
    protected static int currentValue = 50;
    protected static int newValue;
    protected ArrayList<Integer> linePoints;
    protected int iteration;
    
    protected int clock;
    
    protected GreenfootImage points;
    
    public FireCompany(int v) {
        clock = 0;
        iteration = 0;
        
        linePoints = new ArrayList<Integer>();
        linePoints.add(v);
        
        points = new GreenfootImage(50,600);
        
        setImage(points);
    }
    
    /**
     * Act - do whatever the FireCompany wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
            clock++;
            if(clock > 100) {
                updateValue();
                clock = 0;
            }
    }
    
    public void newPoint(int x1, int y1, int x2, int y2) {
        points.setColor(Color.RED);
        points.drawLine(x1,y1,x2,y2);
    }
    
    public void updateValue() {
        newValue = Greenfoot.getRandomNumber(600);     
        
        if(iteration == 0) {           
            newPoint(0,currentValue,50,newValue);
            newPoint(0,currentValue + 3,50,newValue + 3);
            newPoint(0,currentValue - 3,50,newValue - 3);
            
            currentValue = newValue;
            
            ((MyWorld)getWorld()).addObject(new FireCompany(400),1625,300);
        }
        
        setLocation(getX() - 50, getY());
        iteration++;
        
        if (iteration > 32) {
            ((MyWorld)getWorld()).removeObject(this);
        }
    }
    
    public int getCurrentValue() {
        return currentValue;
    }
    
    public int getNewValue() {
        return newValue;
    }
    
    public String toString(){
        return "FireCompany";
    }
}
