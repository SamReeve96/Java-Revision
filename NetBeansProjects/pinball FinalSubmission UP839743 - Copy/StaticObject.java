import java.awt.*;
/**
 * A pinball object, Static, forces the velocites to be 0 as the name suggests.
 *
 * @author (UP839743)
 * @version Final For Submission
 */
public class StaticObject extends PinballObject
{
    /**
     * Constructor for objects of class StaticObject
     *
     * @param xPos  the horizontal coordinate of the object
     * @param yPos  the vertical coordinate of the object
     * @param objectRadius  the radius (in pixels) of the object
     * @param objectColor  the color of the object
     * @param theMachine  the machine this object is in
     */
    public StaticObject(int xPos, int yPos, Color objectColor, double objectRadius, Machine theMachine)
    {
        //Note: all static objects do not move, therefore velocities are set to 0 by default
        super(xPos, yPos, 0, 0, objectColor, objectRadius, theMachine);
    }
}
