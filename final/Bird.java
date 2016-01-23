import greenfoot.*;

/**
 * Birds fly across the screen
 * 
 * @author jpunlay@email.uscb.edu 
 * @version 12-14-2015
 */
public class Bird extends Actor
{
    /**
     * Act - do whatever the Bird wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        removeBird();
    }//end Act method   
    
    /**
     * The move method allows Birds to fly across the world 
     */
    public void move()
    {
        if (getX()>750)
        {
            setLocation(getX()-2, getY()-1);
        }
        else if (getX()>400)
        {
             setLocation(getX()-2, getY()+1);
        }
        else 
        {
            setLocation(getX()-2, getY()-1);
        }//end if else

    }//end method move
    
    /**
     * Remove Birds()
     */
    private void removeBird()
    {
        if (getX()==0)
        {
            getWorld().removeObject(this);
        }//end if
    }//end removeBird method

}//end class
