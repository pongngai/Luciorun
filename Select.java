import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import javax.swing.JOptionPane;
/**
 * Write a description of class Select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select extends World
{
    /**
     * Constructor for objects of class Select.
     * 
     */
    public static int sym;
    public static String message="";
    public Select()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024,577, 1);
        MyWorld.bgSound.stop();
        addObject(new Hard(),693,91);
        addObject(new Normal(),694,281);
        addObject(new Easy(),695,480);
        WorldEasy.score = 0;//reset score
        addObject(new Back(),954,59);
        message="";
    }
}
