import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
           //setImage("startdown.png");
           playSound();
           Greenfoot.setWorld(new Select());
           MyWorld.Pname=JOptionPane.showInputDialog("Enter your name :");
        }
        
        
    }    
    
    public void playSound(){
        Greenfoot.playSound("button-11.wav");
    }
}
