import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fadingRectangle here.
 * 
 * @author Mekaeel
 * @version November 29th
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
            winnerImage = new GreenfootImage("tie.png");
        } else if(winner == "Bulbasaur") {
            winnerImage = new GreenfootImage("bulbasaurWins.png");
        } else if(winner == "Squirtle") {
            winnerImage = new GreenfootImage("squirtleWins.png");
        } else if(winner == "Charmander") {
            winnerImage = new GreenfootImage("charmanderWins.png");
        } else if(winner == "Ditto") {
            winnerImage = new GreenfootImage("dittoWins.png");
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
        if(clock > 1 && image.getTransparency() < 251) {
            image.setTransparency(image.getTransparency() + 2);
            clock = 0;
        } else if(image.getTransparency() > 251) {
            image.setTransparency(255);
            image.drawImage(winnerImage,0,0);
        } else {
            clock++;
        }
    }
}
