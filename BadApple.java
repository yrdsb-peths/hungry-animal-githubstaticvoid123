import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadApple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadApple extends Actor
{
    /**
     * Act - do whatever the BadApple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(), getY() + 5); 
        
        MyWorld world = (MyWorld) getWorld(); 
        if(getY() >= world.getHeight())
        {
            world.badApple();
            world.removeObject(this); 
        }
    }
}
