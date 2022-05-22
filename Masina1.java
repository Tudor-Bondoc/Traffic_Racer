// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Masina1 extends Actor
{

    /**
     * Act - do whatever the Masina1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            move(-2);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(2);
        }
        if (getX() < 167) {
            setLocation(this.getX() + 1, this.getY());
        }
        if (getX() > 433) {
            setLocation(this.getX() - 1, this.getY());
        }
    }
}
