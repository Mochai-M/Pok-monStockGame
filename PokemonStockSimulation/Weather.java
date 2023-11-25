import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * <p> Weather Class affects the stock prices of certain companies. It occurs randomly throughout the simulation. </p> 
 * 
 * 
 * 
 * 
 * @Liyu Xiao
 * @Nov 24 2023
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
    
    //initializes Gif image for the weatehr
    protected GifImage weather;
    
    
    /**
     * <p> The constructor for the weather class  </p>
     * 
     * @param int ImageSize, the size of the image
     * @param int length, the length of the effect
     * @param String weather, the name of the gif image, for the weather
     */
    public Weather(int imageSize, int length, String theWeather){
        this.imageSize = imageSize;
        durationLength = length;
        weather = new GifImage(theWeather);
        

        for (GreenfootImage image : weather.getImages())
        {
            int wide = image.getWidth()*imageSize/100;
            int high = image.getHeight()*imageSize/100;
            image.scale(wide, high);
            
            image.setTransparency(50);

            
        }
    }
    
    
    
    /**
     * <p> The act method for the weather class </p>
     * @param String Company1, the name of the first company
     * @param String Company 2, the name of the second company
     */
    public void act(String Company1, String Company2){
      //The act count for 
      durationLength--;
      
      

      setImage(weather.getCurrentImage());
      
      //get ALL Companies caught in the "Weather Storm" and 2 of the 4 companies
      ArrayList<Companies> companies = (ArrayList<Companies>)getObjectsInRange (1500, Companies.class);
      
      for (Companies c : companies){
          //raises the stock price for company 1
          if(c.toString().equals(Company1)){
              int changeValue = Greenfoot.getRandomNumber(3);
              c.increaseValue(changeValue);
          }
          //lowers the stock price for company 2
          else if(c.toString().equals(Company2)){
              int changeValue = Greenfoot.getRandomNumber(3);
              c.decreaseValue(changeValue);
          }
      } 
      
      
      
      //when the weather ends, remove the object
      if(durationLength == 0){
          getWorld().removeObject(this);
      }
    }
    
    
}
