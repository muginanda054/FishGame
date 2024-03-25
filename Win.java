import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Win here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Win extends World
{

    /**
     * Constructor for objects of class Win.
     * 
     */
    public Win()
{    
    // Create a new world with 900x500 cells with a cell size of 1x1 pixels.
    super(900, 500, 1); 
    prepare();
}

/**
 * Prepare the world for the start of the program.
 * That is: create the initial objects and add them to the world.
 */
private void prepare()
{
    back back = new back();
    addObject(back, 451, 420);
    
    // Memainkan suara saat permainan selesai
    Greenfoot.playSound("stageClear.wav");
}

}

