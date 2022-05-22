// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Masini_sens_opus extends Actor
{

    /**
     * Act - do whatever the Masini_sens_opus wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(Greenfoot.getRandomNumber(5));
        if (Greenfoot.isKeyDown("up")) {
            this.setLocation(this.getX(), this.getY() + 2);
        }
        Actor a = this.getOneIntersectingObject(Masina1.class);
        if (a != null) {
            Greenfoot.setWorld( new  GameOver());
        }
        int i = 0;
        if (getY() == 399) {
            setLocation(Greenfoot.getRandomNumber(236) + 140, 25);
        }
    }
}
