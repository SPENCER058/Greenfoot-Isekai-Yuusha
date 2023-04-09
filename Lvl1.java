import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl1 extends World
{
    private int score;
    private int nyawa = 1;
    /**
     * Constructor for objects of class Lvl1.
     * 
     */
    public Lvl1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(667, 375, 1);
        tampilnyawa();
        tampilscore();
        prepare();
        started();
    }
    
    private int demonSpawn=200, demonSpawnTimer=demonSpawn;
    
    public void act()
    {
        if (--demonSpawnTimer==0)
        {
            demonSpawnTimer=demonSpawn;
            addObject(new Demon(),660, 260);
        }
        ketentuanMenang();
        meteorMusuh();
    }
    
    private void prepare()
    {
        addObject(new InGameExitButton(), 30, 30);
        addObject(new MagePlayer(), 100, 280);
    }
    
    public void addScore (int points){
        score = score + points;
        tampilscore();
    }

    private void tampilscore()
    {
        showText ("Score :"+score, 100, 25);
    }
    
    public void tampilnyawa()
    {
        showText("Nyawa :"+nyawa, 200, 25);
    }
    
    public void tampilnyawa(int point)
    {
        nyawa = nyawa + point;
        tampilnyawa();

        if(nyawa ==0)
        {   
            KalahPage kalahLevel1 = new KalahPage();
            Greenfoot.setWorld(kalahLevel1);
        }
    }
    
    private int meteorSpawn=180, meteorSpawnTimer=meteorSpawn;
    
    public void meteorMusuh()
    {
        if (--meteorSpawnTimer==0)
        {
            meteorSpawnTimer=meteorSpawn;
            addObject(new Meteor1(), Greenfoot.getRandomNumber(660), 10);
        }
    }
    
        private void ketentuanMenang()
    {
        if (score == 5)
        {
            Lvl2 menangLevel1 = new Lvl2();
            Greenfoot.setWorld(menangLevel1);
        }
    }
}