import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Charmander Class
 * 
 * @Natalie
 * @November 23
 */
public class Charmander extends Icon
{
    /**
     * Constructor for Charmander
     */
    public Charmander(){
        super("Charmander");
    }
    
    /**
     * Act - do whatever the Charmander wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act("Fire");
    }
    
    public String getCompany(){
        return "Fire";
    }
}
