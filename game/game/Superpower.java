import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Superpower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Superpower extends Actor
{
    private int dropSpeed = 2;
    private boolean onBottom = false;
    public void act()
    {
        fall();
    }
    public void fall()
    {
        if (!onBottom) {
            setLocation(getX(), getY() + dropSpeed);
            onBottom = checkBottom();
        }
    }
    public boolean checkBottom()
    {
        if (getY() > 570) {
            getWorld().removeObject(this);
            return false;
        } else {
            return false;
        }
    }
}
