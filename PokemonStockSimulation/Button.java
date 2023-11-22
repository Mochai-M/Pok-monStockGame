import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @Natalie
 * @November 21
 */
public class Button extends Actor
{
    private GreenfootImage image;
    
    public Button (String text){
        image = new GreenfootImage (120, 54);
        image.setColor(Color.BLACK);
        image.fill();
        image.setColor (Color.WHITE);
        image.setFont(new Font("Comic Sans MS", true, false, 30));
        image.drawString(text, 20, 35);
        setImage(image);
    }

    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
