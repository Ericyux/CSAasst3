import greenfoot.*;

public class Alien extends Actor {
    private int speed = 1;
    private int direction = 1;

    public Alien() {
        GreenfootImage alienImage = new GreenfootImage("defaultAlien.png");
        alienImage.scale(alienImage.getWidth() / 20, alienImage.getHeight() / 20);
        setImage(alienImage);
    }

    public void act() {
        moveAlien();
        checkEdge();
    }

    private void moveAlien() {
        setLocation(getX() + speed * direction, getY());
    }
    
    private void flipDirection() {
        direction *= -1;
    }

    private void checkEdge() {
        if (getX() <= 0 || getX() >= getWorld().getWidth() - 1) {
            moveAllAliensDown();
        }
    }

    private void moveAllAliensDown() {
        for (Object obj : getWorld().getObjects(Alien.class)) {
            Alien alien = (Alien) obj;
            alien.setLocation(alien.getX(), alien.getY() + getImage().getHeight());
            alien.flipDirection();
        }
    }

    public void disappear() {
        getWorld().removeObject(this);
    }
}
