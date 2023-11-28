import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * <p> Weather Class affects the stock prices of certain companies. It occurs randomly throughout the simulation. </p> 
 * 
 * 
 * 
 * 
 * @Liyu Xiao, Mekaeel Malik
 * @Nov 24 2023
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
        
        //Size of the image
        this.imageSize = imageSize;
        
        //Act length for the weather
        durationLength = length;
        
        //Initializes the Gif Image
        weather = new GifImage(theWeather);
        
        
        
        //Scales all the images to the desired size
        for (GreenfootImage image : weather.getImages())
        {
            int wide = image.getWidth()*imageSize/100;
            int high = image.getHeight()*imageSize/100;
            image.scale(wide+300, high);
            
            image.setTransparency(50);

            
        }
    }
    
    
    
    /**
     * <p> The act method for the weather class, affects the certain stock price that it's related to </p>
     * @param String Company1, the name of the first company
     * @param String Company 2, the name of the second company
     */
    public void act(String Company1, String Company2){
      //The act count for 
      durationLength--;
      
      //Animates the image
      setImage(weather.getCurrentImage());
      
      //get ALL Companies caught in the "Weather Storm" and 2 of the 4 companies
      ArrayList<Companies> companies = (ArrayList<Companies>)getWorld().getObjects(Companies.class);
      
      
      int changeValue = 30;
      
      for (Companies c : companies){
          //raises the stock price for company 1
          if(c.toString().equals(Company1) && c.getIteration() == 0){
              c.increaseValue(changeValue);
              break;
          }
      } 
      for (Companies c : companies){
          //lowers the stock price for company 2
          if(c.toString().equals(Company2) && c.getIteration() == 0){
              c.decreaseValue(changeValue);
              break;
          }
      }
      
      
      //when the weather ends, remove the object
      if(durationLength == 0){
          getWorld().removeObject(this);
      }
    }
    
    
}
