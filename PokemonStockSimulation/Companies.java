import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Companies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Companies extends Actor
{
    
    
    public abstract void updateValue();

    
    public abstract int getCurrentValue();

    
    public abstract int getNewValue();
    
    public abstract String toString();

}
