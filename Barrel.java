import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Barrel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Barrel extends Actor {
    private int respawnDelay = 250; // Sesuaikan dengan kecepatan respawn yang Anda inginkan
    private int respawnTimer = 1;

    public Barrel() {
        GreenfootImage image = new GreenfootImage("Barrel2.png"); // Ganti dengan nama gambar Barrel Anda
        setImage(image);
    }

    public void act() {
        // Tambahkan objek Barrel secara terus menerus setelah jeda waktu tertentu
        if (respawnTimer >= respawnDelay) {
            getWorld().addObject(new Barrel(), Greenfoot.getRandomNumber(getWorld().getWidth()), 0);
            respawnTimer = 0;
        } else {
            respawnTimer++;
        }

        setLocation(getX(), getY() + 1); // Muncul dari atas dan bergerak ke bawah

        if (isTouching(hero.class)) {
            

            // Kurangi kecepatan hero saat bertabrakan dengan Barrel
            hero theHero = (hero) getOneIntersectingObject(hero.class);
            if (theHero != null) {
                theHero.speed -= 1; // Kurangi kecepatan hero sebanyak 1
            }
        }

        // Hapus objek Barrel saat mencapai batas bawah dunia
        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }
}

