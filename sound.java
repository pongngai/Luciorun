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
    String[]pic = {"sound.png","mute.png"};
    boolean mute = false;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)&&mute==false){
           setImage(pic[1]);
           playSound();
           MyWorld.bgSound.setVolume(0);
           mute = true;
        }
        else if(Greenfoot.mouseClicked(this)&&mute==true){
           setImage(pic[0]);
           playSound();
           MyWorld.bgSound.setVolume(25);
           mute = false;
        }
    }
    public void playSound(){
        Greenfoot.playSound("button-11.wav");
    }
}
