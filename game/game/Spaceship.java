import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    public static ArrayList<Bullet> bullets = new ArrayList<Bullet>();
    public void act()
    {
        move();
        shoot();
        //reload();
    }
    
    public Spaceship(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
        act();
    }
    
    
    public void move(){
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
    public void shoot(){
        if (Greenfoot.isKeyDown("space")){
            if (bullets.size() <= 0 || 
            bullets.get(bullets.size() - 1).getY() <= this.getY() - 50) {
                Bullet b = new Bullet();
                getWorld().addObject(b, getX(), getY()-10);
                bullets.add(b);
            }
        }
    }
}
