import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpPage extends Menus
{

    /**
     * Constructor for objects of class HelpPage.
     * 
     */
    public HelpPage()
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
        addObject(back,502,436);
    }
}
