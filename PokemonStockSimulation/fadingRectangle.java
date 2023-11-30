import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Display function that slowly fades to black before showing who the 
 * final winner of the stock simulation was.
 * 
 * @author Mekaeel
 * @version November 29th
 */
public class FadingRectangle extends Actor
{
    // Variable to keep track of the elapsed time
    private int clock;
    
    // Image to represent the fading rectangle
    GreenfootImage image;
    
    // Variable to store the winner'simage
    private GreenfootImage winnerImage;
    
    /**
     * Constructor to initialize the fading rectangle with a given size and the winner of the simulation
     * 
     * @int x: size in terms of width
     * @int y: size in terms of height
     * @String winner: the winner of the simulation in terms of string value
     */ 
    public FadingRectangle(int x, int y, String winner) {
        
        // Set the winner's image based on the provided winner parameter
        if (winner.equals("TIE")) {
            winnerImage = new GreenfootImage("tie.png");
        } else if (winner.equals("Bulbasaur")) {
            winnerImage = new GreenfootImage("bulbasaurWins.png");
        } else if (winner.equals("Squirtle")) {
            winnerImage = new GreenfootImage("squirtleWins.png");
        } else if (winner.equals("Charmander")) {
            winnerImage = new GreenfootImage("charmanderWins.png");
        } else if (winner.equals("Ditto")) {
            winnerImage = new GreenfootImage("dittoWins.png");
        }
        
        // Initialize the fading rectangle image with transparency set to 0
        image = new GreenfootImage(x, y);
        image.setTransparency(0);
        image.setColor(Color.BLACK);
        image.fill();
        
        // Set the fading rectangle image
        setImage(image);
        
        // Initialize the clock variable
        clock = 0;
    }
    
    /**
     * Act - do whatever the fadingRectangle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Gradually increase the transparency of the fading rectangle
        if (clock > 1 && image.getTransparency() < 251) {
            image.setTransparency(image.getTransparency() + 2);
            clock = 0;
        } 
        // Display the winner's image when the fading is complete
        else if (image.getTransparency() > 251) {
            image.setTransparency(255);
            image.drawImage(winnerImage, 0, 0);
        } 
        // Increment the clock if fading is still in progress
        else {
            clock++;
        }
    }
}