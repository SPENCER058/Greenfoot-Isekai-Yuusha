import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class BasicAttack extends Actor
{
    public void act()
    {   
         gerak();
    }
    
    private void gerak()
    {
        move(3);
        setLocation(getX(), getY());
        if(getX()>600){
            getWorld().removeObject(this);
        }
        else{
            cekKena();
        }
    }
    
    public void cekKena()
    {
        if(isTouching(Demon.class))
        {
            getWorld().addObject(new Ledakan1(), getX()+100, getY());
            Greenfoot.playSound("fire-magic-swoosh.wav");
            Lvl1 m= (Lvl1)getWorld();
            m.addScore(1);
            removeTouching(Demon.class);
            getWorld().removeObject(this);
        }
        
        else if(isTouching(Jin.class))
        {
            getWorld().addObject(new Ledakan1(), getX()+100, getY());
            Greenfoot.playSound("fire-magic-swoosh.wav");
            Lvl2 m= (Lvl2)getWorld();
            m.addScore(1);
            removeTouching(Jin.class);
            getWorld().removeObject(this);

        }
        
        else if(isTouching(Medusa.class))
        {
            getWorld().addObject(new Ledakan1(), getX()+100, getY());
            Greenfoot.playSound("fire-magic-swoosh.wav");
            Lvl3 m= (Lvl3)getWorld();
            m.addScore(1);
            removeTouching(Medusa.class);
            getWorld().removeObject(this);

        }
    }
}
