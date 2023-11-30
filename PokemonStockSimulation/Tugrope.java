import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays the difference between the two stocks through a game of tug of war.
 * 
 * @author Mekaeel 
 * @version November 29th
 */
public class Tugrope extends Actor
{
    /** Image representing the tug of war rope */
    private GreenfootImage rope;
    
    /** Companies representing the two companies participating in the tug of war */
    private Companies company1, company2;
    
    /** 
     * Constructor to initialize Tugrope with two Companies objects
     * @param Companies uno - Company of the pokemon on the left
     * @param Companies dos - Company of the pokemon on the right
     */
    public Tugrope(Companies uno, Companies dos) {
        company1 = uno;
        company2 = dos;
        
        // Set the image of the tug of war rope
        rope = new GreenfootImage("Tugknot.png");
        
        // Set the image for the Tugrope actor
        setImage(rope);
    }
    
    /**
     * Act - do whatever the Tugrope wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Move the tug of war knot based on the difference in stock values
        moveTheKnot();
    }
    
    /** 
     * Method to move the tug of war knot based on the difference in stock values 
     */
    public void moveTheKnot() {
        // Move the knot towards the side with the higher stock value
        if (moveToPoint() < getX() && getX() > 500) {
            setLocation(getX() - 1, getY());
        } else if (moveToPoint() > getX() && getX() < 1050) {
            setLocation(getX() + 1, getY());
        }
    }
    
    /**
     * Method to calculate the x-coordinate where the tug of war knot should move 
     */
    public int moveToPoint() {
        return (int) ((company2.getValue() * 3.5) - (company1.getValue() * 3.5)) + 750;
    }
}