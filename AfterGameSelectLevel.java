import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class AfterGameSelectLevel extends Actor
{
    public AfterGameSelectLevel()
    {
        imageSet();
    }
    
    public void act()
    {
        if (Greenfoot.mousePressed(this)){
            SelectLevel selectlevelaftergame = new SelectLevel();
            Greenfoot.setWorld(selectlevelaftergame);
        }
    }
    
    public void imageSet()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 200, image.getHeight() - 46);
        setImage (image);
    }
}
