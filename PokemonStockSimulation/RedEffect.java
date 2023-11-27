import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The effect for the Red stock
 * 
 * @Liyu 
 * @Nov 24 2023
 * 
 * 
 * sound Effects credits link: https://mixkit.co/free-sound-effects/fire/
 * Image Credits link : https://martincrownover.com/gamemaker-examples-tutorials/particles-fire/
 */
public class RedEffect extends Weather
{
    //initialize, the fire sound
    GreenfootSound fireSound;
    
    
    public RedEffect(){
        //sets the size and length for the effect
        super(250,160, "FireEffect.gif");
        fireSound = new GreenfootSound("fire.wav");
        fireSound.setVolume(10);
    }
    
    public void act()
    {
        super.act("FireCompany", "GreenCompany");
        fireSound.play();
    }
}
