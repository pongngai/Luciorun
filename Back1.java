import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back1 extends Actor
{
    /**
     * Act - do whatever the Back1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
           playSound();
           Greenfoot.setWorld(new Select());
        }
    }    
    public void playSound(){
        Greenfoot.playSound("button-11.wav");
    }
}
