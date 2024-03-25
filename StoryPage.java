import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoryPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryPage extends Menus
{

    /**
     * Constructor for objects of class StoryPage.
     * 
     */
    public StoryPage()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,511,433);
        back.setLocation(504,473);
        back.setLocation(508,466);
        back.setLocation(517,449);
        back.setLocation(525,454);
        back.setLocation(511,466);
        back.setLocation(499,454);
    }
}

