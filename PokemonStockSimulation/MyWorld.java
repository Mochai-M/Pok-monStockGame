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
 * <p> Pink Effect Image Credits link: https://www.pinterest.ca/pin/329114685245117235/ </p>
 * 
 * 
 * <p> Credits for Sound </p>
 * 
 * <p> Fire Effect Sound Credits link: https://mixkit.co/free-sound-effects/rain/ </p>
 * <p> Water Effect Sound Credits link: https://mixkit.co/free-sound-effects/fire/ </p>
 * <p> Green Effect Sound Credits link: https://mixkit.co/free-sound-effects/wind/ </p>
 * <p> Pink Effect Sound Credits link: https://pixabay.com/sound-effects/search/fairy/ </p>
 * 
 * 
 * 
 * 
 * 
 * <p> KNOWN BUGS </p>
 * <p> If ran at a high speeds, the effects will slow down the simulation and will lag the simulation </p>
 * 
 * 
 * @author Mekaeel Malik, Natalie Huang, Liyu Xiao
 * @version 1.0
 */
public class MyWorld extends World
{
    // natalie 11/7/2023

    //load images into a temporary array
    //GreenfootImage[] images = new GreenfootImage[];
    //new GreenfootImage("*add image*");
    //do four times for each emotion
    //icon will then be equal to new icon(images);
    //private GreenfootImage[] images; 
    //GreenfootImage icon1 = new GreenfootImage();
    
    private Icon player1, player2;
    
    private Companies company1, company2;
    
    private int tickDown;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1, false);
        
        setPaintOrder(Portfolio.class, Date.class, Icon.class, Companies.class, LineGraph.class);
        
        addObject(new LineGraph(),800,400);
        
        Companies blueCompany = new WaterCompany(100);
        addObject(blueCompany, 151,25);
        
        Companies greenCompany = new GreenCompany(200);
        addObject(greenCompany, 451,25);
        
        Companies pinkCompany = new PinkCompany(300);
        addObject(pinkCompany, 751,25);
        
        Companies redHeader = new FireCompany(10);
        addObject(redHeader, 1051,25);
        
        Companies redCompany = new FireCompany();
        addObject(redCompany, 1775,275);
        
        redCompany.players = WelcomeWorld.getPlayers();
        
        //sets the values at the side 
        
        Icon[] temp = WelcomeWorld.getPlayers();
        player1 = temp[0];
        player2 = temp[1];
        
        addObject(player1, 125, 700);
        addObject(player2, 1600-125, 700);

        // Date Object
        addObject(new Date(), 1375, 25);
        
        
        
        //Black Friday Object
        addObject(new BlackFriday(),600,600);
        
    
      
        if(player1.getCompany() == "Water") {
            addObject(new Portfolio(blueCompany), 125, 575);
            company1 = blueCompany;
        } else if(player1.getCompany() == "Fire") {
            addObject(new Portfolio(redCompany), 125, 575);
            company1 = redCompany;
        } else if(player1.getCompany() == "Plant") {
            addObject(new Portfolio(greenCompany), 1600-125, 575);
            company1 = greenCompany;        
        } else if(player1.getCompany() == "Pink") {
            addObject(new Portfolio(pinkCompany), 1600-125, 575);
            company1 = pinkCompany;  
        }
        
        if(player2.getCompany() == "Water") {
            addObject(new Portfolio(blueCompany), 125, 575);
            company2 = blueCompany;
        } else if(player2.getCompany() == "Fire") {
            addObject(new Portfolio(redCompany), 125, 575);
            company2 = redCompany;
        } else if(player2.getCompany() == "Plant") {
            addObject(new Portfolio(greenCompany), 1600-125, 575);
            company2 = greenCompany;        
        } else if(player2.getCompany() == "Pink") {
            addObject(new Portfolio(pinkCompany), 1600-125, 575);
            company2 = pinkCompany;  
        }
        
        tickDown = 0;
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
        if(Greenfoot.getRandomNumber(1000-tickDown) == 0){
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
                addObject(new PinkEffect(), 1500, 300);
                tickDown = 0;
            }
        }
    }
}
