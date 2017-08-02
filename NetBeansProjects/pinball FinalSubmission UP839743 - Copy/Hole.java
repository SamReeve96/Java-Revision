import java.awt.*;
/**
 * A static object, is always black in color, thus set here.
 *
 * @author (UP839743)
 * @version Final For Submission
 */
public class Hole extends StaticObject
{
    /**
     * Constructor for objects of class Hole
     *
     * @param xPos the x position of the object
     * @param yPos the y position of the object
     * @param objectRadius the radius of the object
     * @param theMachine the machine the object operates on
     */
    public Hole(int xPos, int yPos, double objectRadius, Machine theMachine)
    {
        //Bumpers are always black, thus this has been set here
        super(xPos, yPos, Color.BLACK, objectRadius, theMachine);
    }
}
