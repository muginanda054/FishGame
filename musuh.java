import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class musuh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class musuh extends Actor
{
    /**
     * Act - do whatever the musuh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int y = 1;
    int serang = 0;
    private static int health = 100;
    private static int atk = 10;
    public void act()
    {
        // Add your action code here.
        setLocation(getX(),getY()+y);
        if(isAtEdge()){
            y=-y;
        }
        serang();
    }
    
    private void serang(){
        serang++;
        if(serang == 150){
            getWorld().addObject(new Torpedo(),getX(),getY());
            serang = 0;
            Greenfoot.playSound("blast.wav");
        }
    }
    
    static public int getHealthMusuh(){
        return health;
    }
    
    static public int musuhAttack(){
        return atk;
    }
}