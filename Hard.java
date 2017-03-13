import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Actor
{
    /**
     * Act - do whatever the Hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
           playSound();
           Greenfoot.setWorld(new WorldHard());
        }
    }    
    public void playSound(){
        Greenfoot.playSound("Lucio.mp3");
        Greenfoot.playSound("button-11.wav");
    }
}
