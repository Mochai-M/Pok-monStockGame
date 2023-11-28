import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fadingRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fadingRectangle extends Actor
{
    private int clock;
    
    GreenfootImage image;
    
    public fadingRectangle(int x, int y) {
        image = new GreenfootImage(x,y);
        image.setTransparency(0);
        image.setColor(Color.BLACK);
        image.fill();
        
        setImage(image);
        
        clock = 0;
    }
    /**
     * Act - do whatever the fadingRectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        clock++;
        if(clock > 2 && image.getTransparency() < 230) {
            image.setTransparency(image.getTransparency() + 1);
            clock = 0;
        }
    }
}
