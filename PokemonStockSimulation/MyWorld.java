import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class MyWorld here.
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
        
        //sets the values at the side 
        
        Icon[] temp = WelcomeWorld.getPlayers();
        player1 = temp[0];
        player2 = temp[1];
        
        addObject(player1, 125, 700);
        addObject(player2, 1600-125, 700);

        // Date Object
        addObject(new Date(), 1375, 25);
        
        
    
      
        for (Icon c: temp){
            if(c.getCompany() == "Water") {
                addObject(new Portfolio(getObjects(WaterCompany.class).get(0)), 125, 575);
            } else if(c.getCompany() == "Fire") {
                addObject(new Portfolio(getObjects(FireCompany.class).get(0)), 125, 575);
            } else if(c.getCompany() == "Plant") {
                addObject(new Portfolio(getObjects(GreenCompany.class).get(0)), 1600-125, 575);
            } else if(c.getCompany() == "Fairy") {
                addObject(new Portfolio(getObjects(PinkCompany.class).get(0)), 1600-125, 575);
            }
        }
        
       
    }
    int tickDown = 0;
    
    public void act() {
        if(getObjects(Weather.class).size() == 0) {
            addWeather();
        }
    }
    
    public void addWeather() {
        
        //spawns random weather effects 
        tickDown++;
        if(Greenfoot.getRandomNumber(1000-tickDown) == 0){
            int weatherType = Greenfoot.getRandomNumber(4); 
            if(weatherType == 0){
                addObject(new BlueEffect(), 0, 300);
                addObject(new BlueEffect(), 900, 300);
                addObject(new BlueEffect(), 1500, 300);
                
                tickDown = 0;
            }
            else if(weatherType == 1){
                addObject(new GreenEffect(), 0, 300);
                addObject(new GreenEffect(), 900, 300);
                addObject(new GreenEffect(), 1500, 300);
                tickDown = 0;
            }
            else if(weatherType == 2){
                addObject(new RedEffect(), 0, 300);
                addObject(new RedEffect(), 900, 300);
                addObject(new RedEffect(), 1500, 300);
                tickDown = 0;
            }
            else{
                addObject(new PinkEffect(), 0, 300);
                addObject(new PinkEffect(), 900, 300);
                addObject(new PinkEffect(), 1500, 300);
                tickDown = 0;
            }
        }
    }
}
