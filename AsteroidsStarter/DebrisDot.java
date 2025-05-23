import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//circular debris that is added when an item is destroyed
public class DebrisDot extends Actor
{
   
    GreenfootImage dot;
    public  DebrisDot(){
     dot = new GreenfootImage(4, 4);
     setImage(dot);
     dot.setColor(Color.WHITE);
     dot.fillOval(0, 0, 4, 4);
    
     setRotation(Greenfoot.getRandomNumber(360));
    }

    int delay = 0;
    public void act() 
    {
      move(5); //moves in a random direction
      
     delay++;
      if(delay > 20){ //dot debris is removed after 20 repeats of acts
            getWorld().removeObject(this);    
      }
    }    
}
