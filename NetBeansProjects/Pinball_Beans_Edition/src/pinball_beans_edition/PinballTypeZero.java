/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinball_beans_edition;

/**
 *
 * @author Win7-Pro-Sam
 */

import java.awt.*;
import java.util.Random;
import java.util.ArrayList;

public class PinballTypeZero {
    /**
     * Constructor for objects of class Pinball Type Zero
     *
     * @param xPos  the horizontal coordinate of the object
     * @param yPos  the vertical coordinate of the object
     * @param xVel  the horizontal speed of the object
     * @param yVel  the vertical speed of the object
     * @param objectRadius  the radius (in pixels) of the object
     * @param objectColor  the color of the object
     * @param theMachine  the machine this object is in
     */
    public PinballTypeZero(int xPos, int yPos, int xVel, int yVel, Color objectColor, double objectRadius, Machine theMachine)
    {
        super(xPos, yPos, xVel, yVel,objectColor, objectRadius, theMachine);
    }

    /**
     * Decides a new color to be set based on the current one (preventing it from being set to the same color)
     * @param currentColor the current color of the object
     * @return the new color to be assigned
     */
    public Color newColor(Color currentColor)
    {
        if (currentColor == Color.YELLOW)
        {
            return Color.MAGENTA;
        }
        
        else if (currentColor == Color.MAGENTA)
        {
            return Color.CYAN;
        }
        else
        {
            return Color.YELLOW;
        }
    }

    /**
     * When a type 0 ball hits a wall this method is called, modifying the color of the ball
     */
    public void WallEvent()
    {
        //get current colour
        Color currentColor = getColor();
        
        //get the new color
        Color newColor;
        newColor = newColor(currentColor);
        
        //set the new color
        setColor(newColor);
    }

    /**
     * When a type 0 ball hits another ball this method is called, altering the size of the ball, by changing the radius by 10%,
     * decided via a random boolean generation
     *
     * NOTE: this method is bug prone, balls may enlarge into another causing a clustered situation
     */
    public void BallEvent()
    {
        //create a new random boolean variable
        Random coinFlip = new Random();

        //Get size of pinball (radius)
        double currentRad = getRadius();
        
        //decide whether to enlarge or shrink
        boolean randomResult = coinFlip.nextBoolean();

        //Calculate new size
        double newRad;
        //this event causes the ball to grow
        if (randomResult)
        {
            newRad = currentRad * 1.1;
        }
        //this event causes the ball to shrink
        else
        {
            newRad = currentRad * 0.9;
        }

        //If the ball becomes too small or big it becomes Buggy, to prevent this
        //the boundaries are set if the ball were to become too big or small
        if (newRad < 20)
        {
            newRad = 20;
        }
        else if (newRad > 40)
        {
            newRad = 40;
        }

        //Set the new Radius
        setRadius(newRad);
    }
}
