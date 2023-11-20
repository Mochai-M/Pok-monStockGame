import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Companies here.
 * 
 * @author Mekaeel
 * @version November 14th, 2023
 */

public abstract class Companies extends Actor
{   
    protected int spawnPoint = 1575;
    protected int clock;
    
    public Companies() {
        clock = 0;
    }
    
    public void act() {
        clock++;
        setLocation(getX() - 1, getY());
        if(clock > 50) {
            nextPoint();
            clock = 0;
        }
    }
    
    public void nextPoint() {
        if(getIteration() == 0) {      
            
            newPoint(0,getCurrentValue(),50,getNewValue());
            newPoint(0,getCurrentValue() + 1,50,getNewValue() + 1);
            newPoint(0,getCurrentValue() - 1,50,getNewValue() - 1);
            newPoint(0,getCurrentValue() + 2,50,getNewValue() + 2);
            newPoint(0,getCurrentValue() - 2,50,getNewValue() - 2);
            newPoint(0,getCurrentValue() + 3,50,getNewValue() + 3);
            newPoint(0,getCurrentValue() - 3,50,getNewValue() - 3);
            
            updateCurrentValue(getNewValue());
            
            if(getClass() == FireCompany.class) {
                ((MyWorld)getWorld()).addObject(new FireCompany(400),spawnPoint,300);
            } else if(getClass() == GreenCompany.class) {
                ((MyWorld)getWorld()).addObject(new GreenCompany(400),spawnPoint,300);
            } else if(getClass() == PinkCompany.class) {
                ((MyWorld)getWorld()).addObject(new PinkCompany(400),spawnPoint,300);
            } else if(getClass() == WaterCompany.class) {
                ((MyWorld)getWorld()).addObject(new WaterCompany(400),spawnPoint,300);
            }
        }
        incrementIteration();
        
        if (getIteration() > 30) {
            ((MyWorld)getWorld()).removeObject(this);
        }
    }
      
    public abstract void updateCurrentValue(int x);
    
    public abstract int getCurrentValue();
    
    public abstract int getNewValue();
    
    public abstract void setNewValue(int x);
    
    public abstract int getIteration();
    
    public abstract void incrementIteration();
    
    public abstract void newPoint(int x1, int y1, int x2, int y2);
    
    public abstract String toString();

}
