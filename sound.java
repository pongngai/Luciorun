import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sound extends Actor
{
    /**
     * Act - do whatever the sound wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
           MyWorld.bgSound.setVolume(25);
        }
    }    
}
