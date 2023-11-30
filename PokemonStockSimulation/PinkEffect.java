import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effects for the pink stock
 * 
 * @Liyu Xiao
 * @Nov 28 2023
 * 
 * 
 * image credits: https://tenor.com/view/hearts-pink-hearts-going-up-gif-17654443
 * 
 * 
 * 
 * sound credits: https://pixabay.com/sound-effects/search/fairy/
 */
public class PinkEffect extends Weather
{
    //initialize, the fire sound
    GreenfootSound pinkSound = new GreenfootSound("fairy.mp3");
    
    public PinkEffect(){
        //sets the size and length for the effect
        super(200,100, "fairy.gif");
        
        
        pinkSound.setVolume(40);
    }
    
    
    //Inherits the act method from weather class
    public void act()
    {
        super.act("Pink", "Water");
        
        pinkSound.play();
    }
    
}
