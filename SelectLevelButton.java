import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevelButton extends Actor
{    
    private World link;
    public SelectLevelButton(String image, World link) {
        setImage(new GreenfootImage(image));
        this.link = link;
        Imageset();
    }
    
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(this.link);
        }
    }
    
    private void Imageset()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 165, image.getHeight() - 55);
        setImage (image);
    }
}
