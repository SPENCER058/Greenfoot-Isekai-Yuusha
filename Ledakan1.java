import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ledakan1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ledakan1 extends Actor
{
    /**
     * Act - do whatever the Ledakan1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int jeda=5;
    public void act()
    {   
        setLocation(getX()+10, getY());
        if (jeda>0)jeda--;
        else getWorld().removeObject(this);
        
    } 
}
