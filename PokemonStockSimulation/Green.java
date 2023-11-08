import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The effect for the Green stock
 * 
 * @Liyu
 * @Nov 8 2023
 */
public class Green extends Weather
{
    public Green(){
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
        
        //increase green stock price
        
        
        //decrease blue stock price
    }
}
