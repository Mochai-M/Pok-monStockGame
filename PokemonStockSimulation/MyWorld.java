import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Mekaeel Malik, Natalie Huang
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
    
    //private Charmander charmander;
    //private Squirtle squirtle;
    //private Ditto ditto;
    //private Bulbasaur bulbasaur;
    
    private Icon player1, player2;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1,false);
        
        setPaintOrder(Line.class,LineGraph.class);
        
        addObject(new LineGraph(),800,400);
        
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
}
