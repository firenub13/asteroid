import greenfoot.*;

public class AsteroidMedium extends Actor
{
   
    GreenfootImage rock;
    
    int rotation = Greenfoot.getRandomNumber(5);
    int ySpeed = Greenfoot.getRandomNumber(3)+1;
    int ySpeedNegative;
    int xSpeed = Greenfoot.getRandomNumber(3)+1;
    int xSpeedNegative;
    int repeats;
    
    public AsteroidMedium(int ySpeedNegative, int xSpeedNegative){
        if (ySpeedNegative == 1){
            ySpeed = ySpeed * -1;
        }
        if (xSpeedNegative == 1){
            xSpeed = xSpeed * -1;
        }
        rock = new GreenfootImage(40, 40);
        setImage(rock);
        rock.setColor(Color.WHITE);
        //create a list of x points
        int[] xPoints = {1, 8, 16, 26, 31, 37, 39, 29, 23, 15, 9, 2};
        //create a list of y points
        int[] yPoints = {2, 5, 9, 1, 3, 3, 32, 36, 39, 35, 31, 34};
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
            SpaceWorld.Asteroids+=2;
            getWorld().addObject(new AsteroidSmall(ySpeedNegative, xSpeedNegative), getX(), getY());
            getWorld().addObject(new AsteroidSmall(ySpeedNegative, xSpeedNegative), getX(), getY());
            SpaceWorld.Asteroids--;
            SpaceWorld.score += 100;
            getWorld().removeObject(this);
        }
    }
    
}    

