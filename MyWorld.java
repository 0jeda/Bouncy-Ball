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
        prepare();
    }
    
    private void prepare()
    {
        Snake snake = new Snake();
        addObject(snake,125,128);
        Spider spider = new Spider();
        addObject(spider,413,139);
        snake.setLocation(191,145);
        spider.setLocation(378,274);
    }
}
