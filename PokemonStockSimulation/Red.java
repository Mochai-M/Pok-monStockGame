import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The effect for the Red stock
 * 
 * @Liyu 
 * @Nov 11 2023
 */
public class Red extends Weather
{
    //private int redPrice = redCompany.getValue();
    //private int bluePrice = blueCompany.getValue();
    
    //constructor for the red class
    public Red(){
        //sets the size and length for the effect
        super(100,10);
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    
    /**
     * increases the red stock price
     * decreases the green stock price
     */
    public void addWeather(){
        //add weather to center of the world
        getWorld().addObject(this ,getX()/2, getY()/2);
        
        //increase red stock price
        //red_stock += 20;
        
        //decrease green stock price
        //green_stock -= 20;
    }
}
