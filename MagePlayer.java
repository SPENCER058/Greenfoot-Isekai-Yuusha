import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MagePlayer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagePlayer extends Actor
{
    public int tahan=10;
    private int nyawa;
    public GreenfootSound backSound;
    public void act()
    {
        movement();
        tahan--;
        cekKena();
    }
    
    public void movement()
    {
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
        }
        
        else if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
        } 
        
        else if (isAtEdge()){
            setLocation(getX(), getY()+0);
        }
        
        if (tahan==0){
            if(Greenfoot.isKeyDown("space"))
            {
               getWorld().addObject(new BasicAttack(),getX(),getY());
               Greenfoot.playSound("fire-woosh.wav");
            }
            tahan=10;
        }
    }
    
        public void cekKena(){
        if (isTouching(Demon.class))
        {
            getWorld().addObject(new Ledakan1(),getX(),getY());
            Lvl1 a1= (Lvl1)getWorld();
            a1.tampilnyawa(-1);
            getWorld().removeObject(this);
            return;
        }
        
        else if (isTouching(Jin.class))
        {
            getWorld().addObject(new Ledakan1(),getX(),getY());
            Lvl2 b1= (Lvl2)getWorld();
            b1.tampilnyawa(-1);
            getWorld().removeObject(this);
            return;
        }        
        else if (isTouching(Medusa.class))
        {
            getWorld().addObject(new Ledakan1(),getX(),getY());
            Lvl3 c1= (Lvl3)getWorld();
            c1.tampilnyawa(-1);
            getWorld().removeObject(this);
            return;
        }
        else if (isTouching(Meteor1.class))
        {
            getWorld().addObject(new Ledakan1(),getX(),getY());
            Lvl1 w= (Lvl1)getWorld();
            w.tampilnyawa(-1);
            getWorld().removeObject(this);
        }
        else if (isTouching(Meteor2.class))
        {
            getWorld().addObject(new Ledakan1(),getX(),getY());
            Lvl2 w= (Lvl2)getWorld();
            w.tampilnyawa(-1);
            getWorld().removeObject(this);
        }
        else if (isTouching(Meteor3.class))
        {
            getWorld().addObject(new Ledakan1(),getX(),getY());
            Lvl3 w= (Lvl3)getWorld();
            w.tampilnyawa(-1);
            getWorld().removeObject(this);
        }
    }
}
