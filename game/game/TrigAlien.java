import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChemAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrigAlien extends Alien
{
    /**
     * Act - do whatever the ChemAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TrigAlien() {
        GreenfootImage trigImage = new GreenfootImage("trigAlien.png");
        trigImage.scale(trigImage.getWidth() / 20, trigImage.getHeight() / 20);
        setImage(trigImage);
    }
}
