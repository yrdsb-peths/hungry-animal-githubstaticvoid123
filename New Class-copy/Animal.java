import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Animal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animal extends Actor
{
    /**
     * Act - do whatever the Animal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int score = 0; 
        if(Greenfoot.isKeyDown("a"))
            {
                move(-5); 
            }
        
        if(Greenfoot.isKeyDown("d"))
            {
                move(5); 
            }
    }
    
    public void move (int distance) { 
        move(10); 
    }    
    
    public void eat() {
        if(isTouching(Apple.class)){
            removeTouching(Apple.class); 
            int score = 0; 
            score++; 
        }
    }
}
