import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Simon Dutil) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private boolean showIntro;
    private boolean startGame;
    private Jim jim;
    private int timer =0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 500x500 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        showIntro = true;
        // not ready to start 
        startGame = false;
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
        
        if (showIntro)
        {
            instruction();
        }
        start();
    }
    
    /**
     * Show how to play
     */
    private void start()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            showIntro= false;
            hideInstruction();
            startGame();
       }
    }
    
    /**
     * Show how to play
     */
    private void hideInstruction()
    {
        showText("", 250, 75);
        showText("", 250, 225);
        showText("", 250, 325);
       
    }
    
    /**
     * Start game 
     */
    private void startGame()
    {
        showIntro = false;
        hideInstruction();
        
        startGame = true;
    }
     
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
     {
        jim = new Jim();
        addObject(jim,289,195);
    }
   
    /**
     * Show how to play
     */
    private void instruction()
    {
        showText("Polar Bear!", 250, 75);
        showText("Don't let the Polar Bears catch you!", 250, 225);
        showText("Press SPACE BAR to begin.", 250, 325);
     }

     
    
}
