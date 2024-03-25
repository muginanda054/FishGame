import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ikan_Beracun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ikanBeracun extends Actor
{
    private int speed;
    public ikanBeracun(){
        speed=Greenfoot.getRandomNumber(5)+1;
    }
    /**
     * Act - do whatever the ikanBeracun wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        setLocation(getX()-speed,getY());
        if (getX() == 0)
        {
            setLocation(getWorld().getWidth(),Greenfoot.getRandomNumber(getWorld().getHeight()));
        }
        if(isTouching(hero.class)){
            getWorld().addObject(new ikanBeracun(),getWorld().getWidth(),Greenfoot.getRandomNumber(getWorld().getHeight()));
            
            InGame.hp.add(-1);
            
            Greenfoot.playSound("bite2.wav");
            getWorld().removeObject(this);
        }
    }
}
