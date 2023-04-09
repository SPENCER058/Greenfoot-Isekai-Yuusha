import greenfoot.*;
public class Meteor extends Actor
{
    public void act()
    {   
        movement();
    }
    
    public void movement()
    {
        setLocation(getX()-1, getY()+3);
        if(getY()>350){
            getWorld().removeObject(this);
        } 
        else if (getX()<5)
        {
            getWorld().removeObject(this);
        }
        
        else if (getX()>660)
        {
            getWorld().removeObject(this);
        }
    }
}

