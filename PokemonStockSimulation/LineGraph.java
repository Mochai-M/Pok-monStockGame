import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LineGraph here.
 * 
 * @author Mekaeel
 * @Nov 8, 2023
 */
public class LineGraph extends Actor
{
    protected static int graphHeight;
    protected static int graphWidth; 
        
    protected GreenfootImage grid;
    
    protected int clock;
    
    public LineGraph(int x,int y) {
        clock = 0;
        graphWidth = x;
        graphHeight = y;
        grid = new GreenfootImage(1600,800);
    }
    public LineGraph() {
        clock = 0;
        graphWidth = 1600;
        graphHeight = 800;
        grid = new GreenfootImage(1600,800);
        drawGrid();
    }
    /**
     * Act - do whatever the LineGraph wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
    }
    
    public void drawGrid() {
        grid.setColor(Color.BLACK);
        for(int i = graphWidth; i > 0; i = i - 50) {
            grid.drawLine(i,0,i,800);
        }
        for(int i = graphHeight; i > 0; i = i - 50) {
            grid.drawLine(0,i,1600,i);
        }
        setImage(grid);
    }
    
    public void draw() {
        grid.setColor(Color.BLACK);
        grid.drawLine(0,0,100,100);
        setImage(grid);
    }
}
