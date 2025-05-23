import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//The bullet that the Ship fires
public class ShipBullet extends Actor
{
   
    GreenfootImage myImage;
    //constructor - a has a parameter so that iy can receive the ships rotation
    public ShipBullet(int r){
        myImage = new GreenfootImage(5,5);
        setImage(myImage);
        myImage.setColor(Color.WHITE);
        myImage.fillOval(0, 0, 5, 5);
        setRotation(r);
    }

    public void act() 
    {

    }    
}
