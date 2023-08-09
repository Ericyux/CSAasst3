import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Missile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Missile extends Actor
{
    int speed = 7;
    int score;
    public void act()
    {
        moveMissile();
        checkHit();
        //showScore(); Weird bug with this. The terminal keeps showing up and pausing the game
    }
    
    public void moveMissile(){
        setLocation(getX(), getY()-speed);
        if (this.getY() <= 0) {
            Spaceship.missiles.remove(this);
            setImage((GreenfootImage)null);
        }
    }
    
    public void checkHit() {
        if (isTouching(Alien.class)) {
            Alien alien = (Alien) getOneIntersectingObject(Alien.class); //https://www.greenfoot.org/topics/55648/0
            if (alien instanceof CalculusAlien) {
                
                removeTouching(CalculusAlien.class);
                score += 5;
                
            } else if (alien instanceof GeoAlien) {
                
                removeTouching(GeoAlien.class);
                score += 5;
                
            } else if (alien instanceof TrigAlien) {
                
                removeTouching(TrigAlien.class);
                score += 5;
                
            } else if (alien instanceof AlgebraAlien) {
                
                removeTouching(AlgebraAlien.class);
                score += 5;
                
            } else {
                //System.out.println("Alien hit!");
                removeTouching(Alien.class);
                score += 5;
            }
            Spaceship.missiles.remove(this);
            getWorld().removeObject(this);
        }
    }
    
    public void showScore(){
        getWorld().showText("Your high score is " + score, 0, 100);
    }
    
}
