import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        prepare();
    }
    private void prepare() {
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, 200, 500);
        
        int rows = 4;
        int cols = 5;
        int spacingX = 50;
        int spacingY = 40;
                
            
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                Alien alien;
                // Randomly decide whether to spawn a special alien or default alien
                if (Greenfoot.getRandomNumber(4) == 0) {
                    int alienType = Greenfoot.getRandomNumber(4);
                    switch (alienType) {
                        case 0:
                            alien = new AlgebraAlien();
                            break;
                        case 1:
                            alien = new CalculusAlien();
                            break;
                        case 2:
                            alien = new GeoAlien();
                            break;
                        case 3:
                            alien = new TrigAlien();
                            break;
                        default:
                            alien = new Alien();
                            break;
                    }
                } else {
                    alien = new Alien();
                }
                addObject(alien, spacingX * col + spacingX / 2, spacingY * row + spacingY / 2);
            }
        }
    }
}