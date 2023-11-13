import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effect for the Blue stock
 * 
 * @Liyu 
 * @Nov 11 2023
 */
public class Blue extends Weather
{
    
    //private int bluePrice = BlueCompany.getValue();
    //private int redPrice = RedCompany.getValue();
    
    public Blue(){
        //sets the size and length for the effect
        super(100,10);
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
    public void addWeather(){
        //add weather to center of the world
        getWorld().addObject(this ,getX()/2, getY()/2);
        
        //increase blue stock price
        /**
         * bluePrice = blueCompany.setValue(bluePrice + 20);
         * 
         */
        
        //decrease red stock price
        /**
         * redPrice = redCompany.setValue(redPrice - 20);
         * 
         */
    }
}
