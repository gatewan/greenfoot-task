import greenfoot.*;

/**
 * Write a description of class elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class elephant extends Actor
{
    /**
     * Act - do whatever the elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        
        if ( isAtEdge() )
        {
            turn(5);
        }
        
        
    }    
}
