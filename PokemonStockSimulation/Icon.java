import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Effect here.
 * 
 * @Natalie Huang
 * @version 1.0 (11/8/2023)
 */
public class Icon extends Actor
{
    //one class and it gets called with a different image
    //when one stock from company goes up, character becomes happy & vice versa 
    
    private GreenfootImage[] images = new GreenfootImage[4]; // stores the images
    private int imageNumber;
    public Icon(String x) {
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage(x + i + ".png" );
            images[i].scale(350, 250);
            setImage(images[imageNumber]);   
        }
    }
    
    public void animation(){
        imageNumber = (imageNumber + 1) % images.length;
        setImage(images[imageNumber]);
    }

    public void act(String Company1)
    {
        animation();
        

      
    }
    
    
    public boolean checkCompany(String Company1){
            //get ALL Companies caught in the "Weather Storm" and 2 of the 4 companies
        /**
         * ArrayList<Companies> companies = (ArrayList<Companies>)getObjectsInRange (100, Companies.class);
        for (Companies c : companies){
              //raises the stock price for company 1
              if(c.toString().equals(Company1)){
                  return true;
              }

      }
         */ 
        
        return true;
    }
}
