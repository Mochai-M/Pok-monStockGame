import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effect for the Blue stock
 * 
 * @Liyu 
 * @Nov 11 2023
 */
public class Blue extends Weather
{
    
    
    
    

    public Blue(){
        //sets the size and length for the effect
        super(2500,60);
    }
    
    public void act()
    {
        super.act("WaterCompany", "FireCompany");
        //add weather to center of the world
        getWorld().addObject(this ,getX()/2, getY()/2);
    }
    
    public void addWeather(){
        
        //increase blue stock price
        //bluePrice = blueCompany.setValue(bluePrice + 20);
    
        
        //decrease red stock price
        /**
         * redPrice = redCompany.setValue(redPrice - 20);
         * 
         */
    }
}
