import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private Jim jim;
    private int timer =0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    public void act()
    {
        if (Greenfoot.getRandomNumber(100) < 1)
        {
              addObject(new PolarBear(), Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        }
        
        timer=timer+1;
        showText("Time: "+timer,100,30);
    }
    
    //public Jim getHero()
    //{
    //    return(); 
    //}

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        jim = new Jim();
        addObject(jim,289,195);
    }
}
