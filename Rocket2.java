import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket2 extends Actor
{
    /**
     * Act - do whatever the Rocket2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int a = 0;
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
