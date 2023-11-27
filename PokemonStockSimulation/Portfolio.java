import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portfolio here.
 * 
 * @author Mekaeel Malik
 * @version November 27th
 */
public class Portfolio extends Actor
{
    protected Companies company; 
    protected int value;
    
    private GreenfootImage displayValue;
    
    public Portfolio(Companies c) {
        company = c;
        
        
        displayValue = new GreenfootImage(250,50);
        
        displayValue.setFont(new Font("Roman",false,false,30));
    }
    /**
     * Act - do whatever the Portfolio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        updateValue();
    }
    
    public void updateValue() {
        displayValue.setColor(Color.BLACK);
        displayValue.fill();
        displayValue.setColor(Color.WHITE);
        displayValue.drawString("₱ " + Float.toString(company.getValue()) + " ("+company+")", 10, 35);
        
        setImage(displayValue);
    }
}
