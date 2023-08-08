import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    int speed = 3;
    public void act()
    {
        moveBullet();
        checkHit();
    }
    
    public Bullet(){
        getImage().scale(30,20);
        setRotation(270);
    }
    
    public void moveBullet(){
        move(speed);
    }
    
    public void checkHit(){
        if(isTouching(AlgebraAlien.class)){
            removeTouching(AlgebraAlien.class);
            getWorld().removeObject(this);
        }
        else if(isTouching(CalculusAlien.class)){
            removeTouching(CalculusAlien.class);
            getWorld().removeObject(this);
        }
        else if(isTouching(DefaultAlien.class)){
            removeTouching(DefaultAlien.class);
            getWorld().removeObject(this);
        }
        else if(isTouching(GeoAlien.class)){
            removeTouching(GeoAlien.class);
            getWorld().removeObject(this);
        }
        else if(isTouching(TrigAlien.class)){
            removeTouching(TrigAlien.class);
            getWorld().removeObject(this);
        }
        }
        
        
    }
    
