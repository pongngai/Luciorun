import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    public Select()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024,577, 1);
        addObject(new Hard(),693,91);
        addObject(new Normal(),694,281);
        addObject(new Easy(),695,480);
        addObject(new Back(), 953, 58);
        WorldEasy.score = 0;
    }
}
