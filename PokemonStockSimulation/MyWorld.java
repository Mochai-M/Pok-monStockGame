import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 *  
 * <p> Pokemon Stock Simulation watch as two pokemon battle it out through the stock market!  </p>
 * 
 * 
 * <p> Key Features: Weather effects (increase decrease the stock prices), Portfolios (shows how well the pokemon's company is doing),
 * Icons (show the emotions each pokemon has depending on the price of their stocks), Stock indicators (show whether stock is rising or 
 * dropping for the given company), Stock Graphs (How the stocks are shown to go up and down on the screen) </p>
 * 
 * 
 * <p> Credits for Images </p>
 * 
 * <p> Fire Effect Image Credits link : https://martincrownover.com/gamemaker-examples-tutorials/particles-fire/ </p>
 * <p> Water Effect Image Credits link: https://forums.synfig.org/t/still-not-sorted-out-falling-rain/1927 </p>
 * <p> Green Effect Image Credits link: https://tenor.com/view/leaves-gif-16219912 </p> 
 * <p> Pink Effect Image Credits link: https://tenor.com/view/hearts-pink-hearts-going-up-gif-17654443 </p>
 * <p> Fire Stock Header Credits (Edited): https://www.logolynx.com/topic/fire
 * <p> Water Stock Header Credits: BWT company (Logo)
 * <p> Green Stock Header Credits (Edited): https://www.vecteezy.com/vector-art/626625-green-leaf-logo-vector
 * <p> Pink Stock Header Credits (Edited): Blackpink (Logo), Roblox (Logo)
 * <p> Pokemon Coin Icon: http://www.reddit.com/r/pokemon/comments/2tup93/how_do_you_pronounce_the_pokemon_currency_symbol/
 * <p> Red flag: http://clipart-library.com/clipart/BTaAkr4Gc.htm
 * <p> Tugknot + rope (edited): https://www.rawpixel.com/image/406489/free-illustration-psd-rope-nautical-chain
 * 
 * <p> Credits for Sound </p>
 * 
 * <p> Fire Effect Sound Credits link: https://mixkit.co/free-sound-effects/rain/ </p>
 * <p> Water Effect Sound Credits link: https://mixkit.co/free-sound-effects/fire/ </p>
 * <p> Green Effect Sound Credits link: https://mixkit.co/free-sound-effects/wind/ </p>
 * <p> Pink Effect Sound Credits link: https://pixabay.com/sound-effects/search/fairy/ </p>
 * <p> Pokemon win sound effect: https://www.myinstants.com/en/instant/pokemon-level-up-sound-44389/
 * 
 * 
 * 
 * 
 * 
 * <p> KNOWN BUGS </p>
 * <p> If ran at a high speeds, the effects will slow down the simulation and will lag the simulation </p>
 * <p> Sound card error causing the fire sound effect to not play, should be resolved on a different computer
 * 
 * @author Mekaeel Malik, Natalie Huang, Liyu Xiao
 * @version November 29th
 */
public class MyWorld extends World
{    
    private Icon player1, player2;
    
    private Companies company1, company2;
    
    private int tickDown;
    
    private int effectSpawnRate;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld(int effectSpawnRate, int stockVarianceRate, int worldSpeed)
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1, false);
        
        setPaintOrder(Weather.class, Portfolio.class, Date.class, Icon.class, Companies.class);
        
        //sets the values at the side 
        
        Icon[] temp = WelcomeWorld.getPlayers();
        player1 = temp[0];
        player2 = temp[1];
        
        addObject(player1, 200, 700);
        addObject(player2, 1600-200, 700);
        
        Companies blueCompany = new WaterCompany(100);
        addObject(blueCompany, 151,25);
        
        Companies greenCompany = new GreenCompany(200);
        addObject(greenCompany, 451,25);
        
        Companies pinkCompany = new PinkCompany(300);
        addObject(pinkCompany, 751,25);
        
        Companies redCompany = new FireCompany();
        
        //Black Friday Object
        addObject(new BlackFriday(),600,600);
      
        if(player1.getCompany() == "Water") {
            addObject(new Portfolio(blueCompany, true), 200, 575);
            company1 = blueCompany;
        } else if(player1.getCompany() == "Fire") {
            addObject(new Portfolio(redCompany, true), 200, 575);
            company1 = redCompany;
        }
        
        if(player2.getCompany() == "Plant") {
            addObject(new Portfolio(greenCompany, false), 1600-200, 575);
            company2 = greenCompany;        
        } else if(player2.getCompany() == "Pink") {
            addObject(new Portfolio(pinkCompany, false), 1600-200, 575);
            company2 = pinkCompany;  
        }
                
        
        Companies redHeader = new FireCompany(company1,company2);
        addObject(redHeader, 1051,25);
        
        addObject(redCompany, 1775,275);
        
        // Objects using the variables inputted into the world function
        addObject(new Date(worldSpeed), 1375, 25);
        this.effectSpawnRate = effectSpawnRate;
        redCompany.setVarianceRate(stockVarianceRate);
        
        tickDown = 0;
        
        setBackground("background.png");
        
        Tugrope tugrope = new Tugrope(company1,company2);
        
        addObject(tugrope, 800, 705);
    }
        
       
    
    
    public void act() {
        if(getObjects(Weather.class).size() == 0) {
            addWeather();
        }
        
        
        if(getObjects(Date.class).get(0).endSimulation()) {
            
            
            GreenfootImage finalBackground = getBackground();
            
            for(Actor a : getObjects(Actor.class)) {
                finalBackground.drawImage(a.getImage(),a.getX()-(a.getImage().getWidth()/2),a.getY()-(a.getImage().getHeight()/2));
                removeObject(a);
            }
            if(company1.getValue() > company2.getValue()) {
                Greenfoot.setWorld(new EndingWorld(finalBackground, player1));
            } else if(company2.getValue() > company1.getValue()) {
               Greenfoot.setWorld(new EndingWorld(finalBackground, player2));
            } else {
                Greenfoot.setWorld(new EndingWorld(finalBackground));
            }           
        }
    }
    
    public void addWeather() {
        
        //spawns random weather effects 
        tickDown++;
        if(effectSpawnRate <= tickDown) {
            tickDown = 0;
        }
        if(Greenfoot.getRandomNumber(effectSpawnRate - tickDown) == 0){
            int weatherType = Greenfoot.getRandomNumber(4); 
            if(weatherType == 0){
                addObject(new BlueEffect(), 600, 300);
                
                tickDown = 0;
            }
            else if(weatherType == 1){
                addObject(new GreenEffect(), 600, 300);
                tickDown = 0;
            }
            else if(weatherType == 2){
                addObject(new RedEffect(), 600, 300);
                tickDown = 0;
            }
            else{
                addObject(new PinkEffect(), 600, 300);
                tickDown = 0;
            }
        }
    }
}
