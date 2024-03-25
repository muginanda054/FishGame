import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuPage extends Menus
{

    /**
     * Constructor for objects of class MenuPage.
     * 
     */
    public MenuPage()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        StoryBtn storyBtn = new StoryBtn();
        addObject(storyBtn,802,151);
        StartBtn startBtn = new StartBtn();
        addObject(startBtn,115,121);
        startBtn.setLocation(109,130);
        removeObject(startBtn);
        storyBtn.setLocation(788,149);
        removeObject(storyBtn);
        StartBtn startBtn2 = new StartBtn();
        addObject(startBtn2,794,264);
        HelpBtn_over helpBtn_over = new HelpBtn_over();
        addObject(helpBtn_over,684,388);
        StoryBtn storyBtn2 = new StoryBtn();
        addObject(storyBtn2,599,307);
        startBtn2.setLocation(784,124);
        storyBtn2.setLocation(778,277);
        helpBtn_over.setLocation(705,389);
        storyBtn2.setLocation(777,274);
        helpBtn_over.setLocation(748,355);
        credits credits = new credits();
        addObject(credits,636,435);
        credits.setLocation(676,252);
        helpBtn_over.setLocation(607,447);
        credits.setLocation(708,395);
        helpBtn_over.setLocation(638,431);
        credits.setLocation(723,383);
        storyBtn2.setLocation(768,280);
        credits.setLocation(748,347);
        helpBtn_over.setLocation(655,419);
        credits.setLocation(724,389);
        storyBtn2.setLocation(759,286);
        credits.setLocation(734,386);
        helpBtn_over.setLocation(640,424);
        storyBtn2.setLocation(772,249);
        credits.setLocation(754,341);
        credits.setLocation(736,369);
        credits.setLocation(742,364);
        helpBtn_over.setLocation(666,451);
        startBtn2.setLocation(747,127);
        startBtn2.setLocation(318,187);
        helpBtn_over.setLocation(33,40);
        storyBtn2.setLocation(325,280);
        credits.setLocation(294,359);
        storyBtn2.setLocation(295,282);
        credits.setLocation(296,353);
        storyBtn2.setLocation(307,278);
        storyBtn2.setLocation(290,280);
        storyBtn2.setLocation(284,275);
        storyBtn2.setLocation(304,280);
        storyBtn2.setLocation(317,267);
        storyBtn2.setLocation(315,260);
        storyBtn2.setLocation(328,262);
        credits.setLocation(330,383);
        storyBtn2.setLocation(322,278);
    }
}
