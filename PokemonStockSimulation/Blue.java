import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effect for the Blue stock
 * 
 * @Liyu 
 * @Nov 8 2023
 */
public class Blue extends Weather
{
    
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
        
        
        //decrease red stock price
    }
}
