import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hero extends Actor {
    int speed = 3;
    int slowdownTimer = 0; // Timer untuk melambat

    public void act() {
        checkCollision();
        if (slowdownTimer > 0) {
            // Mengurangi kecepatan hero jika dalam mode melambat
            speed = 1;
            slowdownTimer--;
            if (slowdownTimer == 0) {
                // Mengembalikan kecepatan normal
                restoreSpeed();
            }
        }

        // Handle kontrol gerakan hero
        if (Greenfoot.isKeyDown("LEFT")) {
            setLocation(getX() - speed, getY());
        }

        if (Greenfoot.isKeyDown("RIGHT")) {
            setLocation(getX() + speed, getY());
        }

        if (Greenfoot.isKeyDown("UP")) {
            setLocation(getX(), getY() - speed);
        }

        if (Greenfoot.isKeyDown("DOWN")) {
            setLocation(getX(), getY() + speed);
        }

        if (Level.Lvl == 1) {
    if (InGame.score.getValue() < 100) {
        getImage().scale(80, 60);
    } else if (InGame.score.getValue() >= 100 && InGame.score.getValue() < 200) {
        getImage().scale(100, 80);
    } else if (InGame.score.getValue() >= 200) {
        getImage().scale(150, 100);
        Greenfoot.setWorld(new Lv2());
    }
} else if (Level.Lvl == 2) {
    if (InGame.score.getValue() < 200) {
        getImage().scale(100, 80);
    } else if (InGame.score.getValue() >= 200 && InGame.score.getValue() < 250) {
        getImage().scale(150, 100);
    } else if (InGame.score.getValue() >= 250) {
        getImage().scale(200, 250);
        Greenfoot.setWorld(new Lv3());
    }
} else if (Level.Lvl == 3) {
    if (InGame.score.getValue() < 250) {
        getImage().scale(150, 100);
    } else if (InGame.score.getValue() >= 250) {
        getImage().scale(200, 250);
        Greenfoot.setWorld(new Win());
    }
}// Tambahkan logika Level.Lvl di sini sesuai kebutuhan Anda
    }

    private void checkCollision() {
        if (isTouching(ikanKecil1.class)) {
            getWorld().addObject(new ikanKecil1(), getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
            removeTouching(ikanKecil1.class);
            InGame.score.add(1);
            Greenfoot.playSound("bite2.wav");
        }
        if (isTouching(ikanKecil2.class)) {
            getWorld().addObject(new ikanKecil2(), getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
            removeTouching(ikanKecil2.class);
            InGame.score.add(2);
            Greenfoot.playSound("bite2.wav");
        }

        if (isTouching(ikanBeracun.class)) {
            getWorld().addObject(new ikanBeracun(), getWorld().getWidth(), Greenfoot.getRandomNumber(getWorld().getHeight()));
            removeTouching(ikanBeracun.class);
            InGame.hp.add(-1);
            Greenfoot.playSound("bite2.wav");
            if (Level.hp.getValue() <= 0) {
                Greenfoot.setWorld(new overPage());
                getWorld().removeObject(this);
            }
        }
        if (isTouching(Torpedo.class)) {
            removeTouching(Torpedo.class);
            Level.hp.add(-3);
            Greenfoot.playSound("hit.wav");
            if (Level.hp.getValue() <= 0) {
                Greenfoot.setWorld(new overPage());
                getWorld().removeObject(this);
            }
        }

        if (isTouching(Barrel.class)) {
            // Terkena Barrel, lakukan perlambatan selama 3 detik
            slowdownTimer = 180;
            getWorld().removeObject(getOneIntersectingObject(Barrel.class));
        }
    }

    public void setSlowdownTimer(int time) {
        // Mengatur timer untuk melambat
        slowdownTimer = time;
    }

    public void restoreSpeed() {
        // Mengembalikan kecepatan hero ke nilai normal
        speed = 3;
    }
}

