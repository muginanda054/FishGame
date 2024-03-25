import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InGame extends Level
{

    /**
     * Constructor for objects of class InGame.
     * 
     */
    //public static Counter Score=new Counter("Score :");
    public InGame()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        Lvl = 1;
        hero hero = new hero();
        addObject(hero,135,303);
        prepare();
    }
    
}

