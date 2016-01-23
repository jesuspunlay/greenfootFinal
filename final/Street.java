import greenfoot.*;

/**
 * The Street class creates the starting point of the game,
 * 
 * 
 * @author jpunlay@email.uscb.edu 
 * @version 12-13-2015
 */
public class Street extends World
{
    public int timer;
    GreenfootSound backgroundMusic = new GreenfootSound("pairbond.mp3");
    
    /**
     * Constructor for objects of class Board.
     * 
     */
    public Street()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 562, 1); 
        setPaintOrder(Banksy.class, Police.class, Bird.class,Artwork.class, Cloud.class);
        timer=10000;
        prepare();
        
    }
    
    /**
     * The act method performs the other methods declared in this class
     */
    public void act()
    {
        timer--;
        showTimer();
        endOfGame();
        playMusic();
        moreCloud();
        moreCan();
        moreBird();
        morePolice();
        
    }//end method act
       
    /**
     * Starting point
     */
    private void prepare()
    {
        Banksy bansky = new Banksy();
        addObject( bansky, 35, 522);
        Cloud cloud = new Cloud();
        addObject( cloud, 800, 110);
        Cloud cloud1 = new Cloud();
        addObject( cloud1, 300, 90);
        Life life = new Life();
        addObject (life, 420, 20);
        Life life2 = new Life();
        addObject (life2, 460, 20);
        Life life3 = new Life();
        addObject (life3, 500, 20);
        Life life4 = new Life();
        addObject (life4, 540, 20);
        Life life5 = new Life();
        addObject (life5, 580, 20);
        
    }//end method prepare
    
    /**
     * Clouds added randomly
     */
    private void moreCloud()
    {
        if (Greenfoot.getRandomNumber(400)<1)
        {
            addObject(new Cloud(), 1000, Greenfoot.getRandomNumber(60) +60);
        }//end if
    }//end moreClouds
    
    /**
     * Cans will appear every 250 acts
     */
    private void moreCan()
    {
        if((timer%250)==0)
        {
            addObject(new Can(), 1000, 375);
        }//end while
        
    }//end movingCan
    
    /**
     * Birds on screens
     */
    private void moreBird()
    {
        if(timer%300 == 0)
        {    
            addObject(new Bird(), 1000, Greenfoot.getRandomNumber(150) +150);
        }//end if
    }//end method moreBird
    
    /**
     * Police appear on the screen 
     */
    private void morePolice()
    {
        if(timer%300 ==0)
        {
            addObject(new Police(), 1000, 522);
        }//
    }//end morePolice method
        
    /**
     * Timer displayed 
     */
    private void showTimer()
    {
        showText("Time left: " +timer, 920, 25);
    }//end method showTime
    
    /**
     * Background music
     */
    public void playMusic()
    {
        if (timer >0)
        {
            backgroundMusic.playLoop();
        }//end if
    }//end playMusic
 
   /**
     * End of game code
     */
    private void endOfGame()
    {
        if (timer == 0)
            {
                Greenfoot.stop();
                backgroundMusic.pause();
                System.out.println("For more info go to http://banksy.co.uk/!");
            }//end if
    }//end method endOfGame

}
