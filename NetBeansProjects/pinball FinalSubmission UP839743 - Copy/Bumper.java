import java.awt.*;
/**
 * A static object, is always gray in color, thus set here.
 *
 * @author (UP839743)
 * @version Final For Submission
 */
public class Bumper extends StaticObject
{
    /**
     * Constructor for objects of class Bumper
     *
     * @param xPos the x position of the object
     * @param yPos the y position of the object
     * @param objectRadius the radius of the object
     * @param theMachine the machine the object operates on
     */
    public Bumper(int xPos, int yPos, double objectRadius, Machine theMachine) {

        //Bumpers are always gray, thus this has been set here
        super(xPos, yPos, Color.GRAY, objectRadius, theMachine);

    }
}
