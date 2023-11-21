import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomeWorld here.
 * 
 * @Natalie
 * @version (a version number or a date)
 */
public class WelcomeWorld extends World
{
    private SuperDisplayLabel label;
    Button next = new Button("Next!");
    private GreenfootImage image;
    private int storyFrame = 0; 
    Button select = new Button("SELECT");
    
    /**
     * Constructor for objects of class WelcomeWorld.
     * 
     */
    public WelcomeWorld()
    {    
        super(1600, 800, 1, false); 
         
        label = new SuperDisplayLabel();
        addObject(next, 1360, 710); 
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(next)){
            addObject(label, 800, 50);
            label.update("WELCOME PLAYER!");
            frames();
            storyFrame++;
        }
    }
    
    public void frames(){
        if (storyFrame == 1){
            label.update("There are some Pokemon who have decided to take up some businesses classes. Now, they think they know everything about stocks!");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 2){
            label.update("They've decided to battle each other to find out which team knows thier stocks the best");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 3){
            label.update("Will your team be able to defeat the other pair?");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 4){ //player 1 selection
            label.update("Choose your Pokemon Player 1!");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(select, 800, 400); // the button that lets player select
            
            // add player 1 choice selection 
            // choose either squirtle or charmander 
        }else if(storyFrame == 5){ //player 2 selection
            label.update("Choose your Pokemon Player 2!");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(select, 600, 400); // the button that lets player select
            
            // once chosen, will switch to player 2's screen
            // player 2 will choose between ditto or bulbasaur 
            // after that, game will spawn and start
        }
        
        if (storyFrame == 6){
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
