// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pomi2 extends Actor
{

    /**
     * Act - do whatever the Pomi2 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        this.setLocation(this.getX(), this.getY() + 1);
        if (Greenfoot.isKeyDown("up")) {
            this.setLocation(this.getX(), this.getY() + 1);
        }
        if (getY() == 399) {
            setLocation(Greenfoot.getRandomNumber(106) + 476, 25);
        }
    }
}
