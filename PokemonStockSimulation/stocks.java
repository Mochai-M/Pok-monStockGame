import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class stocks extends Actor
{
    //stores the current stock price for the company
    //the price ranges from 0-100
    protected int stockPrice;
    
    public stocks(int thePrice){
        //(initializes the stock price)
        stockPrice = thePrice;
    }
    
    public void act(){
        //calls the randomizer price method
        randomizePrice();
    }
    
    //sets the value of the stock
    public void setValue(int newStockPrice){
         newStockPrice = stockPrice;
    }
    
    //gets the value of the stock
    public int getValue(){
        return this.stockPrice;
    }
    
    //randomizes the stock price
    public void randomizePrice(){
        int stockIncrease = Greenfoot.getRandomNumber(20);
        
        int stockDecrease = Greenfoot.getRandomNumber(20) - 30;
        
        //delay the stock price change by 20 acts
        Greenfoot.delay(20);
        
        
        //if choice = 0 stock increases, if choice = 1 stock decreases
        int choice = Greenfoot.getRandomNumber(2);
        
        if(choice == 1){
            stockPrice += stockIncrease;
        }
        else if(choice == 0){
            stockPrice += stockDecrease;
        }
    }
    
}
