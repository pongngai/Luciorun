import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lucio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lucio extends Move
{
    /**
     * Act - do whatever the Lucio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int a = 2;
    int run = 0;
    int run1 = 0;
    public void act() 
    {
        Movement();// Add your action code here.
        checkFall();
        Touch();
    }
    
   
    public void Movement(){
        if (Greenfoot.isKeyDown("left") )
        {
            setImage("lucioback.png");
            run1++;
            if(run1==5){
            setImage("Luciol1.png");
        }
        if(run1==10){
            setImage("lucioback.png");
            
        }
        if(run1==15){
            setImage("Luciol2.png");
            run1=0;
        }
            moveLeft();
        }
        if (Greenfoot.isKeyDown("right") )
        {
            setImage("lucioright.png");
            run++;
            if(run==5){
            setImage("Luciotest1.png");
        }
        if(run==10){
            setImage("lucioright.png");
            
        }
        if(run==15){
            setImage("Luciotest2.png");
            run=0;
        }
            moveRight();
        }
         if(Greenfoot.isKeyDown("up")){
            if(onGround())
            jump();
        }
       
        }
        
        
    public void jump(){
        setV(-20);
        fall();
        }
        
    public void checkFall()
    {
        if (onGround()) {
            setV(0);
        }
        else {
            fall();
        }
        
    }
    
    public void Touch(){
        if(isTouching(Rocket.class)){
            playSoundBomb();
            Rocket rocket = (Rocket) getOneIntersectingObject(Rocket.class);
            if(rocket != null){
                ((WorldEasy)getWorld()).removeLife();
                getWorld().removeObject(rocket);
            }
        }
        
        if(isTouching(Flag.class)){
            Flag flag = (Flag) getOneIntersectingObject(Flag.class);
            if(flag != null){
                playSound();
                WorldEasy.score++;
                WorldNormal.score++;
                WorldHard.score++;
                getWorld().removeObject(flag);
            }
            
        }
        
        if(isTouching(Rocket2.class)){
            playSoundBomb();
            Rocket2 rocket2 = (Rocket2) getOneIntersectingObject(Rocket2.class);
            if(rocket2 != null){
                
                ((WorldNormal)getWorld()).removeLife();
                getWorld().removeObject(rocket2);
            }
        }
        
        if(isTouching(Rocket3.class)){
            playSoundBomb();
            Rocket3 rocket3 = (Rocket3) getOneIntersectingObject(Rocket3.class);
            if(rocket3 != null){
                ((WorldHard)getWorld()).removeLife();
                getWorld().removeObject(rocket3);
            }
        }
        
    }
    
    public void playSound(){
        Greenfoot.playSound("button-3.wav");
       
    }
    public void playSoundBomb(){
        Greenfoot.playSound("bomb.wav");
    }
    
}
    

    
    

