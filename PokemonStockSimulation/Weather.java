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
        
        image.scale(imageSize,imageSize+300);
        
        
        //
        image.setTransparency(180);
    }
    
    
    
    /**
     * The act method for the weather class
     * @param String Company1, the name of the first company
     * @param String Company 2, the name of the second company
     */
    public void act(String Company1, String Company2){
      //The act count for 
      int actCount = 0;
      
      
      if(actCount<durationLength)
      {
            setLocation(getX(),getY()+15);   //The object drops down
            actCount++;
      }
      
      
      
      //get ALL Companies caught in the "Weather Storm" and 2 of the 4 companies
      ArrayList<Companies> companies = (ArrayList<Companies>)getObjectsInRange (100, Companies.class);
      
      for (Companies c : companies){
          //raises the stock price for company 1
          if(c.toString().equals(Company1)){
              int currentValue = c.getCurrentValue();
              int changeValue = Greenfoot.getRandomNumber(100)+200;
              c.setNewValue(currentValue  - changeValue);
          }
          //lowers the stock price for company 2
          else if(c.toString().equals(Company2)){
              int currentValue = c.getCurrentValue();
              int changeValue = Greenfoot.getRandomNumber(100)+200;
              c.setNewValue(currentValue + changeValue);
          }
          else{
              c.setNewValue(c.getCurrentValue());
          }
          
      } 
      
      
    }
    
    
}
