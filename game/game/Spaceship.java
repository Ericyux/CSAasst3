import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 5, getY());
        }
        
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 5, getY());
        }
        
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-5);
        }
        
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+5);
        }
    }
    
    public Spaceship(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
        act();
    }
}
