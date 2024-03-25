import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{
    public static Counter score = new Counter("Score : ");
    public static Counter hp = new Counter("HP : ");
    protected static int Lvl = 0;
    
    public Level()
    {    
        super(950, 500, 1);
        prepare();

        // Tambahkan objek Barrel ke dunia saat permainan dimulai
        addObject(new Barrel(), Greenfoot.getRandomNumber(getWidth()), 0);
    }
    
    protected void prepare(){
        addObject(score, 56, 27);
        score.setValue(0);

        addObject(hp, 167, 27);
        hp.setValue(20);
        ikanKecil1 ikanKecil1 = new ikanKecil1();
        addObject(ikanKecil1, 159, 172);
        ikanKecil2 ikanKecil2 = new ikanKecil2();
        addObject(ikanKecil2, 184, 187);
        ikanKecil1 ikanKecil12 = new ikanKecil1();
        addObject(ikanKecil12, 796, 166);
        ikanKecil2 ikanKecil22 = new ikanKecil2();
        addObject(ikanKecil22, 943, 373);
        ikanKecil2 ikanKecil23 = new ikanKecil2();
        addObject(ikanKecil23, 644, 257);
        ikanKecil1 ikanKecil13 = new ikanKecil1();
        addObject(ikanKecil13, 804, 119);
        ikanKecil2 ikanKecil24 = new ikanKecil2();
        addObject(ikanKecil24, 848, 410);
    }
}
