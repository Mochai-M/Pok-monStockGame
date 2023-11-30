import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A class that keeps track of the date at the current point in time and
 * shows the month and day in the top corner.
 * 
 * @author Mekaeel
 * @version November 29th
 */
public class Date extends Actor
{
    // Image to display the date
    GreenfootImage date = new GreenfootImage(250,50);
    
    // Variables to represent the month, day, clock, and world speed
    private int month, day = 1;
    private int clock;
    private String ending;
    private int worldSpeed;
    
    // Arrays to store month names and the number of days in each month
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    /**
     * Constructor to initialize the date and display it on the image
     * 
     * @int worldSpeed: the speed taken in the settings menu is the rate of which the date changes
     */
    public Date(int worldSpeed) {
        month = 0;
        day = 1;
        
        this.worldSpeed = worldSpeed;
        
        date.setColor(Color.BLACK);
        date.fill();
        date.setColor(Color.WHITE);
        date.setFont(new Font("Arial", true, false, 30));
        
        // Determine the suffix for the day (e.g., 1st, 2nd, 3rd, 4th)
        if (day == 1 || day == 21 || day == 31) {
            ending = "st";
        } else if (day == 2 || day == 22) {
            ending = "nd";
        } else if (day == 3 || day == 23) {
            ending = "rd";
        } else {
            ending = "th";
        }
        
        // Display the date on the image
        date.drawString(months[month] + ", " + day + ending, 10, 35);
        
        setImage(date);
    }
    
    /**
     * Act - do whatever the Date wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Update the date when the clock reaches the specified world speed
        if (clock > worldSpeed && endSimulation() == false) {
            updateDate();
            clock = 0;
        }
        clock++;
    }
    
    /** 
     * Update the date by incrementing the day and month, and display the updated date.
     */
    public void updateDate() {
        // Determine the suffix for the day (e.g., 1st, 2nd, 3rd, 4th)
        if (day == 1 || day == 21 || day == 31) {
            ending = "st";
        } else if (day == 2 || day == 22) {
            ending = "nd";
        } else if (day == 3 || day == 23) {
            ending = "rd";
        } else {
            ending = "th";
        }
        
        // Clear the image, set color and font, and draw the updated date
        date.setColor(Color.BLACK);
        date.fill();
        date.setColor(Color.WHITE);
        date.drawString(months[month] + ", " + day + ending, 10, 35);
        
        // Set the updated image
        setImage(date);
        
        // Update the day and month
        if (days[month] > day) {
            day++;
        } else {
            month++;
            day = 1;
        }
    }
    
    /**
     * Check if the simulation has ended by reaching December.
     * Display "FINISHED" and return true if the simulation has ended, otherwise return false.
     */
    public boolean endSimulation() {
        if (month > 11) {
            date.setColor(Color.BLACK);
            date.fill();
            date.setColor(Color.WHITE);
            date.setFont(new Font("Times New Roman", false, false, 30));
            date.drawString("FINISHED", 10, 35);
            return true;
        }
        return false;
    }
    
    /**
     * Get the current date as a string in the format "month + day".
     */
    public String getDate() {
        return month + Integer.toString(day);
    }
}