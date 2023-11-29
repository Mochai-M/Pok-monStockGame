import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fadingRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FadingRectangle extends Actor
{
    private int clock;
    
    GreenfootImage image;
    
    private String winner;
    private GreenfootImage winnerImage;
    
    public FadingRectangle(int x, int y, String winner) {
        this.winner = winner;
        if(winner == "TIE") {
            
        }
        
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
        if(clock > 1 && image.getTransparency() < 235) {
            image.setTransparency(image.getTransparency() + 2);
            clock = 0;
        } else if(image.getTransparency() > 235) {
            //draw the new image onto the world thing
        } else {
            clock++;
        }
    }
}
