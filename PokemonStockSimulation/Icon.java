import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Effect Class
 * 
 * @Natalie Huang, Liyu Xiao
 * @November 28
 */
public abstract class Icon extends Actor
{
    //one class and it gets called with a different image
    //when one stock from company goes up, character becomes happy & vice versa 
    
    private GreenfootImage[] images = new GreenfootImage[4]; // stores the images
    private int imageNumber;
    protected GreenfootImage icon;
    /**
     * Constructor for the Icon Class
     * <p> Includes looping through the photos and scaling each one to make sure they fit 
     * well on the screen
     */
    public Icon(String x) {
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage(x + i + ".png" );
            images[i].scale(250, 200);
            setImage(images[imageNumber]);   
        }
    }
    
    /**
     * Will loop through the icon images and 
     * images on screen will change 
     */
    public void animation(){
        imageNumber = (imageNumber + 1) % images.length;
        setImage(images[imageNumber]);
    }
    
    /**
     * Act Method
     * 
     * @param Company1      Will find out which company is affected
     */
    public void act(String Company1)
    {
        checkCompany(Company1);
    }
    
    /**
     * Will check which company is affected and will base stocks and emotions of the icons based on it
     * 
     * @param Company1 Finding out icons affected by stocks
     */
    public void checkCompany(String Company1){
        //Finds which company to affect
        ArrayList<Companies> companies = (ArrayList<Companies>)getObjectsInRange (3000, Companies.class);
        for (Companies c : companies){
            //raises the stock price for company 1
            if(c.toString().equals(Company1)){
            float stockPrice = c.getValue();
            if(stockPrice > 90){
                icon = images[0]; //happy ditto
                setImage(icon);
            }else if (stockPrice > 60){
                icon = images[2]; // normal  
                setImage(icon);
            }else if (stockPrice > 40){
                icon = images[1]; //angry 
                setImage(icon);
            }else{
                icon = images[3]; //sad ditto
                setImage(icon);
            }
        }

      }
    }
    
    //gets the name of the company, the icon belongs to
    public abstract String getCompany();
}
