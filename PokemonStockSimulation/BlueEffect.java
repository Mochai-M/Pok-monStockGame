import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effect for the Blue stock
 * 
 * @Liyu 
 * @Nov 21 2023
 * 
 * Image link: https://forums.synfig.org/t/still-not-sorted-out-falling-rain/1927
 * 
 */
public class BlueEffect extends Weather
{
    
    
    public BlueEffect(){
        //sets the size and length for the effect
        super(300,100, "rain.gif");
    }
    
    public void act()
    {
        super.act("WaterCompany", "FireCompany");
    }
    

}
