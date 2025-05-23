import greenfoot.*;

public class AsteroidLarge extends Actor
{
   
    GreenfootImage rock;
    
    int rotation = Greenfoot.getRandomNumber(5);
    int ySpeed = Greenfoot.getRandomNumber(7)+1;
    int ySpeedNegative = Greenfoot.getRandomNumber(2);
    int xSpeed = Greenfoot.getRandomNumber(7)+1;
    int xSpeedNegative = Greenfoot.getRandomNumber(2);
    
    public AsteroidLarge(){
        if (ySpeedNegative == 1){
            ySpeed = ySpeed * -1;
        }
        if (xSpeedNegative == 1){
            xSpeed = xSpeed * -1;
        }
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
        setLocation(getX()+xSpeed, getY()+ySpeed);
        setRotation(getRotation()+rotation);
    }
    
}    

