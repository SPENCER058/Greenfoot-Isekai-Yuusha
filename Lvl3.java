import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl3 extends World
{
    private int score;
    private int nyawa = 1;
    /**
     * Constructor for objects of class Lvl1.
     * 
     */
    public Lvl3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(667, 375, 1);
        tampilnyawa();
        tampilscore();
        prepare();
    }
    
    private int medusaSpawn=200, medusaSpawnTimer=medusaSpawn;
    
    public void act()
    {
        if (--medusaSpawnTimer==0)
        {
            medusaSpawnTimer=medusaSpawn;
            addObject(new Medusa(),660, 230);
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
            KalahPage kalahLevel3 = new KalahPage();
            Greenfoot.setWorld(kalahLevel3);
        }
    }
    
    private int meteorSpawn=180, meteorSpawnTimer=meteorSpawn;
    
    public void meteorMusuh()
    {
        if (--meteorSpawnTimer==0)
        {
            meteorSpawnTimer=meteorSpawn;
            addObject(new Meteor3(), Greenfoot.getRandomNumber(660), 10);
            addObject(new Meteor3(), Greenfoot.getRandomNumber(660), 10);
            addObject(new Meteor3(), Greenfoot.getRandomNumber(660), 10);
        }
    }
    
        private void ketentuanMenang()
    {
        if (score == 10)
        {
            MenangPage menangLevel3 = new MenangPage();
            Greenfoot.setWorld(menangLevel3);
        }
    }
}
