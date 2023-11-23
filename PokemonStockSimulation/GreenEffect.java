import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The effect for the Green stock
 * 
 * @Liyu
 * @Nov 11 2023
 */
public class GreenEffect extends Weather
{
    public GreenEffect(){
        //sets the size and length for the effect
        super(300,60, "leaves.gif");
        
        
    }
    
    public void act()
    {
        super.act("GreenCompany", "WaterCompany");
    }

}
