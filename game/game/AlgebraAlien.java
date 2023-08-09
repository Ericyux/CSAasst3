import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HistoryAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AlgebraAlien extends Alien
{
    /**
     * Act - do whatever the HistoryAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public AlgebraAlien() {
        GreenfootImage algebraImage = new GreenfootImage("algebraAlien.png");
        algebraImage.scale(algebraImage.getWidth() / 20, algebraImage.getHeight() / 20);
        setImage(algebraImage);
    }
}
