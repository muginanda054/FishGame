import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lv3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lv3 extends Level implements Next.prepared
{

    /**
     * Constructor for objects of class Lv3.
     * 
     */
    public Lv3()
    {
        Lvl = 3;
        hero hero = new hero();
        addObject(hero,135,303);
        musuh musuh = new musuh();
        addObject(musuh,822,302);
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

