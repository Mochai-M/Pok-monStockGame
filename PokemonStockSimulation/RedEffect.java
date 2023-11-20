import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The effect for the Red stock
 * 
 * @Liyu 
 * @Nov 11 2023
 */
public class RedEffect extends Weather
{
    public RedEffect(){
        //sets the size and length for the effect
        super(1000,60);

    }
    
    public void act()
    {
        
        super.act("FireCompany", "GreenCompany");
    }
}
