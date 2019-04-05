import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The PolarBear class makes him eat Jim if he touches him 
 * 
 * @author (Simon Dutil) 
 * @version (April 4th 2019)
 */
public class PolarBear extends Actor
{
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
        // make 
        move(1);
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
