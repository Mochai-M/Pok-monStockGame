import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

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
        
        //setting the size, and opaqueness of the Weather 
        GreenfootImage image = getImage();
        
        image.scale(2500,2500);
        
        image.setTransparency(100);
    }
    
    
    public void act(String Company1, String Company2){
      //Sets a timer for how long the weather effect should last (60 acts)
      durationLength--;
      
      //Places the Weather randomly in the world to give the illusion that its animating
      setLocation(Greenfoot.getRandomNumber(150), Greenfoot.getRandomNumber(150));
      
      //get ALL Companues caught in the "Weather Storm" and 2 of the 4 companies
      ArrayList<Companies> companies = (ArrayList<Companies>)getObjectsInRange (1500, Companies.class);
      
      for (Companies c : companies){
          //raises the stock price for company 1
          if(c.toString().equals(Company1)){
              c.getCurrentValue();
              c.updateValue();
          }
          //lowers the stock price for company 2
          else if(c.toString().equals(Company2)){
              c.getCurrentValue();
              c.updateValue();
          }
          
      } 
      
      
      //when the timer is up, set durationLength back to 60 and remove Object 
      if(durationLength == 0){
        getWorld().removeObject(this);
        durationLength = 60;
      }
    }
    
}
