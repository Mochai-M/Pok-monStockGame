import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Squirtle Class
 * 
 * @Natalie
 * @November 23
 */
public class Squirtle extends Icon
{
    /**
     * Constructor for Squirtle
     */
    public Squirtle(){
        super("Squirtle");
    }
    
    /**
     * Act - do whatever the Squirtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act("Water");
    }
    
    
    public String getCompany(){
        return "Water";
    }
    
    public String getPlayer() {
        return "Squirtle";
    }
}
