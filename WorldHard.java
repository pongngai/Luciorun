import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
//import javax.swing.JOptionPane;
/**
 * Write a description of class WorldHard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldHard extends World
{
    public static int sym = 3;
    //static String n;
    int x = 36;
    int rocket = 0;
    int time = 120;
    int i = 0 ;
    public static int score = 0;
    int flag;
    int life = 3;
    LinkedList<Life> lifes = new LinkedList<>();
   
    public WorldHard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 577, 1);
        //n=JOptionPane.showInputDialog("Enter your name :");
        score=0;
        Restart.count = 3;
         addObject(new Back1(), 59, 552);
         addObject(new Restart(),1000,560);
         addObject(new sound(),200,30);
         
         for(int i = 0; i < 3; ++i)
            lifes.addLast(new Life());
            
             
            for(Life l : lifes){
            addObject(l, x, 32);
            x += 42;
        }
        addObject(new Lucio(),545,207);
         addObject(new Wall(),48,98);
         addObject(new Wall(),295,98);
         addObject(new Wall(),546,98);
         addObject(new Wall(),776,98);
         addObject(new Wall(),993,98);
         addObject(new Wall(),179,187);
         addObject(new Wall(),415,187);
         addObject(new Wall(),655,187);
         addObject(new Wall(),881,187);
         addObject(new Wall(),290,289);
         addObject(new Wall(),538,289);
         addObject(new Wall(),772,289);
         addObject(new Wall(),171,392);
         addObject(new Wall(),414,392);
         addObject(new Wall(),653,392);
         addObject(new Wall(),884,392);
         addObject(new Wall(),49,490);
         addObject(new Wall(),292,490);
         addObject(new Wall(),532,490);
         addObject(new Wall(),774,490);
         addObject(new Wall(),992,490);
        start();
    }
    
     public void act(){
        rocket++;
        if(rocket==200){
        addObject(new Rocket3(),1000,Greenfoot.getRandomNumber(514));
        rocket = 0 ;
    }
    
    showText(" Time : "+time,getWidth()/2+15,32);
    showText(" Score : "+score,950,30);
    i++;
    if(i==80){
        time--;
        i = 0;
    }
    if(time==0){
      Greenfoot.setWorld(new Showscore());
    }
    addFlag();
}

public void addFlag(){
        flag = Greenfoot.getRandomNumber(1000);
        if(flag ==600){
        addObject(new Flag(),994,433);
        
        }
        
        if(flag == 300){
        addObject(new Flag(),57,433);    
       
        }
        
        if(flag == 100){
        addObject(new Flag(),424,336);    
        
        }
        
        if(flag == 400){
        addObject(new Flag(),779,233);
       
        }   
        
        if(flag == 200){
        addObject(new Flag(),784,434); 
        
        }
        if(flag == 700){
        addObject(new Flag(),300,434); 
        
        }
        
        if(flag == 500){
        addObject(new Flag(),549,44);    
        //flag = 0;
        }
        
        
    }
    public void removeLife()
    {
        try{
            Life life_ = lifes.getLast();
            removeObject(life_);
            lifes.removeLast();
            life--;
            if(life == 0)
            Greenfoot.setWorld(new Showscore());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public void start(){
        MyWorld.bgSound.playLoop();
        MyWorld.bgSound.setVolume(25);
    }
}
