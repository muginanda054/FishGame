import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ikan_Kecil1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ikanKecil1 extends Actor
{
    protected int speed=Greenfoot.getRandomNumber(5)+1;
     public ikanKecil1(){
         turn(0);
        }
    public ikanKecil1(int enemySpeed){
        speed=Greenfoot.getRandomNumber(5)+1;
    }
    /**
     * Act - do whatever the ikanKecil1 wants to do. This method is called whenever
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
