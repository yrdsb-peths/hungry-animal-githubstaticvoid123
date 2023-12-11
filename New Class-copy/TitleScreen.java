import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("Cosmic Sheep3", 60); 
    Label pressSpace = new Label ("Press 'space' to start", 40); 
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 220, 100); 
        prepare(); 
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld(); 
            Greenfoot.setWorld(gameWorld); 
        }
    }
    
    private void prepare()
    {
        Animal sheep = new Animal(); 
        addObject(sheep, 479, 98); 
        Label label0 = new Label ("Get the white apples", 40); 
        addObject(label0, 200, 160);
        Label label2 = new Label ("Avoid the red apples", 40); 
        addObject(label2, 210, 200); 
        Label label3 = new Label ("Use 'a' and 'd' to move", 40); 
        addObject(label3, 220, 240);  
        Label label4 = new Label ("Use 'w' and 's' to turn", 40); 
        addObject(label4, 230, 280); 
        Label label5 = new Label ("Press 'space' to start", 40); 
        addObject(label5, 240, 320); 
        
    }
}
