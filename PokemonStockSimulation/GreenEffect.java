import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The effect for the Green stock
 * 
 * @Liyu Xiao
 * @Nov 28 2023
 * 
 * image link: https://tenor.com/view/leaves-gif-16219912
 * 
 * sound link: https://mixkit.co/free-sound-effects/wind/
 */
public class GreenEffect extends Weather
{
    GreenfootSound greenSound = new GreenfootSound("green.mp3");
    public GreenEffect(){
        //sets the size and length for the effect
        super(300,100, "leaves.gif");
        
        greenSound.setVolume(20);
        
    }
    
    
    //Inherits the act method from weather class
    public void act()
    {
        super.act("Plant", "Water");
        
        greenSound.play();
    }

}
