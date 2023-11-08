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
    private int animationIndex; //  specifies image from the array is being shown
    private int animationDelay; // delay is how long between changes
    private int animationCounter; // counter is how far into waiting between act changes
    
    public Icons() {
        // Declare my array to hold the 16 images I created
        images = new GreenfootImage[16];
        // use a standard for loop to populate the array
        for (int i = 0; i < images.length; i++){
            // note how the file name is built around the i variable
            images[i] = new GreenfootImage ("pokemon0" + i + ".png");
        }
        
        // start on the 0th (first) image
        animationIndex = 0;
        
        // set a delay (currently 10 acts between image changes)
        animationDelay = 10;
        animationCounter = animationDelay;
        
        // set an image to represent this Actor when it starts
        setImage(images[animationIndex]);
        
    }

    public void act()
    {
        // will add later
    }
}
