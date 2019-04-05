import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jim here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jim extends Actor
{
    /**
     * Act - Make Jim move left, right, up and down by using the arrow keys
     */
    public void act() 
    {
        checkKeyPress();
    }
    
    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("up")) 
        {
            setLocation(getX(), getY()-3);
        }
        
        if (Greenfoot.isKeyDown("down")) 
        {
            setLocation(getX(), getY()+3);
        }
        
        if (Greenfoot.isKeyDown("left")) 
        {
            move(-3);
        }
        
        if (Greenfoot.isKeyDown("right")) 
        {
            move(3);
        }
    
    }
}
