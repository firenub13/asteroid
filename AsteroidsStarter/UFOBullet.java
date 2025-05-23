import greenfoot.*; 

//bullet that the UFO fires at random in a random direction
public class UFOBullet extends Actor
{
    GreenfootImage myImage;
    public UFOBullet(){
     myImage = new GreenfootImage(5,5);
     setImage(myImage);
     myImage.setColor(Color.RED);
     myImage.fillOval(0, 0, 5, 5);
     setRotation(Greenfoot.getRandomNumber(360));
    }
    
    public void act()
    {
        
        
        
    }
}
