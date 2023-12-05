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
    GreenfootSound sheepSound = new GreenfootSound ("Sheep-Lamb-Bah-From-Far-Away-C-www.fesliyanstudios.com.mp3");
    GreenfootImage [] idle= new GreenfootImage[4]; 
    
    public Animal()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/Sheep_idle/tile00" + i + ".png"); 
            idle[i] = new
        }
        setImage(idle[0]); 
        
    }
    
    
    
    public void act()
    { 
        if(Greenfoot.isKeyDown("a"))
            {
                move(-5); 
            }
        
        if(Greenfoot.isKeyDown("d"))
            {
                move(5); 
            }
            
        if(Greenfoot.isKeyDown("s"))
            {
                turn(2); 
                move(2); 
            }
            
        if(Greenfoot.isKeyDown("w"))
            {
                turn(2); 
                move(2); 
            }
        eat();
        animateSheep(); 
    }
    
    int imageIndex = 0; 
    public void animateSheep()
    {
        setImage(idle[imageIndex]); 
        imageIndex = (imageIndex + 1) % idle.length; 
    }
    
    public void eat() {
        if(isTouching(Apple.class)){
            removeTouching(Apple.class); 
            MyWorld world = (MyWorld) getWorld(); 
            world.spawnApple(); 
            world.increaseScore(); 
            sheepSound.play(); 
        }
    }
}
