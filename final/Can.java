import greenfoot.*;

/**
 * Cans will symbolize artwork
 * 
 * @author jpunlay@email.uscb.edu 
 * @version 11.29.2015
 */
public class Can extends Actor
{
    
    /**
     * Actions per cycle
     */
    public void act() 
    {
       movement();
       removeCan();
    }//end act method
    
    /**
     * Movement across the street
     */
    public void movement()
    {
        setLocation(getX()-2, getY());
    }//end method movement
    
    /**
     * Remove Cans()
     */
    private void removeCan()
    {
        if (getX()==0)
        {
            getWorld().removeObject(this);
        }//end if
    }//end method
}//end class
