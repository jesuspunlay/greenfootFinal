import greenfoot.*;

/**
 * Banksy collects spray cans to unveil one of his greatests pieces
 * 
 * @author jpunlay@emaul.uscb.edu   
 * @version 12-13-2015
 */
public class Banksy extends Actor
{
    private int canCounter =0;
    public int lifeCounter =5;
    int landing =0;
    private GreenfootImage image2 = new GreenfootImage("character.png");
    private GreenfootImage image1 = new GreenfootImage("character2.png");
    private GreenfootImage image3 = new GreenfootImage("character3.png");
    GreenfootSound endtrack = new GreenfootSound("track1.mp3");
    
    /**
     * Act - do whatever the Bansky wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        
        boundaries();
        movement();
        collection();
        addArt();
        loseLife();
        
    }//end method act 
    
    /**
     * BAnksy's boundaries
     */
    public void boundaries()
    {
        setLocation(getX(), getY()+20);
        if (getY() >= 522)
        {
            setLocation( getX(), 522);
        }
        
        if (getY() <=340)
        {
            setLocation( getX(), 522);
        }//end if
    }//end method 
    
    /**
     * Banksy's ability to move
     */
    public void movement()
    {
        
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation (getX(), getY()-80);
            setImage(image2);
            if(Greenfoot.isKeyDown("right"))
            {
                setLocation (getX()+60, getY());
                setImage(image2);
            }
            else if (Greenfoot.isKeyDown("left"))
             {
                setLocation (getX()-60, getY());
                setImage(image2);
            }
            else
            {
                setImage(image1);
            }
        }//end if
      
    
        
        if (Greenfoot.isKeyDown("up") == false)
        {
            if (Greenfoot.isKeyDown("left"))
            {
                setImage(image3);
                setLocation (getX()-10, getY());
            }//end if
            
            if (Greenfoot.isKeyDown("right"))
            {
                setImage(image1);
                setLocation (getX()+10, getY());
            }//end if
        }
    }//end method movement
    
     /**
     * Remove cans, collection
     */
    public void collection()
    {
        if (isTouching (Can.class))
        {
            removeTouching(Can.class);
            canCounter++;
            Greenfoot.playSound("spray.mp3");
        }//end if
    }//end collection method
    
    public void addArt()
    {
        if(canCounter ==1)
        {
            getWorld().addObject( new Artwork1(), 30, 33);
        }
        else if (canCounter ==2)
        {
            getWorld().addObject( new Artwork2(), 80, 33);
        }
         else if (canCounter ==3)
        {
            getWorld().addObject( new Artwork3(), 130, 33);
        }
         else if (canCounter ==4)
        {
            getWorld().addObject( new Artwork4(), 180, 33);
        }
        else if (canCounter ==5)
        {
            getWorld().addObject( new Artwork5(), 30, 66);
        }
        else if (canCounter ==6)
        {
            getWorld().addObject( new Artwork6(), 80, 66);
        }
        else if (canCounter ==7)
        {
            getWorld().addObject( new Artwork7(), 130, 66);
        }
        else if (canCounter ==8)
        {
            getWorld().addObject( new Artwork8(), 180, 66);
        }
        else if (canCounter ==9)
        {
            getWorld().addObject( new Artwork9(), 30, 99);
        }
        else if (canCounter ==10)
        {
            getWorld().addObject( new Artwork10(), 80, 99);
        }
        else if (canCounter ==11)
        {
            getWorld().addObject( new Artwork11(), 130, 99);
        }
        else if (canCounter ==12)
        {
            getWorld().addObject( new Artwork12(), 180, 99);
        }
        else if (canCounter ==13)
        {
            getWorld().addObject( new Artwork13(), 30, 132);
        }
        else if (canCounter ==14)
        {
            getWorld().addObject( new Artwork14(), 80, 132);
        }
        else if (canCounter ==15)
        {
            getWorld().addObject( new Artwork15(), 130, 132);
        }
        else if (canCounter ==16)
        {
            getWorld().addObject( new Artwork16(), 180, 132);
            getWorld().addObject( new Artwork(), 550, 300);
            Greenfoot.stop();
            ((Street)getWorld()).backgroundMusic.stop();
            Greenfoot.playSound("track1.mp3");
            System.out.println("For more info go to www.banksy.co.uk!");
        }//end if
    }//end method addArt
    
    /**
     * Lose a life when touching a police
     */
    
    public void loseLife()
    {
        if (isTouching(Police.class))
        {
            lifeCounter--;
            removeTouching(Police.class);
            if (lifeCounter == 4)
            {
                getWorld().removeObjects(getWorld().getObjectsAt(580, 20, Life.class));
            }
            else if (lifeCounter == 3)
            {
                getWorld().removeObjects(getWorld().getObjectsAt(540, 20, Life.class));
            }
            else if (lifeCounter == 2)
            {
                getWorld().removeObjects(getWorld().getObjectsAt(500, 20, Life.class));
            }
            else if (lifeCounter == 1)
            {
                getWorld().removeObjects(getWorld().getObjectsAt(460, 20, Life.class));
            }
            else if (lifeCounter == 0)
            {
                getWorld().removeObjects(getWorld().getObjectsAt(420, 20, Life.class));
                Greenfoot.stop();
                System.out.println("Try again");
            }
        }//end if
    }//end method loseLife

    /**
     * End track
     */
    public void endTrack()
    {
        endtrack.playLoop();
    }//end endTrack method

}//end class Banksy