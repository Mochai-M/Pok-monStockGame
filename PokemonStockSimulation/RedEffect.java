import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The effect for the Red stock
 * 
 * @Liyu 
 * @Nov 24 2023
 * 
 * 
 * sound Effects credits link: https://elements.envato.com/fire-BD6EJQS?utm_source=mixkit&utm_medium=referral&utm_campaign=elements_mixkit_cs_sfx_tag_CM2023&_ga=2.87020696.1834148410.1700853703-1213142309.1698190566
 * Image Credits link : https://martincrownover.com/gamemaker-examples-tutorials/particles-fire/
 */
public class RedEffect extends Weather
{
    //initialize, the fire sound
    GreenfootSound fireSound = new GreenfootSound("fire.mp3");
    
    
    public RedEffect(){
        //sets the size and length for the effect
        super(300,120, "FireEffect.gif");
        
        fireSound.setVolume(30);
        
    }
    
    public void act()
    {
        fireSound.play();
        super.act("FireCompany", "GreenCompany");
    }
}
