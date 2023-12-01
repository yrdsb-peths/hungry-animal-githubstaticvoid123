import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Animal elephant = new Animal(); 
        addObject(elephant, 300, 300); 
        spawnApple(); 
        
        //Create a Label 
        scoreLabel = new Label("0", 20); 
        addObject(scoreLabel, 50, 50); 
    }
    
     public void increaseScore()
    {
        score++; 
        scoreLabel.setLocation(0, 80); 
    }
    
    public void gameOver() 
    {
        Label gameOverLabel = new Label("Game Over", 100); 
        addObject(gameOverLabel, 300, 200); 
    }
    public void spawnApple()
    {
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0; 
        Apple apple = new Apple (); 
        addObject(apple, x, y); 
    }
}
