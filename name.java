import greenfoot.*;
import java.awt.Color;
 
public class name extends Actor
{
    public name()
    {
     GreenfootImage img = new GreenfootImage(MyWorld.Pname, 90, Color.white, new Color(0, 0, 0, 0));   
    img.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 12));
    setImage(img);
    }

    public void act()
    {
    }
}
