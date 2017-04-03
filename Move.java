import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Move here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Move extends Actor
{
    /**
     * Act - do whatever the Move wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final int acceleration = 2;      // down (gravity)
    private static final int speed = 7;             // running speed (sideways)
    
    private int vSpeed = 0;                         // current vertical speed
    

    public void moveRight()//move right
    {
        setLocation ( getX() + speed, getY() );
    }
    
    public void moveLeft()//move left
    {
        setLocation ( getX() - speed, getY() );
    }
    
    public boolean onGround()//set lucio can walk on wall
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2+5 ,Wall.class);
        return under != null;
    }

    public void setV(int speed)//set speed
    {
        vSpeed = speed;
    }
    
    public void fall()//set speed when fall
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        if ( atBottom() ){
            Greenfoot.setWorld(new Showscore());
        }
    }
    
    private boolean atBottom()//for check you at bottom
    {
       
        return getY() >= getWorld().getHeight() - 2;
    }
    
  
}
