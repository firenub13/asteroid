import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;

public class Ship extends SmoothMover
{
    GreenfootImage myImage;
    
    public Ship(){
        myImage = new GreenfootImage(50, 30);
        setImage(myImage);
        myImage.setColor(Color.WHITE);
        myImage.drawLine(5, 0, 50, 15);
        myImage.drawLine(5, 29, 50, 15);
        myImage.drawLine(11, 3, 11, 26);
        
        turn(-90);
        
    }
    
    public void act() 
    {
        System.out.println(getSpeed());
        move();
        if(Greenfoot.isKeyDown("left")){
          turn(-3);
        }
        if(Greenfoot.isKeyDown("right")){
          turn(3);
        }
        if(Greenfoot.isKeyDown("up")){
            Vector drift = new Vector(getRotation(), 0.1);
            addForce(drift);
        }
        else{
         accelerate(0.97);
        }
        
        //add a ShipBullet when the spacebar is pressed
            //use the getRotation() method when calling the ShipBullet constructor
            
       
     }    
}
