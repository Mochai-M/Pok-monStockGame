import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ditto Class
 * 
 * @Natalie
 * @November 23
 */
public class Ditto extends Icon
{
    /**
     * Constructor for Ditto
     */
    public Ditto(){
        super("Ditto");
    }
    
    /**
     * Act - do whatever the Ditto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        super.act("Pink");
    }
    
    
    public String getCompany(){
        return "Pink";
    }
    
    public String getPlayer() {
        return "Ditto";
    }
}
