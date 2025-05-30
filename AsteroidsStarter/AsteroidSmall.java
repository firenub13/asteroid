import greenfoot.*;

public class AsteroidSmall extends Actor
{
   
    GreenfootImage rock;
    
    int rotation = Greenfoot.getRandomNumber(5);
    int ySpeed = Greenfoot.getRandomNumber(2)+1;
    int ySpeedNegative;
    int xSpeed = Greenfoot.getRandomNumber(2)+1;
    int xSpeedNegative;
    int repeats;
    
    public AsteroidSmall(int ySpeedNegative, int xSpeedNegative){
        if (ySpeedNegative == 1){
            ySpeed = ySpeed * -1;
        }
        if (xSpeedNegative == 1){
            xSpeed = xSpeed * -1;
        }
        rock = new GreenfootImage(25, 25);
        setImage(rock);
        rock.setColor(Color.WHITE);
        //create a list of x points
        int[] xPoints = {1, 3, 7, 12, 15, 17, 24, 18, 13, 9, 5, 2};
        //create a list of y points
        int[] yPoints = {2, 4, 8, 3, 1, 3, 23, 21, 19, 20, 22, 18};
        //use drawPolygon to draw the costume of the asteroid
        rock.drawPolygon(xPoints, yPoints, 12);
        
    }
 
    //asteroids move in random directions
    public void act() 
    {
        setLocation(getX()+xSpeed, getY()+ySpeed);
        setRotation(getRotation()+rotation);
        if(getY()>840){
            setLocation(Greenfoot.getRandomNumber(1000), -40);
        }else if (getY()<-40){
            setLocation(Greenfoot.getRandomNumber(1000), 840);
        }
        if(getX()>1040){
            setLocation(-40, Greenfoot.getRandomNumber(800));
        }else if (getX()<-40){
            setLocation(1040, Greenfoot.getRandomNumber(800));
        }
        if(isTouching(ShipBullet.class)){
            removeTouching(ShipBullet.class);
            repeats = Greenfoot.getRandomNumber(6)+1;
            getWorld().addObject(new DebrisDot(), getX(), getY());
            getWorld().addObject(new DebrisDot(), getX(), getY());
            getWorld().addObject(new DebrisDot(), getX(), getY());
            getWorld().addObject(new DebrisDot(), getX(), getY());
            getWorld().addObject(new DebrisLine(), getX(), getY());
            getWorld().addObject(new DebrisLine(), getX(), getY());
    
            getWorld().removeObject(this);
        }
    }
    
}    


