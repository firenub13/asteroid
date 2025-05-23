import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SpaceWorld extends World
{
    //World Constructor
    public SpaceWorld()
    {    
        super(1000, 800, 1,false); 
        addObject(new Ship(), 500, 400);
        addObject(new AsteroidLarge(), 200, 200);
        
    }
    
    //world act method - add items objects when running
    public void act(){
        
        
    }
    
    
}
