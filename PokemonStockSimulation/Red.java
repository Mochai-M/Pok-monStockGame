import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The effect for the Red stock
 * 
 * @Liyu 
 * @Nov 11 2023
 */
public class Red extends Weather
{
    //private int red = redPrice.getValue();
    //private int blue = bluePrice.getValue();
    
    //constructor for the red class
    public Red(){
        //sets the size and length for the effect
        super(100,10);
    }
    
    public void act()
    {
        //add weather to center of the world
        getWorld().addObject(this ,getX()/2, getY()/2);
    }
    
    
    /**
     * increases the red stock price
     * decreases the green stock price
     */
    public void addWeather(){
        
        
        //increase red stock price
        //redPrice += 20;
        
        //decrease green stock price
        //green_stock -= 20;
    }
}
