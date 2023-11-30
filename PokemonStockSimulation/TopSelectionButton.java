import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TopSelectionButton Class
 * 
 * @Natalie
 * @November 21
 */
public class TopSelectionButton extends Actor
{
    private GreenfootImage image;
    
    /**
     * Constructor Class
     * <p> Presents what the button will look like on the screen
     */
    public TopSelectionButton (String text){
        image = new GreenfootImage (153, 54);
        image.setColor(Color.BLACK);
        image.fill();
        image.setColor (Color.WHITE);
        image.setFont(new Font("Arial", true, false, 30));
        image.drawString(text, 20, 35);
        setImage(image);
    }
    
    /**
     * Act - do whatever the SelectionButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
