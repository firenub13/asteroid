import greenfoot.*;

public class AsteroidLarge extends Actor
{
   
    GreenfootImage rock;
    
    int rotation = Greenfoot.getRandomNumber(5);
    int ySpeed = Greenfoot.getRandomNumber(3)+1;
    int ySpeedNegative;
    int xSpeed = Greenfoot.getRandomNumber(3)+1;
    int xSpeedNegative;
    int repeats;
    int set = 0;
    
    public AsteroidLarge(){
        
        rock = new GreenfootImage(70, 70);
        setImage(rock);
        rock.setColor(Color.WHITE);
        //create a list of x points
        int[] xPoints = {1, 20, 27, 42, 51, 68, 59, 46, 34, 33, 25, 23};
        //create a list of y points
        int[] yPoints = {2, 5, 19, 7, 10, 3, 65, 54, 69, 68, 60, 40};
        //use drawPolygon to draw the costume of the asteroid
        rock.drawPolygon(xPoints, yPoints, 12);
        
    }
 
    //asteroids move in random directions
    public void act() 
    {
        if (set != 1){
            if (getY()<0){
                ySpeedNegative = 0;
            }else{
                ySpeedNegative = 1;
            }
            if (getX()<0){
                xSpeedNegative = 0;
            }else{
                xSpeedNegative = 1;
            }
            if (ySpeedNegative == 1){
                ySpeed = ySpeed * -1;
            }
            if (xSpeedNegative == 1){
                xSpeed = xSpeed * -1;
            }
            set = 1;
        }
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
            getWorld().addObject(new AsteroidMedium(ySpeedNegative, xSpeedNegative), getX(), getY());
            getWorld().addObject(new AsteroidMedium(ySpeedNegative, xSpeedNegative), getX(), getY());
            SpaceWorld.Asteroids--;
            SpaceWorld.LargeAsteroids--;
            SpaceWorld.score += 250;
            getWorld().removeObject(this);
        }
    }
    
}    

