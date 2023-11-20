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
<<<<<<< HEAD
    {    
=======
    { 
>>>>>>> 349178d2bb569a1130372562841b68ebb43357c7
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1, false);
        
        setPaintOrder(Line.class,LineGraph.class);
        
        addObject(new LineGraph(),800,400);
    
        Companies redCompany = new FireCompany(400);
        Companies redCompany = new FireCompany(400);
        addObject(redCompany, 1625,300);
        
        Companies blueCompany = new WaterCompany(400);
        Companies blueCompany = new WaterCompany(400);
        addObject(blueCompany, 1625,300);
        
        Companies greenCompany = new GreenCompany(400);
        addObject(greenCompany, 1625,300);
        
        Companies pinkCompany = new PinkCompany(400);
        addObject(pinkCompany, 1625,300);
        
        Companies greenCompany = new GreenCompany(400);
        addObject(greenCompany, 1625,300);
        
        Companies pinkCompany = new PinkCompany(400);
        addObject(pinkCompany, 1625,300);
        
<<<<<<< HEAD
        addObject(new FireCompany(400), 1625,300);
        addObject(new WaterCompany(400), 1625,300);
        //if player1 chooses squirtle, squirtle icon will take place
        //if player2 chooses ditto, ditto icon will take place
        //addObject(new Squirtle(), 174, 677);
        //addObject(new Charmander(), 174, 400);
        //addObject(new Ditto(), 1426, 400);
        //addObject(new Bulbasaur(), 1426, 677);
       
        
        // GET INPUT FROM USER -> ask which pokemon... 
        
        
        // CREATE an Icon for each player
        // This will build one object for player1 and one object of player2
        //if (p1Choice == "char"){
        //    player1 = new Charmander();
        //}else if (p1Choice == "squir"){
        //    player1 = new Squirtle();
        //}
        
        
        // To be used elsewhere - this is an easy way to check if
        // player1 happens to be a particular type of class.
        /**
         * if(player1.getClass() == Charmander.class){
            addObject(new Charmander(), 174, 677);
        } else if(player1.getClass() == Squirtle.class){
            addObject(new Squirtle(), 174, 677);
        }
         */
        
        //if(player2 == Ditto.class){
        //    addObject(new Ditto(), 1426, 677);
        //} else if(player2 == Bulbasaur.class){
        //    addObject(new Bulbasaur(), 1426, 677);
        //}
    }
=======
        
    }
    
    public void act(){
        int tickDown = 0;
        
        //spawns random weather effects 
        tickDown++;
        if(Greenfoot.getRandomNumber(10000-tickDown) == 0){
            int weatherType = Greenfoot.getRandomNumber(4); 
    
            if(weatherType == 0){
                addObject(new BlueEffect(), 900, -300);
                tickDown = 0;
            }
            else if(weatherType == 1){
                addObject(new GreenEffect(), 900, -300);
                tickDown = 0;
            }
            else if(weatherType == 2){
                addObject(new RedEffect(), 900, -300);
                tickDown = 0;
            }
            else{
                addObject(new PinkEffect(), 900, -300);
                tickDown = 0;
            }
        }
    }
>>>>>>> 349178d2bb569a1130372562841b68ebb43357c7
}
