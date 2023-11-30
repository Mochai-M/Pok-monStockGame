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
    // Reference to the Companies object whose stock price will be displayed
    protected Companies company; 
    
    // Image to display the stock price
    private GreenfootImage displayValue;
    
    // Flag to determine whether the price should be centered on the left or right side
    private boolean centerOnLeft;
    
    // Constructor to initialize the Portfolio with a Companies object and alignment flag
    public Portfolio(Companies c, boolean centerOnLeft) {
        company = c;
        this.centerOnLeft = centerOnLeft;
        
        // Initialize the displayValue image
        displayValue = new GreenfootImage(400, 50);
        displayValue.setFont(new Font("Arial", true, false, 30));
    }
    
    /**
     * Act - do whatever the Portfolio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Update the displayed stock value
        updateValue();
    }
    
    /**
     * Method to update the displayed stock value
     */
    public void updateValue() {
        // Set color and fill the background
        displayValue.setColor(Color.BLACK);
        displayValue.fill();
        displayValue.setColor(Color.WHITE);
        
        // Display the stock value with appropriate formatting based on alignment
        if (centerOnLeft) {
            displayValue.drawString("(" + company + ") " + Float.toString(company.getValue()) + " ₱ ", 200, 35);
        } else {
            displayValue.drawString("₱ " + Float.toString(company.getValue()) + " (" + company + ")", 10, 35);
        }
        
        // Set the updated image
        setImage(displayValue);
    }
}