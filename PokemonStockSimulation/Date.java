import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date extends Actor
{
    GreenfootImage date = new GreenfootImage(250,50);
    private int month,day = 1;
    private int clock;
    private String ending;
    
    private String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
    
    public void Date() {
        month = 0;
        day = 1;
        
        setImage(date);
    }
    
    /**
     * Act - do whatever the Date wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(clock > 20 && endSimulation()) {
            updateDate();
            clock = 0;
        }
        clock++;
    }
    
    public void updateDate() {
        if(day == 1 || day == 21 || day == 31) {
            ending = "st";
        } else if (day == 2 || day == 22) {
            ending = "nd";
        } else if (day == 3 || day == 23) {
            ending = "rd";
        } else {
            ending = "th";
        }
        
        date.setColor(Color.BLACK);
        date.fill();
        date.setColor(Color.WHITE);
        date.setFont(new Font("Roman",false,false,30));
        date.drawString(months[month] + ", " + day + ending, 10, 35);
        
        setImage(date);
        
        if(days[month] > day) {
            day++;
        } else {
            month++;
            day = 1;
        }
    }
    
    public boolean endSimulation() {
        if(month > 11) {
            date.setColor(Color.BLACK);
            date.fill();
            date.setColor(Color.WHITE);
            date.setFont(new Font("TimesNewRoman",false,false,30));
            date.drawString("FINISHED", 10, 35);
            return false;
        }
        return true;
    }
}
