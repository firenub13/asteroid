import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;

public class Ship extends SmoothMover
{
    GreenfootImage myImage;
    GreenfootImage myImageFire;
    int frame = 0;
    int shootCooldown;
    public Ship(){
        myImage = new GreenfootImage(50, 30);
        setImage(myImage);
        myImage.setColor(Color.WHITE);
        myImage.drawLine(5, 0, 50, 15);
        myImage.drawLine(5, 29, 50, 15);
        myImage.drawLine(11, 3, 11, 26);
        
        myImageFire = new GreenfootImage(50, 30);
        setImage(myImageFire);
        myImageFire.setColor(Color.WHITE);
        myImageFire.drawLine(5, 0, 50, 15);
        myImageFire.drawLine(5, 29, 50, 15);
        myImageFire.drawLine(11, 3, 11, 26);
        myImageFire.drawLine(11, 9, 0, 15);
        myImageFire.drawLine(11, 20, 0, 15);
        
        turn(-90);
        
    }
    
    public void act() 
    {
        shootCooldown--;
        System.out.println(getSpeed());
        move();
        if(Greenfoot.isKeyDown("left")){
          turn(-4);
        }
        if(Greenfoot.isKeyDown("right")){
          turn(4);
        }
        
        if(Greenfoot.isKeyDown("up")){
            if (frame<4){
            frame++;
            }else{
            frame = 0;
            }
            if (frame<3){
                setImage(myImageFire);
            }else{
                setImage(myImage);
            }
            Vector drift = new Vector(getRotation(), 0.1);
            addForce(drift);
        }
        else{
         accelerate(0.97);
         setImage(myImage);
        }
        
        //add a ShipBullet when the spacebar is pressed
            //use the getRotation() method when calling the ShipBullet constructor
        if(Greenfoot.isKeyDown("space")){
            if(shootCooldown<1){
              getWorld().addObject(new ShipBullet(getRotation()), getX(), getY());
              shootCooldown = 15;
            }
        }
       
     }    
}
