import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class SpaceWorld extends World
{
    //World Constructor
    int cooldown = Greenfoot.getRandomNumber(100)+50;
    int xSide = 0;
    int ySide = 0;
    int side = 0;
    static int Asteroids = 0;
    static int LargeAsteroids = 0;
    public SpaceWorld()
    {    
        super(1000, 800, 1,false); 
        addObject(new Ship(), 500, 400);
        
    }
    
    //world act method - add items objects when running
    public void act(){
        if (cooldown>0){
        cooldown--;
    }else{
        side = Greenfoot.getRandomNumber(2);
        xSide = Greenfoot.getRandomNumber(2);
        ySide = Greenfoot.getRandomNumber(2);
        if (Asteroids < 20 && LargeAsteroids < 4){
            if (side==0){
            if (xSide==0){
                addObject(new AsteroidLarge(), -39, Greenfoot.getRandomNumber(800));
            }else{
                addObject(new AsteroidLarge(), 1039, Greenfoot.getRandomNumber(800));
            }
            }else{
            if (ySide==0){
                addObject(new AsteroidLarge(), Greenfoot.getRandomNumber(1000), -39);
            }else{
                addObject(new AsteroidLarge(), Greenfoot.getRandomNumber(1000), 839);
            }
            }
            LargeAsteroids++;
            Asteroids++;
        }
        cooldown = Greenfoot.getRandomNumber(200)+200;
        }
    }
}
