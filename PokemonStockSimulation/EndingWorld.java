import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndingWorld extends World
{
    private int clock;
    private GreenfootImage background;
    private GreenfootImage start;
    private SuperDisplayLabel label;
    
    /**
     * Constructor for objects of class EndingWorld.
     * 
     */
    public EndingWorld(GreenfootImage background, Icon winner)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1);
        
        setPaintOrder(SuperDisplayLabel.class, FadingRectangle.class);
        
        this.background = background;
        setBackground(background);
        
        addObject(new FadingRectangle(1600,800),800,400);
        
        label = new SuperDisplayLabel(Color.WHITE,Color.BLACK,new Font("Times New Roman",true, false, 80));
                
        addObject(label,800,400);
        
        label.update(winner.getPlayer() + " Wins!!!");
        
        label.setLocation(800,400);
    }
    
    public EndingWorld(GreenfootImage background)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 800, 1);
        
        setPaintOrder(SuperDisplayLabel.class, FadingRectangle.class);
        
        this.background = background;
        setBackground(background);
        
        addObject(new FadingRectangle(1600,800),800,400);
        
        label = new SuperDisplayLabel(Color.BLACK,Color.WHITE,new Font("Times New Roman",true, false, 80));
                
        addObject(label,800,400);
        
        label.update("TIE");
        
        label.setLocation(800,400);
    }
    }
