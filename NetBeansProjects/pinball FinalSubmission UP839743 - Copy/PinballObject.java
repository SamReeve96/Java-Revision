import java.awt.*;

/**
 * A pinball object, either a static or pinball. here basic attributes are accessed and modified as well as the Move method
 *
 * @author (UP839743)
 * @version Final For Submission
 */

public class PinballObject
{
    //Initialise variables for use
    private int currentXLocation;
    private int currentYLocation;
    private int speedXTravel;
    private int speedYTravel;
    private Color colour;
    private double radius;
    protected Machine machine;

    /**
     * Constructor for objects of class Pinball_Obj
     * 
     * @param xPos  the horizontal coordinate of the object
     * @param yPos  the vertical coordinate of the object
     * @param xVel  the horizontal speed of the object
     * @param yVel  the vertical speed of the object
     * @param objectRadius  the radius (in pixels) of the object
     * @param objectColor  the color of the object
     * @param theMachine  the machine this object is in
     */
    public PinballObject(int xPos, int yPos, int xVel, int yVel, Color objectColor, double objectRadius, Machine theMachine)
    {
        currentXLocation = xPos;
        currentYLocation = yPos;
        speedXTravel = xVel;
        speedYTravel = yVel;
        colour = objectColor;
        radius = objectRadius;
        machine = theMachine;
    }

    /**
     * Move this object according to its position and speed and redraw. detect if the ball has collided with another ball or the wall
     **/
    public void move()
    {
        //see if it has hit another pinball
        machine.ballCollision(this);
        
        // check if it has hit the wall
        machine.wallCollision(this);
        
        // compute new position
        currentYLocation += speedYTravel;
        currentXLocation += speedXTravel;
    }
    
    /**
     * return the horizontal position of this object
     */
    public int getXPosition()
    {
        return currentXLocation;
    }
    
    /**
     * return the vertical position of this object
     */
    public int getYPosition()
    {
        return currentYLocation;
    }
    
    /**
     * return the horizontal velocity of this object
     */
    public int getXVel()
    {
        return speedXTravel;
    }
    
    /**
     * return the vertical Velocity of this object
     */
    public int getYVel()
    {
        return speedYTravel;
    }
    
    /**
     * return the radius of this object
     */
    public double getRadius()
    {
        return radius;
    }
    
    /**
     * return the radius of this object in an integer when erasing the object
     */
    public int getIntRadius()
    {
        return (int)Math.round(radius);
    }
    
    /**
     * return the diameter of this object
     */
    public int getDiameter()
    {
        return (int)Math.round(2*radius);
    }
    
    /**
     * return the colour of this object
     */
    public Color getColor()
    {
        return colour;
    }

    /**
     * invert the X velocity of the object
     */
    public void xRebound()
    {
        speedXTravel *= -1;
    }

    /**
     * invert the Y velocity of the object
     */
    public void yRebound()
    {
        speedYTravel *= -1;
    }

    /**
     * set a X new velocity of the object
     *
     * @param newXVel
     */
    public void setXVel(int newXVel)
    {
        speedXTravel = newXVel;
    }

    /**
     * set a Y new velocity of the object
     * @param newYVel
     */
    public void setYVel(int newYVel)
    {
        speedYTravel = newYVel;
    }

    /**
     * Set the color of the object
     *
     * @param newColour the new color to be set
     */
    public void setColor(Color newColour)
    {
        colour = newColour;
    }

    /**
     * Set the radius of the object
     *
     * @param newRadius the new radius to be set
     */
    public void setRadius(double newRadius)
    {
        radius = newRadius;
    }
}
