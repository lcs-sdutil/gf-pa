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
        
    }
    
    /**
     * Presse space bar to start 
     */
    private void spaceBarPressed()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            showIntro = true;
            instruction();
            startGame();
            
            
       }
    }
    
    /**
     * Start game and hide Instruction
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
        addObject(jim,250,250);
    }
   
    /**
     * Show text on the screen which tell you how to play 
     */
    private void instruction()
     {
        showText("Polar Bear!", 250, 75);
        showText("Don't let the Polar Bears eat you!", 250, 225);
        showText("Use the arrow keys to move.", 250, 275);
         showText("Survive until the timer is at 1000", 250, 300);
        showText("Press SPACE BAR to begin.", 250, 400);
     }
     
    /**
     * hide the text on the screen 
     */
    private void hideInstruction()
    {
        showText("", 250, 75);
        showText("", 250, 225);
        showText("", 250, 275);
        showText("", 250, 300);
        showText("", 250, 400);
       
    }

    /**
     * Time on the screen going from zero and up and end game at 1000
     */ 
    private void time()
    {
        timer=timer+1;
        showText("Time: "+timer,100,30);
        
        if (timer == 1000)
            {
                startGame = false;
                endGame();
                
            }
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
      * end game show that you won the game  
     */
    private void endGame()
    {
        
          showText("Good job!.",250 , 250);
    }
    
    
    
}
