import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menus extends World
{

    /**
     * Constructor for objects of class Menus.
     * 
     */
    public static GreenfootSound titleSound = new GreenfootSound("bg_04.mp3");
public Menus()
{    
    super(950, 510, 1);
    titleSound.playLoop();
}


}
