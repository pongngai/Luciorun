import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Actor
{
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int count;
    
    public Restart() {
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this) && count==1) {
            playSound();
            WorldEasy.score = 0;
            Greenfoot.setWorld(new WorldEasy());
        }
        if (Greenfoot.mouseClicked(this) && count==2) {
            playSound();
            WorldNormal.score = 0;
            Greenfoot.setWorld(new WorldNormal());
        }
        if (Greenfoot.mouseClicked(this) && count==3) {
            playSound();
            WorldHard.score = 0;
            Greenfoot.setWorld(new WorldHard());
        }
    }
    public void playSound(){
        Greenfoot.playSound("button-11.wav");
    }
}