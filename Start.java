// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     */
    public Start()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("enter")) {
            Greenfoot.setWorld( new  autostrada());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
