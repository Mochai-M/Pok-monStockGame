import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomeWorld here.
 * 
 * @Natalie
 * @November 21
 */
public class WelcomeWorld extends World
{
    private SuperDisplayLabel label;
    Button next = new Button("Next!");
    private GreenfootImage image;
    private int storyFrame = 0; 
    TopSelectionButton selectTop = new TopSelectionButton("SELECT");
    BottomSelectionButton selectBottom = new BottomSelectionButton("SELECT");
    
    private static Icon player1, player2;
    
    /**
     * Constructor for objects of class WelcomeWorld.
     * <p> Constructor adds the Super Display Label as well as the button for clicking next
     * it also makes player 1 and 2 null at the beginning
     */
    public WelcomeWorld()
    {    
        super(1600, 800, 1, false);
        label = new SuperDisplayLabel();
        addObject(next, 1360, 710); 
        player1 = null;
        player2 = null;
    }
    
    /**
     * Stores players in an array
     */
    public static Icon[] getPlayers(){
        player1 = new Charmander();
        player2= new Ditto();
        return new Icon[]{player1, player2};
    }
    
    /**
     * Act method:
     * <p>Repeats the actions of updating labels and frames.
     */
    public void act(){
        frames();
        if(Greenfoot.mouseClicked(next)){
            addObject(label, 800, 50);
            label.update("WELCOME PLAYER!");
            storyFrame++;
        }
    }
    
    /**
     * Method that changes background images and Super Display Label.
     * <p>Helps to choose characters in the beginning as well as switching frames for the world
     */
    public void frames(){
        if (storyFrame == 1){
            label.update("There are some Pokemon who have decided to take up some businesses classes. Now, they think they know everything about stocks!");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 2){
            label.update("They've decided to battle each other to find out which team knows their stocks the best");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 3){
            label.update("Will your team be able to defeat the other pair?");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 4){ //player 1 selection
            label.update("Choose your Pokemon Player 1!");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(selectTop, 1152, 145); // ttop button selection
            addObject(selectBottom, 1152, 550); //bottom button selection
            
            if(Greenfoot.mouseClicked(selectTop)){
                player1 = new Charmander();
                // chosen charmander
                // add the background of charmander into the world
            } else if(Greenfoot.mouseClicked(selectBottom)){
                player1 = new Squirtle();
                // chosen squirtle
                // add the background of squirtle into the world
            }
            //if selectTop is chosen, then that pokemon will appear in the world
            //if selectBottom is chosen, same thing happens 
        }else if(storyFrame == 5){ //player 2 selection
            label.update("Choose your Pokemon Player 2!");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(selectTop, 1152, 145); // top button selection
            addObject(selectBottom, 1152, 550); //bottom button selection
            
            if(Greenfoot.mouseClicked(selectTop)){
                player2 = new Ditto();
                // chosen ditto
                // add the background of ditto into the world
            } else if(Greenfoot.mouseClicked(selectBottom)){
                player2 = new Bulbasaur();
                // chosen bulbasaur
                // add the background of bulbasaur into the world
            }
            // after, the game will spawn and start
        }
        
        else if (storyFrame == 6){
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
