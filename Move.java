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
    

    public void moveRight()
    {
        setLocation ( getX() + speed, getY() );
    }
    
    public void moveLeft()
    {
        setLocation ( getX() - speed, getY() );
    }
    
    public boolean onGround()
    {
        Object under = getOneObjectAtOffset(0, getImage().getHeight()/2+5 ,Wall.class);
        return under != null;
    }

    public void setV(int speed)
    {
        vSpeed = speed;
    }
    
    public void fall()
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        if ( atBottom() ){
            Greenfoot.setWorld(new Showscore());
        }
    }
    
    private boolean atBottom()
    {
       
        return getY() >= getWorld().getHeight() - 2;
    }
    
  
}
