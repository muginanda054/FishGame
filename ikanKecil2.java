import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ikan_Kecil2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ikanKecil2 extends Actor
{
    private int speed;
    public ikanKecil2(){
        speed=Greenfoot.getRandomNumber(3)+1;
    }
    /**
     * Act - do whatever the ikanKecil2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()-speed,getY());
        if (getX() == 0)
        {
            setLocation(getWorld().getWidth(),Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
    }
}
