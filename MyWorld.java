import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * Name: Emmanuel Olaniyanu
 * Teacher: Mr. Hardman
 * Lab #2, Assignment 3 GifPlayer
 * Date Last Modified: 3/16/2017
 */
public class MyWorld extends World
{
    private long startTime = System.currentTimeMillis();
    private GreenfootSound soundFile = new GreenfootSound("The Num Num Num Song.mp3");
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
    
    public void started()
    {
        startTime = System.currentTimeMillis();
        
        soundFile.playLoop();
    }
    
    public void stopped()
    {
        soundFile.stop();
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
