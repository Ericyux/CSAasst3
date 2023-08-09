import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpanishAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GeoAlien extends Alien
{
    /**
     * Act - do whatever the SpanishAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GeoAlien() {
        GreenfootImage geoImage = new GreenfootImage("geoAlien.png");
        geoImage.scale(geoImage.getWidth() / 20, geoImage.getHeight() / 20);
        setImage(geoImage);
    }
}
