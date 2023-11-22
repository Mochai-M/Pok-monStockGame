import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * <p> Weather Class affects the stock prices of certain companies. It occurs randomly throughout the simulation. </p> 
 * 
 * 
 * 
 * 
 * @Liyu Xiao
 * @Nov 21 2023
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
    
    //initializes Gif image
    protected GifImage rain = new GifImage("Rain.gif");
    
    
    /**
     * The constructor for the weather class 
     * @param int ImageSize, the size of the image
     * @param int length, the length of the effect
     * 
     */
    public Weather(int imageSize, int length){
        this.imageSize = imageSize;
        durationLength = length;
        

        
        for (GreenfootImage image : rain.getImages())
        {
            int wide = image.getWidth()*imageSize/100;
            int high = image.getHeight()*imageSize/100;
            image.scale(wide, high);
            
            image.setTransparency(100);
            image.setColor(Color.BLUE);
            
        }
    }
    
    
    
    /**
     * The act method for the weather class
     * @param String Company1, the name of the first company
     * @param String Company 2, the name of the second company
     */
    public void act(String Company1, String Company2){
      //The act count for 
      durationLength--;
      
      //animates the rain
      setImage(rain.getCurrentImage());

      
      
      //get ALL Companies caught in the "Weather Storm" and 2 of the 4 companies
      ArrayList<Companies> companies = (ArrayList<Companies>)getObjectsInRange (1500, Companies.class);
      
      for (Companies c : companies){
          //raises the stock price for company 1
          if(c.toString().equals(Company1)){
              int currentValue = c.getCurrentValue();
              int changeValue = Greenfoot.getRandomNumber(10)+100;
              c.modifyValue(changeValue);
          }
          //lowers the stock price for company 2
          else if(c.toString().equals(Company2)){
              int currentValue = c.getCurrentValue();
              int changeValue = Greenfoot.getRandomNumber(10)+100;
              c.modifyValue(changeValue);
          }
          else{
              c.setNewValue(c.getCurrentValue());
          }
          
      } 
      
      if(durationLength == 0){
          getWorld().removeObject(this);
      }
    }
    
    
}
