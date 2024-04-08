import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Frog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Frog extends Actor
{
    /**
     * Act - do whatever the Frog wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Frog(){
        getImage().scale(100, 100);
    }
    
    
    public void act()
    {
        checkKeyboard();
        isHit();
    }
    
    public void isHit()
    {
        if(isTouching(Bee.class))
        {
            removeTouching(Bee.class);
            
            MyWorld w=(MyWorld)getWorld();
            Bee myBee=new Bee();
            w.eatbee();
            w.addObject(myBee,Greenfoot.getRandomNumber(600)+100, Greenfoot.getRandomNumber(600)+100);
        }
    }
    
    public void checkKeyboard(){
        //kikker naar rechts bewegen
        boolean key=Greenfoot.isKeyDown("right");
        if (key==true)
        {
            setLocation(getX()+4,getY());
        }
        
        //kikker naar links bewegen
        key=Greenfoot.isKeyDown("left");
        if (key==true)
        {
            setLocation(getX()-4,getY());
        }
        
        //kikker naar boven bewegen
        key=Greenfoot.isKeyDown("up");
        if (key==true)
        {
            setLocation(getX(),getY()-4);
        }
        
        
        //kikker naar beneden bewegen
        key=Greenfoot.isKeyDown("down");
        if (key==true)
        {
            setLocation(getX(),getY()+4);
        }
    }
}
