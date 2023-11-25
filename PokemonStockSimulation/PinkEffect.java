import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effects for the pink stock
 * 
 * @Liyu
 * @Nov 24 2023
 * 
 * 
 * image credits: https://www.pinterest.ca/pin/329114685245117235/
 */
public class PinkEffect extends Weather
{
    public PinkEffect(){
        //sets the size and length for the effect
        super(250,100, "fairy.gif");

    }
    
    public void act()
    {
        super.act("PinkCompany", "FireCompany");
    }
    
}
