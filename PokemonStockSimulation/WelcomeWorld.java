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
    Button next = new Button("click this button!");
    private GreenfootImage image;
    private int storyFrame = 0;
    
    protected Icon player1,player2;
    
    /**
     * Constructor for objects of class WelcomeWorld.
     * 
     */
    public WelcomeWorld()
    {    
        super(1600, 800, 1, false); 
         
        label = new SuperDisplayLabel();
        addObject(next, 725, 650); 
    }
    
    /**
     * Stores players in an array
     */
    public Icon[] getPlayers(){
        player1 = new Charmander();
        player2 = new Bulbasaur();
        return new Icon[]{player1, player2};
    }
    
    /**
     * Act method:
     * <p>Repeats the actions of updating labels and frames.
     */
    
    public void act(){
        if (Greenfoot.mouseClicked(next)){
            addObject(label, 800, 50);
            label.update("WELCOME PLAYER!");
            frames();
            storyFrame++;
        }
    }
    
    public void frames(){
        if (storyFrame == 1){
            label.update("There are some Pokemons who have decided to take up business classes");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 2){
            label.update("They decided to battle each other in a stock battle to see which team is better");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 3){
            label.update("Will your team be able to defeat the other team?");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 4){
            label.update("Choose your Pokemon to start Player 1!");
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        } 
        
        if (storyFrame == 5){
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
