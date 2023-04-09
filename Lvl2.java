import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2 extends World
{
    private int score;
    private int nyawa = 1;
    /**
     * Constructor for objects of class Lvl1.
     * 
     */
    public Lvl2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(667, 375, 1);
        tampilnyawa();
        tampilscore();
        prepare();
    }
    
    private int jinSpawn=200, jinSpawnTimer=jinSpawn;
    
    public void act()
    {
        if (--jinSpawnTimer==0)
        {
            jinSpawnTimer=jinSpawn;
            addObject(new Jin(),660, 260);
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
            KalahPage kalahLevel2 = new KalahPage();
            Greenfoot.setWorld(kalahLevel2);
        }
    }
        
    private int meteorSpawn=180, meteorSpawnTimer=meteorSpawn;
    
    public void meteorMusuh()
    {
        if (--meteorSpawnTimer==0)
        {
            meteorSpawnTimer=meteorSpawn;
            addObject(new Meteor2(), Greenfoot.getRandomNumber(660), 10);
            addObject(new Meteor2(), Greenfoot.getRandomNumber(660), 10);
        }
    }
    
    private void ketentuanMenang()
    {
        if (score == 10)
        {
            MenangPage menangLevel2 = new MenangPage();
            Greenfoot.setWorld(menangLevel2);
        }
    }
}
