import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The PolarBear class makes him eat Jim if he touches him 
 * 
 * @author (Simon Dutil) 
 * @version (April 4th 2019)
 */
public class PolarBear extends Actor
{
    private int speed;
    
    /**
     * Constructor: Initialise the speed to a somewhat random value.
     */
    public PolarBear()
    {
        speed = Greenfoot.getRandomNumber(3) + 1;
    }
    
    /**
     * Act - do whatever the PolarBear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkCollision(); 
        Hunts();
    }   
    
    private void Hunts()
    {
        // make to polarBears move
        
        move(Greenfoot.getRandomNumber(5));
        
        if (isAtEdge())
        { 
            turn(Greenfoot.getRandomNumber(90)-45);
            
        }
        
    }
    
    /**
     * Check whether we are touching a Jim if touching remove Jim.
     * Game over if we touch Jim.
     */
    private void checkCollision()
    {
        if (isTouching(Jim.class)) 
        {
            
            removeTouching(Jim.class);
           
            Greenfoot.stop();
        }

        
     }
}
