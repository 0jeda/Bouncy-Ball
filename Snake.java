import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.Random;
/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int offsetX = 5;
    private int offsetY = 5;
    private static int nextOffset=5;
    private int counterAddObject;
    
    public Snake(){
        offsetY=nextOffset;
        offsetX=nextOffset;
        
        nextOffset+=3;
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
        
        
        Spider spider = (Spider)getOneIntersectingObject(Spider.class);
        
        if(spider!=null && counterAddObject==0){
            
            
            Bomb bomba= new Bomb();
            World world = getWorld();
            world.addObject(bomba, x, y);
            
            counterAddObject=30;
        }
        
        if(counterAddObject>0){
            counterAddObject--;
        }
        
        
        // Add your action code here.
    }
}
