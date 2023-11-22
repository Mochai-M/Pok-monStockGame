import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effects for the pink stock
 * 
 * @Liyu
 * @Nov 11 2023
 */
public class PinkEffect extends Weather
{
    public PinkEffect(){
        //sets the size and length for the effect
        super(300,60);

    }
    
    public void act()
    {
        super.act("PinkCompany", "FireCompany");
    }
    
}
