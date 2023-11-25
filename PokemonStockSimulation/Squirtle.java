import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Squirtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Squirtle extends Icon
{
    public Squirtle(){
        super("Squirtle");
    }
    
    /**
     * Act - do whatever the Squirtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage("Squirtle2.png");
        /**
         * GreenfootImage squirtleImage;
        if(greenEffect){
            squirtleImage = new GreenfootImage("Squirtle0.png"); //happy squirtle
            setImage(squirtleImage);
        }else if (redEffect){
            squirtleImage = new GreenfootImage("Squirtle1.png"); //pissed off/angry 
            setImage(squirtleImage);
        }else if (stockPrice < 50){
            squirtleImage = new GreenfootImage("Squirtle3.png"); //sad 
            setImage(squirtleImage);
        }else {
            squirtleImage = new GreenfootImage("Squirtle2.png"); //normal squirtle
            setImage(squirtleImage);
        }
         */
    }
}
