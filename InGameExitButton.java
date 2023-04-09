import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InGameExitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InGameExitButton extends Actor
{
    /**
     * Act - do whatever the InGameExitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public InGameExitButton()
    {
        Imageset();
    }
    
    public void act()
    {
       if (Greenfoot.mousePressed(this)){
            SelectLevel selectLevelExitGame = new SelectLevel();
            Greenfoot.setWorld(selectLevelExitGame);
        }
    }
    
    public void Imageset()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 100, image.getHeight() - 100);
        setImage (image);
    }
}
