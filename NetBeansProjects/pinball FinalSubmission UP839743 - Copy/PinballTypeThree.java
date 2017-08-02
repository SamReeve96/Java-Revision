import java.awt.*;
import java.util.Random;
import java.util.ArrayList;
/**
 * A pinball , Type 3, has the event to change direction on wall collision and change speed on ball collision
 *
 * @author (UP839743)
 * @version Final For Submission
 */
public class PinballTypeThree extends Pinball
{
    private int XVel;
    private int YVel;
    Random randSpeed = new Random(); //Initialise the random object

    /**
     * Constructor for objects of class Pinball Type Three
     *
     * @param xPos  the horizontal coordinate of the object
     * @param yPos  the vertical coordinate of the object
     * @param xVel  the horizontal speed of the object
     * @param yVel  the vertical speed of the object
     * @param objectRadius  the radius (in pixels) of the object
     * @param objectColor  the color of the object
     * @param theMachine  the machine this object is in
     */
    public PinballTypeThree(int xPos, int yPos, int xVel, int yVel, Color objectColor, double objectRadius, Machine theMachine)
    {
        super(xPos, yPos, xVel, yVel, objectColor, objectRadius, theMachine);
    }

    /**
     * When a type 3 ball hits a wall this method is called, modifying the Direction of the ball
     */
    public void WallEvent()
    {
        //Get current velocities
        XVel = getXVel();
        YVel = getYVel();

        //create a new random double variable
        double speedMultiX = randSpeed.nextDouble() * 2;
        double speedMultiY = randSpeed.nextDouble() * 2;

        //Adding one prevents an issue where the ball could stop when the velocity is set to zero due to small multiplier
        //Note: using a different multiplier changes the direction of the ball
        XVel *= (speedMultiX + 2);
        YVel *= (speedMultiY + 1);

        // prevents the ball from going at excessive speeds as this causes bugs
        while ((XVel > 5) || (XVel < -5))
        {
            XVel *= 0.5;
        }

        // prevents the ball from going at excessive speeds as this causes bugs
        while ((YVel > 5) || (YVel < -5))
        {
            YVel *= 0.5;
        }
        //Set new Velocities (maintaining xy ratio)
        setXVel(XVel);
        setYVel(YVel);
    }

    /**
     * When a type 3 ball hits another ball this method is called, modifying the Speed of the ball by being multiplied by a random double value between 1.5 and 3.5
     */
    public void BallEvent()
    {
        //Get current velocities
        XVel = getXVel();
        YVel = getYVel();

        //create a new random double variable
        double speedMulti = randSpeed.nextDouble() * 2;

        //Adding one and a half prevents an issue where the ball could stop (Velocities = 0) due to small multiplier
        //Note: using the same multiplier maintains the direction of the ball
        XVel *= (speedMulti + 1.5);
        YVel *= (speedMulti + 1.5);

        // prevents the ball from going at excessive X velocities as this causes bugs
        if ((XVel >= 5) || (XVel <= -5))
        {
            XVel = 1;
        }

        // prevents the ball from going at excessive Y velocities as this causes bugs
        if ((YVel >= 5) || (YVel <= -5))
        {
            YVel = 1;
        }

        //Set new Velocities
        setXVel(XVel);
        setYVel(YVel);
    }
}
