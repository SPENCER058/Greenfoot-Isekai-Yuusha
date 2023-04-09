import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevel extends World
{
    /**
     * Constructor for objects of class SelectLevel.
     * 
     */
    public SelectLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(667, 375, 1); 
        prepare();
    }
    
    private void prepare()
    {
        SelectLevelButton LV1Button = new SelectLevelButton("Button_SelectLevel_Level1.png", new Lvl1());
        addObject(LV1Button,210,160);
        
        SelectLevelButton LV2Button = new SelectLevelButton("Button_SelectLevel_Level2.png", new Lvl2());
        addObject(LV2Button,450,160);
        
        SelectLevelButton LV3Button = new SelectLevelButton("Button_SelectLevel_Level3.png", new Lvl3());
        addObject(LV3Button,333,250);
        
        SelectLevelButton TutorialButton = new SelectLevelButton("TutorialButton.png", new TutorialScreen());
        addObject(TutorialButton, 570, 330);
        
        SelectLevelExitButton SelectLevelExitButton  = new SelectLevelExitButton();
        addObject(SelectLevelExitButton, 60, 330);
    }
    
}
