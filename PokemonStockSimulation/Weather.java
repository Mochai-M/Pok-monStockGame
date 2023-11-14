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
        
        image.scale(imageSize,imageSize);
        
        image.setTransparency(100);
    }
    
    
    public void act(String Company1, String Company2){
        
      int actCount = 0;
      
      
      if(actCount<durationLength)
      {
            setLocation(getX(),getY()+10);   //The object drops down
            actCount++;
      }
      
      
      //get ALL Companues caught in the "Weather Storm" and 2 of the 4 companies
      ArrayList<Companies> companies = (ArrayList<Companies>)getObjectsInRange (100, Companies.class);
      
      for (Companies c : companies){
          //raises the stock price for company 1
          if(c.toString().equals(Company1)){
              //c.getCurrentValue();
              //c.updateValue();
          }
          //lowers the stock price for company 2
          else if(c.toString().equals(Company2)){
              //c.getCurrentValue();
              //c.updateValue();
          }
          
      } 
      
      
    }
    
    
}
