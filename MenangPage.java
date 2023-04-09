import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenangPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenangPage extends World
{

    /**
     * Constructor for objects of class MenangPage.
     * 
     */
    public MenangPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(667, 375, 1); 
        prepare();
    }
    
    private void prepare()
    {
        addObject(new AfterGameSelectLevel(), 333, 345);
    }
}
