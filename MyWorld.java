import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private final static int IMAGE_COUNT = 7;
    private static GreenfootImage[] images = new GreenfootImage[IMAGE_COUNT];
    
    private int slowness = 5;
    private int gifSpeedCounter = 0;
    private int actCycle = 0;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(480, 272, 1); 
        
        for( int i = 0; i < IMAGE_COUNT; i++)
        {
            images[i] = new GreenfootImage( "frame_" + i + "_delay-0.1s.gif" );
        }
        
        setBackground( images[0] );
    }
    
    
    public void act()
    {
        setBackground( images[actCycle % images.length]);
        
        if( gifSpeedCounter == slowness )
        {
            actCycle++;
            gifSpeedCounter = 0;
        }
        else
        {
            gifSpeedCounter++;
        }
    }
    
    /**
     * setSlowness sets how slow the gif is going to play
     * 
     * @param There is an int parameter 
     * @return Nothing is returned
     */
    public void setSlowness(int h)
    {
        slowness = h;
    }
    
}
