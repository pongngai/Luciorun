import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Method here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Method extends Actor
{
    public static  int speed = 5;
    /**
     * Act - do whatever the Method wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2-8 , null);
        return under != null;
    }
    
    
}
