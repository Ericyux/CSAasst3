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
    public static ArrayList<Missile> missiles = new ArrayList<Missile>();
    private int time = 30;
    private int originalTime = 30;
    public static int speed = 2;
    public int AgilityTimer = 0;
    public static int InvincibilityTimer = 0;
    public static int ammo = 0;
    private GreenfootImage image;

    public void act()
    {
        move();
        shoot();
        MyWorld myWorld = (MyWorld) getWorld();
        
        if (Greenfoot.getRandomNumber(2000) == 0){
            myWorld.prepareAliens();
        }
        if (canCatchAgilityPower()) {
            catchAgilityPower();
        }
        if (canCatchAmmoPower()) {
            catchAmmoPower();
        }
        if (canCatchInvincibilityPower()) {
            catchInvincibilityPower();
        }
        if (AgilityTimer == 0){
            speed = 2;
        }
        if (InvincibilityTimer == 1){
            
            image = new GreenfootImage("fighterJet.png");
            image.scale(50,50);
            setImage(image);
            InvincibilityTimer = 0;
        }
        if (AgilityTimer > 0){
            AgilityTimer -= 1;
        }
        if (InvincibilityTimer > 1){
            InvincibilityTimer -= 1;
        }
        //reload();
    }
    
    public Spaceship(){
        GreenfootImage image = getImage();
        image.scale(50,50);
        setImage(image);
        
    }
    
    
    public void move(){
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + speed, getY());
        }
        
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - speed, getY());
        }
        
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY()-speed);
        }
        
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY()+speed);
        }
    }
    public void shoot(){
        if (Greenfoot.isKeyDown("space")){
            if (ammo > 0){
                if (missiles.size() <= 0 || 
            missiles.get(missiles.size() - 1).getY() <= this.getY() - 50) {
                Missile m = new Missile();
                getWorld().addObject(m, getX(), getY()-10);
                missiles.add(m);
                ammo -= 1;
                }
            }
            else if (ammo == 0){
                if (bullets.size() <= 0 || 
            bullets.get(bullets.size() - 1).getY() <= this.getY() - 50) {
                Bullet b = new Bullet();
                getWorld().addObject(b, getX(), getY()-10);
                bullets.add(b);
                }
            }
            
        }
    }
    private boolean canCatchAgilityPower() {
        List<Agility> agility = getObjectsInRange(35, Agility.class);
        if (agility.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
    private void catchAgilityPower() {
        Actor agility = getObjectsInRange(35, Agility.class).get(0);
        if(agility != null) {
            AgilityTimer= 300;
            speed = 5;
            getWorld().removeObject(agility);
        }
        
    }
    private boolean canCatchInvincibilityPower() {
        List<Invincibility> invs = getObjectsInRange(35, Invincibility.class);
        if (invs.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
    private void catchInvincibilityPower() {
        Actor inv = getObjectsInRange(35, Invincibility.class).get(0);
        if(inv != null) {
            InvincibilityTimer= 200;
            image = new GreenfootImage("shieldjet.png");
            setImage(image);
            getWorld().removeObject(inv);
        }
        
    }
    private boolean canCatchAmmoPower() {
        List<AmmoExtra> ammos = getObjectsInRange(35, AmmoExtra.class);
        if (ammos.size() > 0) {
            return true;
        } else {
            return false;
        }
    }
    private void catchAmmoPower() {
        Actor ammos = getObjectsInRange(35, AmmoExtra.class).get(0);
        if(ammos != null) {
            ammo += 1;
            getWorld().removeObject(ammos);
        }
        
    }
}
