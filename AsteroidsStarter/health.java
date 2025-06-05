import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class health extends Actor
{
    GreenfootImage zero;
    GreenfootImage one;
    GreenfootImage two;
    GreenfootImage three;
    
    public health(){
        one = new GreenfootImage(50, 30);
        setImage(one);
        one.setColor(Color.WHITE);
        one.drawLine(5, 0, 50, 15);
        one.drawLine(5, 29, 50, 15);
        one.drawLine(11, 3, 11, 26);
        two = new GreenfootImage(50, 30);
        setImage(two);
        two.setColor(Color.WHITE);
        two.drawLine(5, 0, 50, 15);
        two.drawLine(5, 29, 50, 15);
        two.drawLine(11, 3, 11, 26);
        two = new GreenfootImage(50, 30);
        setImage(two);
        two.setColor(Color.WHITE);
        two.drawLine(5, 0, 50, 15);
        two.drawLine(5, 29, 50, 15);
        two.drawLine(11, 3, 11, 26);
    }
    /**
     * Act - do whatever the health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
