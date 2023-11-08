import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effects for the pink stock
 * 
 * @Liyu
 * @Nov 8 2023
 */
public class Pink extends Weather
{
    public Pink(){
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
        
        //increase pink stock price
        
        
        //decrease green stock price
    }
}
