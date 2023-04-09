import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class TutorialScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialScreen extends World
{
    
    /**
     * Constructor for objects of class TutorialScreen.
     * 
     */
 
    public TutorialScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(667, 375, 1); 
    }
    
    public void act()
    {
        returnToSelectLevel();
    }
    
    public void returnToSelectLevel()
    {   
        if (Greenfoot.isKeyDown("enter"))
        {
            SelectLevel selectlevel = new SelectLevel();
            Greenfoot.setWorld(selectlevel);
        }
    }
}
