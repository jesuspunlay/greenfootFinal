import greenfoot.*;

/**
 * Clouds add flow to the game
 * 
 * @author jpunlay@email.uscb.edu
 * @version 11.27.2015
 */
public class Cloud extends Actor
{
    /**
     * Clouds will move across the x-axis 
     */
    public void act() 
    {
        move();
        removeCloud();
    }//end method    
    
    public void move()
    {
        setLocation(getX()-1, getY());
    }//end move
    
    /**
     * remove clouds()
     */
    private void removeCloud()
    {
        if (getX()==0)
        {
            getWorld().removeObject(this);
        }//end if
    }//end method
}//end class
