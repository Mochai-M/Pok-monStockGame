import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LineGraph here.
 * 
 * @author Mekaeel
 * @Nov 8, 2023
 */
public class LineGraph extends Actor
{
    protected static int graphHeight;
    protected static int graphWidth; 
    
    protected int value;
    protected String color;
    
    protected GreenfootImage point;
    
    public LineGraph() {
        point = new GreenfootImage(4,4);
    }
    /**
     * Act - do whatever the LineGraph wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void graphPoint() {
        point.setColor(Color.BLACK);
        point.drawRect(200,200,40,40);
        setImage(point);
    }
}
