import greenfoot.*; 

//Line debris when an item is destroye
public class DebrisLine extends Actor
{
    
    GreenfootImage line;
    
    public DebrisLine(){
     line = new GreenfootImage(1, 22);
     setImage(line);
     line.setColor(Color.WHITE);
     line.drawLine(0, 0, 0, 22);
     setRotation(Greenfoot.getRandomNumber(360));
    }
    
    int delay = 0;
    public void act() 
    {
      move(5);
     
      delay++;
      if(delay > 35){ //line debris is removed after 36 repeats of act
           getWorld().removeObject(this);    
      }
    }    
}
