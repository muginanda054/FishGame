import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class overPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class overPage extends World
{

    /**
     * Constructor for objects of class overPage.
     * 
     */
    public overPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        replay replay = new replay();
        addObject(replay,302,314);
        quit quit = new quit();
        addObject(quit,614,318);
        quit.setLocation(262,353);
        replay.setLocation(635,321);
        quit.setLocation(381,307);
        replay.setLocation(625,318);
        quit.setLocation(308,301);
        quit.setLocation(298,321);
        
        
        quit.setLocation(361,344);
        replay.setLocation(583,356);
        replay.setLocation(585,342);
        Greenfoot.playSound("gameOver.wav");
    }
}