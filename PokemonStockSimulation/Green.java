import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The effect for the Green stock
 * 
 * @Liyu
 * @Nov 11 2023
 */
public class Green extends Weather
{
    //private int greenPrice = GreenCompany.getValue();
    //private int bluePrice = BlueCompany.getValue();
    
    GreenfootImage greenImage = this.getImage();
    
    public Green(){
        //sets the size and length for the effect
        super(100,10);
        
        greenImage.scale(1000,1000);
    }
    
    public void act()
    {
        //add weather to center of the world
        getWorld().addObject(this ,getX()/2, getY()/2);
    }
    
    public void addWeather(){
        //increase green stock price
        /**
         * greenPrice = greenCompany.setValue(bluePrice + 20);
         * 
         */
        
        //decrease blue stock price
        /**
         * bluePrice = blueCompany.setValue(redPrice -4 20);
         * 
         */
    }
}
