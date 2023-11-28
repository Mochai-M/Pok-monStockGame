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
    protected static int lineWidth = 156;
    
    public static GreenfootImage points = new GreenfootImage(lineWidth,550);
    public GreenfootImage finishedPoints;

    
    public Companies() {
        clock = 0;
    }
    
    public void act() {       
        if(clock >= 50) {
            nextPoint();
            clock = 0;
            if(getClass() == FireCompany.class) {
                incrementIteration();
            }
        }
        clock++;
    }
    
    public void nextPoint() {        
        if(getIteration() == 0 || getClass() != FireCompany.class) {         
            if(wasModified() == false) {
                //Determines whether to randomly increase of randomly decrease the stock price
                int changeType = Greenfoot.getRandomNumber(2); 
                //increase the stock price
                if(changeType == 0){
                   setNewValue(getCurrentValue()-Greenfoot.getRandomNumber(40)); 
                }
                //decrease the stock price
                else{
                    setNewValue(getCurrentValue()+Greenfoot.getRandomNumber(40));
                }
            }
            
            newPoint(0,getCurrentValue(),101,getNewValue());
            
            updateCurrentValue(getNewValue());
            
            if(getClass() == FireCompany.class) {
                finishedPoints = new GreenfootImage(getImage());
                
                points = new GreenfootImage(lineWidth,550);
                
                setImage(finishedPoints);
            }
            
            if(getClass() == FireCompany.class) {
                ((MyWorld)getWorld()).addObject(new FireCompany(),spawnPoint,275);
            }
            
            resetModified();
        }
    }
      
    public abstract void updateCurrentValue(int x);
    
    public abstract int getCurrentValue();
    
    public abstract int getNewValue();
    
    public abstract void setNewValue(int x);
    
    public abstract boolean wasModified();
    
    public abstract void resetModified();
    
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
    
    public void increaseValue(int x) {
        setNewValue(getNewValue() - x);
    }
    
    public void decreaseValue(int x){
        setNewValue(getNewValue() + x);
    }
    
    public float getValue() {
        return (600 - getCurrentValue())/6;
    }
    
    public abstract String toString();

}
