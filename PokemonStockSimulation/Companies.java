import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Super class for each company that holds the functions used by all companies
 * and properly abstracts and statics certain variables for efficient code.
 * 
 * @author Mekaeel
 * @version November 29th, 2023
 */
public abstract class Companies extends Actor
{   
    // Constants defining default values for spawn point, clock, and line width
    protected int spawnPoint = 1775;
    protected static int clock = 0;
    protected static int lineWidth = 156;
    
    // Variable to store the rate of stock variance
    protected static int varianceRate;
    
    // Variables to represent two instances of Companies
    protected static Companies company1, company2;
    
    // Image to store the stock price graph
    protected static GreenfootImage points = new GreenfootImage(lineWidth, 550);
    protected GreenfootImage finishedPoints;
    
    // Constructor for the Companies class
    public Companies() {
    }
    
    /**
     * Act - do whatever the FireCompany wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Trigger the nextPoint method when the clock reaches 48 in the first iteration
        if(clock == 48 && getIteration() == 0) {
            nextPoint();            
        }
    }
    
    /**
     * Method to generate the next point in the stock price graph
     */ 
    public void nextPoint() {  
        // Check if the stock price was not manually modified
        if(wasModified() == false) {
            // Determines whether to randomly increase or randomly decrease the stock price
            int changeType = Greenfoot.getRandomNumber(2); 
            // Increase the stock price
            if(changeType == 0){
                setNewValue(getCurrentValue() - Greenfoot.getRandomNumber(varianceRate)); 
            }
            // Decrease the stock price
            else{
                setNewValue(getCurrentValue() + Greenfoot.getRandomNumber(varianceRate));
            }
        }
        
        // Draw the line representing the new point in the stock price graph
        newPoint(0, getCurrentValue(), 101, getNewValue());
        
        // Update the current value of the stock
        updateCurrentValue(getNewValue());
        
        // Reset the modified flag
        resetModified();
    }
    
    // Abstract methods to be implemented by subclasses
    public abstract void updateCurrentValue(int x);
    public abstract int getCurrentValue();
    public abstract int getNewValue();
    public abstract void setNewValue(int x);
    public abstract boolean wasModified();
    public abstract void resetModified();
    public abstract int getIteration();
    public abstract greenfoot.Color getColor();
    public abstract void incrementIteration();
    
    // Method to draw a new point on the stock price graph
    public void newPoint(int x1, int y1, int x2, int y2) {
        // Check if the current company is either company1 or company2 and draw additional lines
        if(company1.toString() == toString() || company2.toString() == toString()) {
            points.setColor(Color.BLACK);
            
            points.drawLine(x1 + 3, y1, x2 + 3, y2);
            points.drawLine(x1 - 3, y1, x2 - 3, y2);
            
            points.drawLine(x1, y1 + 3, x2, y2 + 3);
            points.drawLine(x1, y1 - 3, x2, y2 - 3);
            
            points.drawLine(x1 + 4, y1, x2 + 4, y2);
            points.drawLine(x1 - 4, y1, x2 - 4, y2);
            
            points.drawLine(x1, y1 + 4, x2, y2 + 4);
            points.drawLine(x1, y1 - 4, x2, y2 - 4);
        }
        
        // Set the color and draw the main line along with additional lines for visual effect
        points.setColor(getColor());
        
        points.drawLine(x1, y1, x2, y2);
        
        points.drawLine(x1 + 1, y1, x2 + 1, y2);
        points.drawLine(x1 - 1, y1, x2 - 1, y2);
        
        points.drawLine(x1, y1 + 1, x2, y2 + 1);
        points.drawLine(x1, y1 - 1, x2, y2 - 1);
        
        points.drawLine(x1 + 2, y1, x2 + 2, y2);
        points.drawLine(x1 - 2, y1, x2 - 2, y2);
        
        points.drawLine(x1, y1 + 2, x2, y2 + 2);
        points.drawLine(x1, y1 - 2, x2, y2 - 2);
    }
    
    // Methods to increase and decrease the stock price by a given value
    public void increaseValue(int x) {
        setNewValue(getNewValue() - x);
    }
    
    public void decreaseValue(int x){
        setNewValue(getNewValue() + x);
    }
    
    // Method to get the normalized value of the stock for display purposes
    public float getValue() {
        return (600 - getCurrentValue()) / 6;
    }
    
    // Abstract method to get a string representation of the company
    public abstract String toString();
    
    // Method to set the stock variance rate for all companies
    public void setVarianceRate(int x) {
        varianceRate = x;
    }
}