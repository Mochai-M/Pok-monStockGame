import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the current value of the stock entered into the parameters.
 * 
 * @ Companies c: the company that will have their stock price displayed
 * @ boolean centerOnLeft: differentiator to decide which side of the screen the price should be centered on
 * 
 * @author Mekaeel Malik
 * @version November 27th
 */
public class Portfolio extends Actor
{
    protected Companies company; 
    
    private GreenfootImage displayValue;
    
    private boolean centerOnLeft;
    
    public Portfolio(Companies c, boolean centerOnLeft) {
        company = c;
        
        this.centerOnLeft = centerOnLeft;
        
        
        displayValue = new GreenfootImage(400,50);
        
        displayValue.setFont(new Font("Times New Roman",false,false,30));
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
        
        if(centerOnLeft) {
            displayValue.drawString("("+company+") "+Float.toString(company.getValue()) + " ₱ ", 200, 35);
        } else {
            displayValue.drawString("₱ " + Float.toString(company.getValue()) + " ("+company+")", 10, 35);
        }
        
        setImage(displayValue);
    }
}
