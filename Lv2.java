import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lv2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lv2 extends Level implements Next.prepared
{

    /**
     * Constructor for objects of class Lv2.
     * 
     */
    public Lv2()
    {
        Lvl = 2;
        hero hero = new hero();
        addObject(hero,135,300);
        ikanBeracun ikanBeracun = new ikanBeracun();
        addObject(ikanBeracun,822,302);
        prepare();
    }
    
    @Override
    public void prepared(){
        ikanBeracun ikanBeracun = new ikanBeracun();
        addObject(ikanBeracun,656,145);
        ikanBeracun ikanBeracun2 = new ikanBeracun();
        addObject(ikanBeracun2,827,39);
    }
}
