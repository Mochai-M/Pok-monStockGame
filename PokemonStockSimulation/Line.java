import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Line here.
 * 
 * @author Mekaeel
 * @version November 9th
 */
public class Line extends Actor
{
    protected int currentValue = 50;
    protected ArrayList<Integer> linePoints;
    protected int iteration;
    
    protected int clock;
    
    protected GreenfootImage points;
    
    public Line(int v) {
        clock = 0;
        iteration = 0;
        
        linePoints = new ArrayList<Integer>();
        linePoints.add(v);
        
        points = new GreenfootImage(2400,800);
        
        currentValue = v;
        
        setImage(points);
    }
    
    /**
     * Act - do whatever the Line wants to do. This method is called whenever
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
        points.setColor(Color.BLACK);
        points.drawLine(x1,y1,x2,y2);
    }
    
    public void updateValue() {
        int newValue = Greenfoot.getRandomNumber(400)+200;
        newPoint(50 * (iteration - 1),currentValue,50 * iteration,newValue);
        newPoint(50 * (iteration - 1) + 3,currentValue,50 * iteration + 3,newValue);
        newPoint(50 * (iteration - 1) - 3,currentValue,50 * iteration - 3,newValue);
        
        setLocation(getX()-50, getY());
        
        currentValue = newValue;
        iteration++;
    }
}
