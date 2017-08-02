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

public class Pinball {
private int objectScore;
    private boolean removed;
    private int framesToDelay;
    /**
     * Constructor for objects of class Pinball
     *
     * @param xPos  the horizontal coordinate of the object
     * @param yPos  the vertical coordinate of the object
     * @param xVel  the horizontal speed of the object
     * @param yVel  the vertical speed of the object
     * @param objectRadius  the radius (in pixels) of the object
     * @param objectColor  the color of the object
     * @param theMachine  the machine this object is in
     */
    public Pinball(int xPos, int yPos, int xVel, int yVel, Color objectColor, double objectRadius, Machine theMachine)
    {
        super(xPos, yPos, xVel, yVel, objectColor, objectRadius, theMachine);

        //Initialise the score and delay variable
        objectScore = 0;
        framesToDelay = 0;
        removed = false;
    }

    /**
     * see if the pinball has any frames to delay
     * @return the number of frames to delay the pinball
     */
    public int getFramesToDelay()
    {
        return framesToDelay;
    }

    /**
     * set the number of frames to delay the pinball (for how many frames will an event not occur)
     * @param frames the number of frames to delay the object by
     */
    public void setFramesToDelay(int frames)
    {
        framesToDelay = frames;
    }

    /**
     * get the score of the object in motion
     * @return the objects current score
     */
    public int getScore()
    {
        return objectScore;
    }

    /**
     * Updates the score if the pinball has collided with a particular object
      * @param addingScore the amount being added to the sum of the objects score
     */
    public void updateScore(int addingScore)
    {
        objectScore += addingScore;
    }

    /**
     * Sets the score of the object to zero
     */
    public void emptyScore()
    {
        objectScore = 0;
    }

    /**
     * Converts the current score to a string so that it can be displayed on the ball
     * @param object the object the score belongs to
     * @return a String equivalent of the score
     */
    public String getScoreString(PinballObject object)
    {
       int intScore = ((Pinball)object).getScore();
       return Integer.toString(intScore);
    }

    /**
     * See if the ball has been marked as "Removed" from the machine
     * @return the removed status of the object
     */
    public boolean getBallStatus()
    {
        return removed;
    }

    /**
     * Mark the ball as removed is it has gone in a hole and is smaller than or equal to the size of the hole
     */
    public void removeBall()
    {
        removed = true;
    }    
}
