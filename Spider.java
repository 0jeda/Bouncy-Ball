import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider extends Actor
{
   private int offsetX = 5;
    private int offsetY = 5;
    private static int nextOffset=10;

    
    public Spider(){
        offsetY=-nextOffset;
        offsetX=-nextOffset;
        
        if(nextOffset > 5){
            nextOffset-=3;
        }
        
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        
        setLocation(x + offsetX, y + offsetY);
        
        if(getY() >= 380 || getY() <= 0){
            offsetY *= -1;
        }
        
        if(getX() >= 575 || getX() <= 0){
            offsetX *= -1;
        }
        
        
        
        
        
        // Add your action code here.
    }
}
