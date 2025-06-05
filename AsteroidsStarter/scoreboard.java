import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreboard extends Actor
{
    GreenfootImage board;
    String StScore = "";
    
    public scoreboard(){
        setImage(new GreenfootImage("Hello", 24, Color.WHITE, Color.BLACK));
    }
    /**
     * Act - do whatever the scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        StScore = SpaceWorld.score + "";
        setImage(new GreenfootImage(StScore, 24, Color.WHITE, Color.BLACK));
    }
}
