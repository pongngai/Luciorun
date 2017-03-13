import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normal extends Actor
{
    /**
     * Act - do whatever the Normal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
           playSound();
           Greenfoot.setWorld(new WorldNormal());
        }
    }   
    
    public void playSound(){
        Greenfoot.playSound("Lucio.mp3");
        Greenfoot.playSound("button-11.wav");
    }
}
