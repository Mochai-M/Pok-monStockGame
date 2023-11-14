import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Companies here.
 * 
 * @author Mekaeel
 * @version November 14th, 2023
 */

public abstract class Companies extends Actor
{   
    protected int clock;
    
    public Companies() {
        clock = 0;
    }
    
    public void act() {
        clock++;
        if(clock > 100) {
            nextPoint();
            clock = 0;
        }
    }
    
    public void nextPoint() {
        setNewValue(Greenfoot.getRandomNumber(600));
        
        if(getIteration() == 0) {           
            newPoint(0,getCurrentValue(),50,getNewValue());
            newPoint(0,getCurrentValue() + 3,50,getNewValue() + 3);
            newPoint(0,getCurrentValue() - 3,50,getNewValue() - 3);
            
            updateCurrentValue(getNewValue());
            
            if(getClass() == FireCompany.class) {
                ((MyWorld)getWorld()).addObject(new FireCompany(400),1625,300);
            } else if(getClass() == GreenCompany.class) {
                ((MyWorld)getWorld()).addObject(new GreenCompany(400),1625,300);
            } else if(getClass() == PinkCompany.class) {
                ((MyWorld)getWorld()).addObject(new PinkCompany(400),1625,300);
            } else if(getClass() == WaterCompany.class) {
                ((MyWorld)getWorld()).addObject(new WaterCompany(400),1625,300);
            }
        }
        
        setLocation(getX() - 50, getY());
        incrementIteration();
        
        if (getIteration() > 32) {
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
