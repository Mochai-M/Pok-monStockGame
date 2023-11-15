import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Companies here.
 * 
 * @author Mekaeel
 * @version November 14th, 2023
 */

public abstract class Companies extends Actor
{   
    protected int spawnPoint = 1675;
    protected int clock;
    protected int lineWidth = 54;
    protected boolean modified = false;

    
    public Companies() {
        clock = 0;
    }
    
    public void act() {
        clock++;
        
        if(clock > 50) {
            nextPoint();
            clock = 0;
        }
        
        setLocation(getX() - 1, getY());
        
        if (getIteration() > 30) {
            ((MyWorld)getWorld()).removeObject(this);
        }
    }
    
    public void nextPoint() {        
        if(getIteration() == 0) {         
            if(modified == false) {
                setNewValue(Greenfoot.getRandomNumber(600));
            }
            
            newPoint(0,getCurrentValue(),51,getNewValue());
            
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
            modified = false;
        }
        incrementIteration();
    }
      
    public abstract void updateCurrentValue(int x);
    
    public abstract int getCurrentValue();
    
    public abstract int getNewValue();
    
    public abstract void setNewValue(int x);
    
    public abstract int getIteration();
    
    public abstract void incrementIteration();
    
    public abstract void newPoint(int x1, int y1, int x2, int y2);
    
    public void modifyValue(int x) {
        setNewValue(getNewValue() + x);
        modified = true;
    }
    
    public abstract String toString();

}
