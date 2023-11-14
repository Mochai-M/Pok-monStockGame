import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Effect for the Blue stock
 * 
 * @Liyu 
 * @Nov 11 2023
 */
public class Blue extends Weather
{
    
    
    
    public Blue(){
        //sets the size and length for the effect
        super(2500,60);
    }
    
    public void act()
    {
        super.act("WaterCompany", "FireCompany");
    }
    

}
