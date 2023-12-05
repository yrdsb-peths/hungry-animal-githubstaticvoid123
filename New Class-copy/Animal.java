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
    GreenfootImage [] idleRight = new GreenfootImage[4]; 
    GreenfootImage [] idleLeft = new GreenfootImage[4]; 
    String facing = "right"; 
    SimpleTimer animationTimer = new SimpleTimer(); 
    
    public Animal()
    {
        
        
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/Sheep_idle/tile00" + i + ".png"); 
            idleRight[i].scale(50, 50); 
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/Sheep_idle/tile00" + i + ".png");
            idleLeft[i].mirrorHorizontally(); 
            idleLeft[i].scale(50, 50); 
        }
        
        setImage(idleRight[0]); 
        
    }
    
    
    
    public void act()
    { 
        if(Greenfoot.isKeyDown("a"))
            {
                move(-5); 
                facing = "left"; 
            }
        
        if(Greenfoot.isKeyDown("d"))
            {
                move(5); 
                facing = "right"; 
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
        if (animationTimer.millisElapsed() < 200)
        {
            return; 
        }
        
        animationTimer.mark(); 
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]); 
            imageIndex = (imageIndex + 1) % idleRight.length; 
        }
        else
        {
            setImage(idleLeft[imageIndex]); 
            imageIndex = (imageIndex + 1) % idleLeft.length; 
        }
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
