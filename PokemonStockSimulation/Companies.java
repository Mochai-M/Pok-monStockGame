import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Companies here.
 * 
 * @author Mekaeel
 * @version November 14th, 2023
 */

public abstract class Companies extends Actor
{   
    protected int spawnPoint = 1775;
    protected int clock;
    protected static int lineWidth = 106;
    protected boolean modified = false;
    
    public static GreenfootImage points = new GreenfootImage(lineWidth,600);
    public GreenfootImage finishedPoints;

    
    public Companies() {
        clock = 0;
    }
    
    public void act() {
        clock++;
        
        if(getClass() == FireCompany.class) {
            setLocation(getX() - 1, getY());
        }
        
        if(clock >= 100) {
            nextPoint();
            clock = 0;
            
            if (getIteration() > 33 && getClass() == FireCompany.class) {
            ((MyWorld)getWorld()).removeObject(this);
            }
        }
    }
    
    public void nextPoint() {        
        if(getIteration() == 0 || getClass() != FireCompany.class) {         
            if(modified == false) {
                setNewValue(Greenfoot.getRandomNumber(600));
            }
            
            newPoint(0,getCurrentValue(),101,getNewValue());
            
            updateCurrentValue(getNewValue());
            
            if(getClass() == FireCompany.class) {
                finishedPoints = new GreenfootImage(getImage());
                
                points = new GreenfootImage(lineWidth,600);
                
                setImage(finishedPoints);
            }
            
            if(getClass() == FireCompany.class) {
                ((MyWorld)getWorld()).addObject(new FireCompany(),spawnPoint,300);
            }
            
            modified = false;
        }
        incrementIteration();
    }
      
    public abstract void updateCurrentValue(int x);
    
    public abstract int getCurrentValue();
    
    public abstract int getNewValue();
    
    public abstract void setNewValue(int x);
    
    public abstract int getIteration();
    
    public abstract greenfoot.Color getColor();
    
    public abstract void incrementIteration();
    
    public void newPoint(int x1, int y1, int x2, int y2) {
        points.setColor(getColor());
        
        points.drawLine(x1,y1,x2,y2);
        
        points.drawLine(x1 + 1,y1,x2 + 1,y2);
        points.drawLine(x1 - 1,y1,x2 - 1,y2);
        
        points.drawLine(x1,y1 + 1,x2,y2 + 1);
        points.drawLine(x1,y1 - 1,x2,y2 - 1);
        
        points.drawLine(x1 + 2,y1,x2 + 2,y2);
        points.drawLine(x1 - 2,y1,x2 - 2,y2);
        
        points.drawLine(x1,y1 + 2,x2,y2 + 2);
        points.drawLine(x1,y1 - 2,x2,y2 - 2);
    }
    
    public void modifyValue(int x) {
        setNewValue(getNewValue() + x);
        modified = true;
    }
    
    public abstract String toString();

}
