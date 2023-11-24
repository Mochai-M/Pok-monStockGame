import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The effect for the Green stock
 * 
 * @Liyu
 * @Nov 11 2023
 * 
 * image link: https://tenor.com/view/leaves-gif-16219912
 */
public class GreenEffect extends Weather
{
    public GreenEffect(){
        //sets the size and length for the effect
        super(300,100, "leaves.gif");
        
        
    }
    
    public void act()
    {
        super.act("GreenCompany", "WaterCompany");
    }

}
