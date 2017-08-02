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

public class Bumper {
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
