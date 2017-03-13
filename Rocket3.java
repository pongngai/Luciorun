import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket3 extends Actor
{
    int a = 0;
    /**
     * Act - do whatever the Rocket3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        Movement();
        Changepic();
        atEdge();
    }    
     public void Movement(){
        setLocation(getX()-3,getY());
       
    }
    public void atEdge(){
    if(isAtEdge()){
        getWorld().removeObject(this);
    }
}
public void Changepic(){
        a++;
        if(a==10){
            setImage("rocket1.png");
        }
        if(a==20){
            setImage("rocket2.png");
            
        }
        if(a==30){
            setImage("rocket3.png");
            a=0;
        }
   
    }
}
