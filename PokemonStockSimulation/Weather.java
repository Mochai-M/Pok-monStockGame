import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * <p> Weather Class affects the stock prices of certain companies. It occurs randomly throughout the simulation. </p> 
 * 
 * 
 * 
 * 
 * @Liyu Xiao
 * @Nov 8 2023
 * 
 * 
 * 
 * 
 */
public abstract class Weather extends Actor
{
    //the size of the image
    protected int imageSize;
    
    //the length of the weather effect
    protected int durationLength;
    
    
    
    /**
     * The constructor for the weather class 
     * @param int ImageSize, the size of the image
     * @param int length, the length of the effect
     * 
     */
    public Weather(int imageSize, int length){
        this.imageSize = imageSize;
        durationLength = length;
    }
    
    
    //Adds the certain type of weather into the world
    public abstract void addWeather();
    
    
    
}
