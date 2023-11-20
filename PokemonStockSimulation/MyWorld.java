import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Mekaeel Malik, Natalie Huang
 * @version 1.0
 */
public class MyWorld extends World
<<<<<<< HEAD
{

    // natalie 11/7/2023
=======
{    // natalie 11/7/2023
>>>>>>> 349178d2bb569a1130372562841b68ebb43357c7
    //load images into a temporary array
    //GreenfootImage[] images = new GreenfootImage[];
    //new GreenfootImage("*add image*");
    //do four times for each emotion
    //icon will then be equal to new icon(images);
    
<<<<<<< HEAD
    //private GreenfootImage[] images; 
    //GreenfootImage icon1 = new GreenfootImage();
    
    //private Charmander charmander;
    //private Squirtle squirtle;
    //private Ditto ditto;
    //private Bulbasaur bulbasaur;
    
    private Icon player1, player2;
    
=======
>>>>>>> 349178d2bb569a1130372562841b68ebb43357c7
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1, false);
        
        setPaintOrder(LineGraph.class, Line.class);
        
        addObject(new LineGraph(),800,400);
        
        Companies blueCompany = new WaterCompany(100);
        addObject(blueCompany, 300,100);
        
        Companies greenCompany = new GreenCompany(300);
        addObject(greenCompany, 900,100);
        
        Companies pinkCompany = new PinkCompany(500);
        addObject(pinkCompany, 1500,100);
        
        Companies redCompany = new FireCompany(700);
        addObject(redCompany, 1775,300);
    }
    
    public void act(){
        int tickDown = 0;
        
        //spawns random weather effects 
        tickDown++;
        if(Greenfoot.getRandomNumber(1000-tickDown) == 0){
            int weatherType = Greenfoot.getRandomNumber(4); 
    
            if(weatherType == 0){
                addObject(new BlueEffect(), 0, -300);
                addObject(new BlueEffect(), 900, -300);
                addObject(new BlueEffect(), 1500, -300);
                
                tickDown = 0;
            }
            else if(weatherType == 1){
                addObject(new GreenEffect(), 0, -300);
                addObject(new GreenEffect(), 900, -300);
                addObject(new GreenEffect(), 1500, -300);
                tickDown = 0;
            }
            else if(weatherType == 2){
                addObject(new RedEffect(), 0, -300);
                addObject(new RedEffect(), 900, -300);
                addObject(new RedEffect(), 1500, -300);
                tickDown = 0;
            }
            else{
                addObject(new PinkEffect(), 0, -300);
                addObject(new PinkEffect(), 900, -300);
                addObject(new PinkEffect(), 1500, -300);
                tickDown = 0;
            }
        }
    }
>>>>>>> 349178d2bb569a1130372562841b68ebb43357c7
}
