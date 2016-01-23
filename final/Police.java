import greenfoot.*;

/**
 * Police officers try to stop Banksy
 * 
 * @author jesus.eplm@gmail.com  
 * @version 12-14-2015
 */
public class Police extends Actor
{
    /**
     *Police officers move across the xaxis and try to stop banksy
     */
    public void act() 
    {
        move();
        removePolice();
    }//end Act method    
    
    /**
     * Policemen movement
     */public void move()
    {
        setLocation(getX()-4, getY());
    }//end method move
    
    /**
     * Remove Police()
     */
    private void removePolice()
    {
        if (getX()==0)
        {
            getWorld().removeObject(this);
        }//end if
    }//end method
    
}//end class
