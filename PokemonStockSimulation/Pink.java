import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effects for the pink stock
 * 
 * @Liyu
 * @Nov 11 2023
 */
public class Pink extends Weather
{
    //private int pinkPrice = PinkCompany.getValue();
    //private int redPrice = RedCompany.getValue();
    
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
        /**
         * pinkPrice = pinkCompany.setValue(PinkCompany.getValue() + 20);
         * 
         */
        
        //decrease red stock price
        /**
         * redPrice = redCompany.setValue(RedCompany.getValue() - 20);
         * 
         */
    }
    
}
