import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectLevelExitButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevelExitButton extends Actor
{
    /**
     * Act - do whatever the SelectLevelExitButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SelectLevelExitButton()
    {
        ImageSet();
    }
    
    public void act()
    {
       if (Greenfoot.mousePressed(this)){
            FrontTitle exitFromFrontTitle = new FrontTitle();
            Greenfoot.setWorld(exitFromFrontTitle);
        }
    }
    
    public void ImageSet()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 75, image.getHeight() - 75);
        setImage (image);
    }
}
