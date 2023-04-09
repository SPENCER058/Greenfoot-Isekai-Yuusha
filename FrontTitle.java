import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FrontTitle extends World
{
    private GreenfootSound backSound;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public FrontTitle()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(667, 375, 1);
    }
    
    public void act()
    {
        frontConfirmation();
    }
    
    public void frontConfirmation()
    {
        if(Greenfoot.isKeyDown("enter"))
        {
            backSound = new GreenfootSound("relaxation.mp3");
            backSound.setVolume(10);
            backSound.play();
            SelectLevel newGame = new SelectLevel();
            Greenfoot.setWorld(newGame);
        }
        else if(Greenfoot.isKeyDown("q"))
        {
            gameOver();
        }
    }
    
    public void gameOver()
    {
        System.exit(0);
    }
}
