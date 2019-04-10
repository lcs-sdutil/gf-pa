import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (Simon Dutil) 
 * @version (April 4th 2019)
 */
public class MyWorld extends World
{
    private boolean showIntro;
    private boolean startGame;
    private boolean gameDone;
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
        gameDone = true;
        prepare();
    }
    
     public void act()
    {
        
        spaceBarPressed();
        if (showIntro)
        {
            instruction();
            spaceBarPressed();
        }
        else if (startGame)
        {
            time();
            spondPolarBear();
        }
        endGame();
    }
    
    /**
     * Presse space bar to start 
     */
    private void spaceBarPressed()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            startGame();
            hideEndGame();
            
       }
    }
    
    /**
     * Start game 
     */
    private void startGame()
    {
        showIntro = false;
        hideInstruction();
        hideEndGame();
        startGame = true;
    }
     
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
     {
        jim = new Jim();
        addObject(jim,250,250);
    }
   
    /**
     * Show text on the screen which tell you how to play 
     */
    private void instruction()
    {
        showText("Polar Bear!", 250, 75);
        showText("Don't let the Polar Bears eat you!", 250, 225);
        showText("Press SPACE BAR to begin.", 250, 325);
     }
     
    /**
     * hide the text on the screen 
     */
    private void hideInstruction()
    {
        showText("", 250, 75);
        showText("", 250, 225);
        showText("", 250, 325);
       
    }

    /**
     * Time on the screen going from zero and up
     */ 
    private void time()
    {
        timer=timer+1;
        showText("Time: "+timer,100,30);
        
    }
    
    /**
     * spond Polar Bear every 1 second 
     */ 
    private void spondPolarBear()
    {
      if (Greenfoot.getRandomNumber(100) < 1)
        {
              addObject(new PolarBear(), Greenfoot.getRandomNumber(500), Greenfoot.getRandomNumber(500));
        }  
    }
    
    /**
     * end game show how to restart..
     */
    private void endGame()
    {
        if (gameDone)
        {
          showText("Press SPACE BAR to play again.",250 , 250);
        }
    }
    
    /**
     * hide end game during Game is on and when restarted
     */
    private void hideEndGame()
    {
        showText("",250 , 250);
    }
}
