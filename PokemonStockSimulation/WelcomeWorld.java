import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WelcomeWorld here.
 * 
 * @Natalie, Mekaeel
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
    
    private int effectSpawnRate = 1000;
    private int stockChangeValue = 40;
    private int worldSpeed = 10;
    
    private Button changeEffect = new Button("Effect Spawn Rate",280);
    private Button changeVariance = new Button("Stock Variance Value",320);
    private Button changeSpeed = new Button("World Speed Rate",280);
    
    /**
     * Constructor for objects of class WelcomeWorld.
     * <p> Constructor adds the Super Display Label as well as the button for clicking next
     * it also makes player 1 and 2 null at the beginning
     */
    public WelcomeWorld()
    {    
        super(1600, 800, 1, false);
        addObject(next, 1360, 710); 
        player1 = null;
        player2 = null;
    }
    
    /**
     * Stores players in an array
     */
    public static Icon[] getPlayers(){
        return new Icon[]{player1, player2};
    }
    /**
     * Act method:
     * <p>Repeats the actions of updating labels and frames.
     */
    public void act(){
        frames();
        if(storyFrame < 4 && Greenfoot.mouseClicked(next)){
            storyFrame++;
        } else if(storyFrame == 4 && player1 != null && Greenfoot.mouseClicked(next)) {
            storyFrame++;
        } else if(storyFrame == 5 && player2 != null && Greenfoot.mouseClicked(next)) {
            storyFrame++;
            
            removeObject(selectTop);
            removeObject(selectBottom);
        } else if(storyFrame >= 6 && Greenfoot.mouseClicked(next)) {
            storyFrame++;
            removeObject(changeEffect);
            removeObject(changeVariance);
            removeObject(changeSpeed);
        }
    }
    
    /**
     * Method that changes background images and Super Display Label.
     * <p>Helps to choose characters in the beginning as well as switching frames for the world
     */
    public void frames(){
        if (storyFrame == 1){
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 2){
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 3){
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
        }else if(storyFrame == 4){ //player 1 selection
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(selectTop, 352, 498); // left button selection
            addObject(selectBottom, 1271, 498); //right button selection
            
            if(Greenfoot.mouseClicked(selectTop)){
                player1 = new Squirtle();
                // chosen charmander
                // add the background of charmander into the world
            } else if(Greenfoot.mouseClicked(selectBottom)){
                player1 = new Charmander();
                // chosen squirtle
                // add the background of squirtle into the world
            }
            //if selectTop is chosen, then that pokemon will appear in the world
            //if selectBottom is chosen, same thing happens 
        }else if(storyFrame == 5){ //player 2 selection
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            addObject(selectTop, 280, 498); // left button selection
            addObject(selectBottom, 1214, 498); //right button selection
            
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
        } else if(storyFrame == 6) {            
            setBackground(image = new GreenfootImage("0" + storyFrame + ".png"));
            
            addObject(changeEffect,400,400);
            addObject(changeVariance,800,400);
            addObject(changeSpeed,1200,400);
            
            if(Greenfoot.mouseClicked(changeEffect)){
                effectSpawnRate = Integer.parseInt(Greenfoot.ask("Input new effect spawn rate. (Current one is " + effectSpawnRate + ") P.S. higher is less"));
            } else if(Greenfoot.mouseClicked(changeVariance)){
                stockChangeValue = Integer.parseInt(Greenfoot.ask("Input new stock variance value. (Current one is " + stockChangeValue + ") P.S. higher means more possible values"));
            } else if(Greenfoot.mouseClicked(changeSpeed)){
                worldSpeed = Integer.parseInt(Greenfoot.ask("Input new world speed. (Current one is " + worldSpeed + ") P.S. higher means slower"));
            }
        } else if (storyFrame == 7){
            Greenfoot.setWorld(new MyWorld(stockChangeValue,stockChangeValue,worldSpeed));
        }
    }
}
