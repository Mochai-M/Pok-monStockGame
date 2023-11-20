import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Button extends Actor
{
    private GreenfootImage image;
    private GreenfootImage image2;
    
    public Button (String text){
        image = new GreenfootImage (400, 77);
        image.setColor(Color.BLACK);
        image.fill();
        image.setColor (Color.WHITE);
        image.setFont(new Font("Comic Sans MS", true, false, 30));
        image.drawString(text, 20, 35);
        setImage(image);
        
        //info about the button 
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
