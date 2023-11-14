import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Effect here.
 * 
 * @Natalie Huang
 * @version 1.0 (11/8/2023)
 */
public class Icons extends Actor
{
    //one class and it gets called with a different image
    //when one stock from company goes up, character becomes happy & vice versa 
    
    private GreenfootImage[] images; // stores the images
    int imageNumber;
    
    public Icons(String x) {
        for(int i = 1; i < images.length + 1; i++){
            images[i] = new GreenfootImage(x + i + ".png" );
            setImage(images[imageNumber]);   
        }
    }
    
    
    public void animation(){
        imageNumber = (imageNumber + 1) % images.length;
        setImage(images[imageNumber]);
    }

    public void act()
    {
        animation();
    }
}
