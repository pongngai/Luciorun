import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
/**
 * Write a description of class WorldEasy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldEasy extends World
{

    /**
     * Constructor for objects of class WorldEasy.
     * 
     */
    public static int sym = 1;
    int life = 3;
    int x = 36;
    int rocket = 0;
    int time = 120;
    int i = 0 ;
    int floor = 51;
    int floor2 = 776;
    int floor3 = 404;
    int floor4 = 44;
    int floor5 = 775;
    int floor6 = 406;
    public static int score = 0;
    LinkedList<Life> lifes = new LinkedList<>();
    int flag=0;
    //static GreenfootSound bgSound = new GreenfootSound("song.mp3");
    public WorldEasy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1024, 577, 1);
        MyWorld.bgSound.playLoop();
        MyWorld.bgSound.setVolume(25);
        addObject(new Lucio(),70,395);
        addObject(new Back1(), 59, 552);
        addObject(new Restart(),1000,560);
        addObject(new sound(),200,30);
        addObject(new mute(),275,30);
        
        for(int i = 0; i < 3; ++i)
            lifes.addLast(new Life());
            
            for(Life l : lifes){
            addObject(l, x, 32);
            x += 42;
        }
        for(int i =0 ;i<3 ;i++){
            addObject(new Wall(),floor6,144);
            floor6+=100;
        }
        for(int i = 0;i<3;i++){
            addObject(new Wall(),floor,255);
            addObject(new Wall(),floor2,255);
            floor+=100;
            floor2+=100;
        }
        
        for(int i = 0;i<3;i++){
            addObject(new Wall(),floor3,363);
            floor3+=100;
        }
        
       for(int i = 0;i<3;i++){
            addObject(new Wall(),floor4,480);
            addObject(new Wall(),floor5,480);
            floor4+=100;
            floor5+=100;
        }
        
       // addFlag();
       score = 0;
       Restart.count = 1;
       //start();
    }
    
    public void act(){
        rocket++;
        if(rocket==200){
        addObject(new Rocket(),1000,Greenfoot.getRandomNumber(514));
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
      //bgSound.stop();
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
            //bgSound.stop();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void addFlag(){
        flag = Greenfoot.getRandomNumber(700);
        if(flag == 600){
        addObject(new Flag(),36,200);
        
        }
        
        if(flag == 300){
        addObject(new Flag(),512,88);    
       
        }
        
        if(flag == 100){
        addObject(new Flag(),975,200);
        
        }
        
        if(flag == 400){
        addObject(new Flag(),513,309);
       
        }
        
        if(flag == 200){
        addObject(new Flag(),37,424); 
        
        }
        
        if(flag == 500){
        addObject(new Flag(),988,424);
        //flag = 0;
        }
        
        
    }
    
    public void start(){
        MyWorld.bgSound.playLoop();
        MyWorld.bgSound.setVolume(25);
    }
}
