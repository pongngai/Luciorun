import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static String Pname;

    static GreenfootSound bgSound = new GreenfootSound("song.mp3");
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 577, 1);
        addObject(new ss(),685,190);
        addObject(new Start(),511,445);
        addObject(new About(),841,444);
        
    }
}
