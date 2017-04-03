import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
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
    
    public void Movement(){// speed of rocket
        setLocation(getX()-3,getY());
 
    }
    
    public void Changepic(){// change pic every a == 10,20,30
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

    public void Life(){//method if touch lucio life will losing
        if(isTouching(Lucio.class)){
        ((WorldEasy)getWorld()).removeLife();
        
        getWorld().removeObject(this);
        }
}

public void atEdge(){//remove when at edge
    if(isAtEdge()){
        getWorld().removeObject(this);
    }
}
}

    

