import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Mekaeel Malik
 * @version 1.0
 */
public class MyWorld extends World
{
    //add characters into world on screen
    private Charmander charmander;
    private Squirtle squirtle; 
    private Bulbasaur bulbasaur;
    private Ditto ditto;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        super(1100, 650, 1); 
        charmander = new Charmander();
        addObject(charmander, 100, 200);
    }
    
    public void addImage(){

    }
}
