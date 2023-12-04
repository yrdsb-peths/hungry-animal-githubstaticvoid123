import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    private String value; 
    private int fontSize; 
    private Color lineColor = Color.BLACK; 
    private Color fillColor = Color.WHITE; 
    
    private static final Color transparent = new Color(0, 0, 0, 0); 
    
    public void act()
    {
        // Add your action code here.
    }
    
    
    public Label (String value, int fontSize) 
    {
        this.value = value; 
        this.fontSize = fontSize; 
        
    }
}
