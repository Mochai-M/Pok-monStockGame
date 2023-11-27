import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effects for the pink stock
 * 
 * @Liyu
 * @Nov 24 2023
 * 
 * 
 * image credits: https://www.pinterest.ca/pin/329114685245117235/
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
        super(250,100, "fairy.gif");
        
        
        pinkSound.setVolume(20);
    }
    
    public void act()
    {
        super.act("Fairy", "Water");
        
        pinkSound.play();
    }
    
}
