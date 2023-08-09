import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MathAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalculusAlien extends Alien
{
    /**
     * Act - do whatever the MathAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CalculusAlien() {
        GreenfootImage calculusImage = new GreenfootImage("calculusAlien.png");
        calculusImage.scale(calculusImage.getWidth() / 20, calculusImage.getHeight() / 20);
        setImage(calculusImage);
    }
}
