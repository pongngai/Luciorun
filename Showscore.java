import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Showscore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Showscore extends World
{
    String[]number = {"0.png","1.png","2.png","3.png","4.png","5.png","6.png","7.png","8.png","9.png",};
    /**
     * Constructor for objects of class Showscore.
     * 
     */
    public Showscore()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 577, 1);
        addObject(new Playagain(),702,477);
        addObject(new Score(),550,218);
        addNumber();
        playSound();
    }
    
    public void addNumber(){
        if(WorldEasy.sym == 1){
        if(WorldEasy.score/10!=0){
           addObject(new Number(number[WorldEasy.score/10]),818,218);
        }
        addObject(new Number(number[WorldEasy.score%10]),903,218);
        WorldEasy.score = 0;
    }
        if(WorldNormal.sym == 2){
        if(WorldNormal.score/10!=0){
           addObject(new Number(number[WorldNormal.score/10]),818,218);
        }
        addObject(new Number(number[WorldNormal.score%10]),903,218);
        WorldNormal.score = 0;
    }
        if(WorldHard.sym == 3){
        if(WorldHard.score/10!=0){
           addObject(new Number(number[WorldHard.score/10]),818,218);
        }
        addObject(new Number(number[WorldHard.score%10]),903,218);
        WorldHard.score = 0;
    }
    }
    public void playSound(){
        Greenfoot.playSound("gameover.wav");
    }
}
