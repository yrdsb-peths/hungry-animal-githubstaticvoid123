import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int score = 0; 
    Label scoreLabel;
    GreenfootSound goSound = new GreenfootSound ("rock-destroy-6409.mp3"); 
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        Animal elephant = new Animal(); 
        addObject(elephant, 300, 300); 
        spawnApple(); 
        spawnApple2(); 
        badApple(); 
        
        //Create a Label 
        scoreLabel = new Label("0", 80); 
        addObject(scoreLabel, 50, 50); 
        
    }
    
    public void increaseScore()
    {
        score++; 
        scoreLabel.setValue(score);
    }
    
    public void decreaseScore()
    {
        score--; 
        scoreLabel.setValue(score); 
    }
    
    public void gameOver()
    {
        reStart(); 
        Label gameOverLabel = new Label("Game Over", 100); 
        addObject(gameOverLabel, 300, 200);  
        goSound.play(); 
        Label doOver = new Label("Press 'f' to try again", 50); 
        addObject(doOver, 300, 300);  
        
        
    }
    
    public void reStart()
    {
        if(Greenfoot.isKeyDown("f"))
            {
                TitleScreen tryAgain = new TitleScreen(); 
                Greenfoot.setWorld(tryAgain); 
            }
    }
    
    public void spawnApple()
    {
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0; 
        Apple apple = new Apple (); 
        addObject(apple, x, y); 
    }
    
    public void badApple() 
    {
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0; 
        BadApple bApple = new BadApple(); 
        addObject(bApple, x, y); 
    }
    
    public void spawnApple2() 
    {
        int x = Greenfoot.getRandomNumber(600); 
        int y = 0; 
        Apple apple2 = new Apple(); 
        addObject(apple2, x, y); 
    }
    
}
