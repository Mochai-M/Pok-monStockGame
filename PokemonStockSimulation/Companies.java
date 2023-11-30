import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Super class for each company that holds the functions used by all companies
 * and properly abstracts and statics certain variables for efficient code.
 * 
 * @author Mekaeel
 * @version November 14th, 2023
 */

public abstract class Companies extends Actor
{   
    protected int spawnPoint = 1775;
    protected static int clock = 0;
    protected static int lineWidth = 156;
    
    protected static int varianceRate;
    
    protected static Icon[] players;
    
    protected static GreenfootImage points = new GreenfootImage(lineWidth,550);
    protected GreenfootImage finishedPoints;

    
    public Companies() {
    }
    
    public void act() {
        
        if(clock == 48 && getIteration() == 0) {
            nextPoint();            
        }
    }
    
    public void nextPoint() {  
        if(wasModified() == false) {
            //Determines whether to randomly increase of randomly decrease the stock price
            int changeType = Greenfoot.getRandomNumber(2); 
            //increase the stock price
            if(changeType == 0){
               setNewValue(getCurrentValue()-Greenfoot.getRandomNumber(varianceRate)); 
            }
            //decrease the stock price
            else{
                setNewValue(getCurrentValue()+Greenfoot.getRandomNumber(varianceRate));
            }
        }
        
        newPoint(0,getCurrentValue(),101,getNewValue());
        
        updateCurrentValue(getNewValue());
        
        resetModified();
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
        if(players[0].getCompany() == toString() || players[1].getCompany() == toString()) {
            points.setColor(Color.BLACK);
            
            points.drawLine(x1 + 3,y1,x2 + 3,y2);
            points.drawLine(x1 - 3,y1,x2 - 3,y2);
            
            points.drawLine(x1,y1 + 3,x2,y2 + 3);
            points.drawLine(x1,y1 - 3,x2,y2 - 3);
            
            points.drawLine(x1 + 4,y1,x2 + 4,y2);
            points.drawLine(x1 - 4,y1,x2 - 4,y2);
            
            points.drawLine(x1,y1 + 4,x2,y2 + 4);
            points.drawLine(x1,y1 - 4,x2,y2 - 4);
        }
        
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
    
    public void setVarianceRate(int x) {
        varianceRate = x;
    }

}
