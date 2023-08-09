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
    int score;
    public void act()
    {
        moveBullet();
        checkHit();
        //showScore(); Weird bug with this. The terminal keeps showing up and pausing the game
    }
    
    public Bullet(){
        getImage().scale(30,20);
        setRotation(270);
    }
    
    public void moveBullet(){
        move(speed);
        if (this.getY() <= 0) {
            Spaceship.bullets.remove(this);
            setImage((GreenfootImage)null);
        }
    }
    
public void checkHit() {
    if (isTouching(Alien.class)) {
        Alien alien = (Alien) getOneIntersectingObject(Alien.class); //https://www.greenfoot.org/topics/55648/0
        if (alien instanceof CalculusAlien) {
            if (answerCorrectly("calc")){
                removeTouching(CalculusAlien.class);
                score += 5;
            }
        } else if (alien instanceof GeoAlien) {
            if (answerCorrectly("geo")){
                removeTouching(GeoAlien.class);
                score += 5;
            }
        } else if (alien instanceof TrigAlien) {
            if (answerCorrectly("trig")){
                removeTouching(TrigAlien.class);
                score += 5;
            }
        } else if (alien instanceof AlgebraAlien) {
            if (answerCorrectly("alg")){
                removeTouching(AlgebraAlien.class);
                score += 5;
            }
        } else {
            //System.out.println("Alien hit!");
            removeTouching(Alien.class);
            score += 5;
        }
        Spaceship.bullets.remove(this);
        getWorld().removeObject(this);
    }
}

public void showScore(){
    getWorld().showText("Your high score is " + score, 0, 100);
}

public boolean answerCorrectly(String subject) {
    String[] question = Question.getRandomQuestion(subject);
    String guess = Greenfoot.ask(question[0]);
    if (guess.equals(question[1])) {
        return true;
    } else {
        return false;
    }
}
        
    
    }
    
