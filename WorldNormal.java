import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
/**
 * Write a description of class WorldNormal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldNormal extends World
{
    public static int sym = 2;
    int life = 3;
    int x = 36;
    int rocket = 0;
    int time = 120;
    int i = 0 ;
    public static int score = 0;
    LinkedList<Life> lifes = new LinkedList<>();
    int floor = 47;
    int floor1 = 465;
    int floor2 = 883;
    int floor3 = 48;
    int floor4 = 464;
    int floor5 = 879;
    int flag=0;
    /**
     * Constructor for objects of class WorldNormal.
     * 
     */
    public WorldNormal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 577, 1); 
        addObject(new Lucio(),527,218);
         addObject(new Back1(), 59, 552);
         addObject(new Restart(),1000,560);
         addObject(new sound(),200,30);
         
        score = 0;
        Restart.count = 2;
        //bgSound2 = new GreenfootSound("song.mp3");
        for(int i = 0; i < 3; ++i)
            lifes.addLast(new Life());
            
             
            for(Life l : lifes){
            addObject(l, x, 32);
            x += 42;
        }
        
        addObject(new Wall(),465,98);
        addObject(new Wall(),565,98);
        addObject(new Wall(),254,195);
        addObject(new Wall(),354,195);
        addObject(new Wall(),674,195);
        addObject(new Wall(),774,195);
        for(int i = 0 ; i<2 ;i++){
            addObject(new Wall(),floor,300);
            addObject(new Wall(),floor1,300);
            addObject(new Wall(),floor2,300);
            floor+=100;
            floor1+=100;
            floor2+=100;
        }
         addObject(new Wall(),258,402);
         addObject(new Wall(),358,402);
         addObject(new Wall(),672,402);
         addObject(new Wall(),772,402);
         for(int i = 0 ; i<2 ;i++){
            addObject(new Wall(),floor3,507);
            addObject(new Wall(),floor4,507);
            addObject(new Wall(),floor5,507);
            floor3+=100;
            floor4+=100;
            floor5+=100;
        }
        start();
    }
    
     public void act(){
        rocket++;
        if(rocket==200){
        addObject(new Rocket2(),1000,Greenfoot.getRandomNumber(514));
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
    
    public void addFlag(){
        flag = Greenfoot.getRandomNumber(700);
        if(flag == 600){
        addObject(new Flag(),531,43);
        
        }
        
        if(flag == 300){
        addObject(new Flag(),52,249);    
       
        }
        
        if(flag == 100){
        addObject(new Flag(),994,249);    
        
        }
        
        if(flag == 400){
        addObject(new Flag(),47,451);
       
        }
        
        if(flag == 200){
        addObject(new Flag(),528,451); 
        
        }
        
        if(flag == 500){
        addObject(new Flag(),995,451);    
        //flag = 0;
        }
        
        
    }
    public void start(){
        MyWorld.bgSound.playLoop();
        MyWorld.bgSound.setVolume(25);
    }
}
