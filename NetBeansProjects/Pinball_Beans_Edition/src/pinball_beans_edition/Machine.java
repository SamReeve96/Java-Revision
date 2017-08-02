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
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A pinball machine, has the main game loops, machine drawing, clearing the machine canvas, and collision detection and events trigger etc.
 *
 * @author (UP839743)
 * @version Final For Submission
 */
public class Machine {
    private Canvas machine;
    private int topEdge = 0;
    private int leftEdge = 0;
    private int bottomEdge;
    private int rightEdge;
    private int lengthToGap;        // the distance between the edge of the machine and the start of the gap
    private int gapWidth = 50;
    private ArrayList<Pinball> PinObjects;
    private ArrayList<StaticObject> StatObjects;
    private boolean wallCollisonState;
    private boolean endGame;
    private int totalScore;
    private final int leftWallPosition;
    private final int rightWallPosition;
    private final int topWallPosition;
    private final int bottomWallYPosition;
    private final int bottomWallLeftXPosition;
    private final int bottomWallRightXPosition;   
    
    public Machine(){
        machine = new Canvas("Pinball Demo", 600, 500);
        rightEdge = 600;
        bottomEdge = 500;
        lengthToGap = (rightEdge / 2) - gapWidth;
        leftWallPosition = getLeftWall();
        rightWallPosition = getRightWall();
        topWallPosition = getTopWall();
        bottomWallYPosition = getBottomWall();
        bottomWallLeftXPosition = getLeftBottomWall();
        bottomWallRightXPosition = getRightBottomWall();
        PinObjects = new ArrayList<Pinball>();
        StatObjects = new ArrayList<StaticObject>();
        drawMachine();
    }
    
    /**
     * Draw a rectangle over the board (not the boarders) to clear the screen and prevent ghosting
     */
    public void erase()
    {
        machine.setForegroundColor(Color.white);
        machine.fillRectangle(10, 10, 580, 480);
        machine.fillRectangle(getLeftBottomWall(), getBottomWall(), 100, 480);
    }
    
    /**
     * Erase a PinballObject from the view of the pinball machine
     *
     * @param pinballObj The object to be erased
     */
    public void erasePinball(PinballObject pinballObj)
    {
        machine.eraseCircle(pinballObj.getXPosition() - pinballObj.getIntRadius(), pinballObj.getYPosition()- pinballObj.getIntRadius(), pinballObj.getDiameter());
    }
    
    /**
    * Draw a PinballObject at its current position onto the view of the pinball machine
    * 
    * @param pinballObj The object to be drawn
    */
    public void drawPinballObject(PinballObject pinballObj) {
        machine.setForegroundColor(pinballObj.getColor());
        machine.fillCircle(pinballObj.getXPosition() - pinballObj.getIntRadius(), pinballObj.getYPosition() - pinballObj.getIntRadius(), pinballObj.getDiameter());
    }
    
    /**
    * Draw a PinballObject at its current position onto the view of the pinball machine
    * 
    * @param pinballObj The object to be drawn
    */
    public void drawPinballObject(PinballObject pinballObj) {
        machine.setForegroundColor(pinballObj.getColor());
        machine.fillCircle(pinballObj.getXPosition() - pinballObj.getIntRadius(), pinballObj.getYPosition() - pinballObj.getIntRadius(), pinballObj.getDiameter());
    }

    /**
     * Draw a PinballObject at its current position onto the view of the pinball machine
     *
     * @param pinballObj The object the score belongs to and will be drawn on
     */
    public void drawScore(PinballObject pinballObj)
    {
        machine.setForegroundColor(Color.BLACK);
        if (Pinball.class.isAssignableFrom(pinballObj.getClass()))
        {
            String scoreText = ((Pinball)pinballObj).getScoreString(pinballObj);
            machine.drawString(scoreText, pinballObj.getXPosition(), pinballObj.getYPosition());
        }
    }
    
    /**
    * Draw the edges of the pinball machine
    */
    public void drawMachine()
    {
        machine.setForegroundColor(Color.DARK_GRAY);
        
        machine.fillRectangle(0, 0, rightEdge, 10);  // top edge
        machine.fillRectangle(0, 0, 10, bottomEdge); // left edge
        machine.fillRectangle(rightEdge - 10, 0, 10, bottomEdge); // right edge
        
        machine.fillRectangle(0, bottomEdge - 10, lengthToGap, 10); // left-hand side of bottom edge
        machine.fillRectangle(rightEdge - lengthToGap, bottomEdge - 10, rightEdge, 10);     // right-hand side of bottom edge
    }
    
    /**
     * Return the edge of the left-hand wall
     */
    public int getLeftWall()
    {
        return leftEdge + 10;
    }
    
    /**
     * Return the edge of the left-hand wall
     */
    public int getRightWall()
    {
        return rightEdge - 10;
    }
    
    /**
     * Return the edge of the Top wall
     */
    public int getTopWall()
    {
        return topEdge + 10;
    }
    
    /**
     * Return the edge of the bottom side wall
     */
    public int getBottomWall()
    {
        return bottomEdge - 10;
    }
    
    /**
     * Return the x Co-ordinates for left side of the bottom wall
     */
    public int getLeftBottomWall()
    {
        return leftEdge + 250;
    }
    
    /**
     * Return the x Co-ordinates for right side of the bottom wall
     */
    public int getRightBottomWall()
    {
        return rightEdge - 250;
    }
    
    /**
     * Introduces a small delay in ball movement, for smooth running
     */
    public void pauseMachine()
    {
        machine.wait(50);
    }
    
    /**
     * Resets the machine back to initial view, with no pinballs
     */
    public void resetMachine() {
        machine.erase();
        drawMachine();
    }

    /**
     * adds a new pinball to the Pinball array
     *
     * @param newPinball the new pinball to be added to the array
     */
    public void addPinball(Pinball newPinball)
    {
        PinObjects.add(newPinball);
    }

    /**
     * adds a new static object (hole or bumper) to the StaticObject array
     *
     * @param newStatic the new static object to be added to the array
     */
    public void addStatic(StaticObject newStatic)
    {
        StatObjects.add(newStatic);
    }

    /**
     * If an event has just triggered, prevent any other events from happening for the next 30 frames (31 as one is instantly taken off)
     * @param pinball the pinball that this will be applied to
     */
    public void eventFreeze(PinballObject pinball)
    {
        ((Pinball)pinball).setFramesToDelay(31);
    }

    /**
     * for each frame that passes this count down any pinballs that have frames more than 0
     * @param pinball the pinball that has recently collided with another pinball
     */
    public void countFrame(PinballObject pinball)
    {
        int currentFrames = ((Pinball)pinball).getFramesToDelay();

        if (currentFrames != 0) {
            currentFrames -= 1;
        }
        ((Pinball)pinball).setFramesToDelay(currentFrames);
    }

    /**
     * Detects whether the currently moving pinball has collided with any other pinballs in the pinball array
     *
     * @param pinball the object currently being moved.
     */
    public void ballCollision(PinballObject pinball)
    {
        //Get the first pinball object data
        int x1 = pinball.getXPosition();
        int y1 = pinball.getYPosition();
        int r1 = pinball.getIntRadius();
        boolean removed1 = ((Pinball)pinball).getBallStatus();
        int framesToDelay1 =  ((Pinball)pinball).getFramesToDelay();

        //set up an iterative loop through the pinball array
        Iterator<Pinball> iterator = PinObjects.iterator();
        while (iterator.hasNext())
        {
            //Get the second Pinball object data
            PinballObject pinball2 = iterator.next();
            int x2 = pinball2.getXPosition();
            int y2 = pinball2.getYPosition();
            int r2 = pinball2.getIntRadius();
            boolean removed2 = ((Pinball)pinball2).getBallStatus();
            int framesToDelay2 =  ((Pinball)pinball2).getFramesToDelay();
            
            //Check that the pinball's being compared are not the same or been removed
            if (!pinball.equals(pinball2) && (!removed1) && (!removed2))
            {
                //Calculate the distance between the two circles centers to see if a collision has occurred
                //Note: the radii are squared to avoid rooting the distance squared as this would add extra complexity
                double distanceSquared = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
                double radiiSumSquared = Math.pow(r1 + r2,2);
                if (distanceSquared <= radiiSumSquared) {

                    //See if the pinball has recently collided with another ball (prevents glitching)
                    if (framesToDelay1 == 0) {

                        //reverse direction of ball one
                        pinball.xRebound();
                        pinball.yRebound();

                        //call either of the the Ball events
                        if (pinball instanceof PinballTypeThree) {
                            //cast the pinball to type three to access its methods
                            ((PinballTypeThree) pinball).BallEvent();
                            eventFreeze(pinball);
                        }
                        else if (pinball instanceof PinballTypeZero) {
                            //cast the pinball to type zero to access its methods
                            ((PinballTypeZero) pinball).BallEvent();
                            eventFreeze(pinball);
                        }
                        //update pinball's score
                        ((Pinball)pinball).updateScore(5);
                    }
                    //See if the pinball has recently collided with another ball (prevents glitching)
                    if (framesToDelay2 == 0) {

                        //reverse direction of ball one
                        pinball2.xRebound();
                        pinball2.yRebound();

                        //call either of the the Ball events
                        if (pinball2 instanceof PinballTypeThree) {
                            //cast the pinball to type three to access its methods
                            ((PinballTypeThree) pinball2).BallEvent();
                            eventFreeze(pinball2);
                        }
                        else if (pinball2 instanceof PinballTypeZero) {
                            //cast the pinball to type zero to access its methods
                            ((PinballTypeZero) pinball2).BallEvent();
                            eventFreeze(pinball2);
                        }
                        //update pinball 2 's score
                        ((Pinball)pinball2).updateScore(5);
                    }

                }
            }
            //if the pinball has frames where an event wont occur count down
            countFrame(pinball);
            countFrame(pinball2);
        }
    }

    /**
     * Detects whether the current static object being drawn has been collided with by a pinball in the pinball array
     *
     * @param staticObject the static object currently being drawn
     */

    public void staticObjectCollision(StaticObject staticObject)
    {
        //set up an iterative loop through the pinball array
        Iterator<Pinball> iterator = PinObjects.iterator();

        //Get the static objects data
        int x1 = staticObject.getXPosition();
        int y1 = staticObject.getYPosition();
        int r1 = staticObject.getIntRadius();

        while (iterator.hasNext())
        {
            //Get the Pinball objects data
            PinballObject pinball = iterator.next();
            int x2 = pinball.getXPosition();
            int y2 = pinball.getYPosition();
            int r2 = pinball.getIntRadius();

                //Calculate the distance between the two circles centers to see if a collision has occurred
                //Note: the radii are squared to avoid rooting the distance squared as this would add extra complexity
                double distanceSquared = Math.pow((x2-x1),2) + Math.pow((y2-y1),2);
                double radiiSumSquared = Math.pow(r1 + r2,2);
                if (distanceSquared <= radiiSumSquared)
                {
                    //See if the static object is a bumper
                    if (staticObject instanceof Bumper)
                    {
                        //reverse direction of the ball
                        pinball.xRebound();
                        pinball.yRebound();
    
                        //update the pinball's score, cast it as a pinball to access the method
                        ((Pinball)pinball).updateScore(2);
                    }
                    //See if the static object is a hole
                    else if (staticObject instanceof Hole)
                    {
                        //Do an if statement to see if the hole is = or bigger than the hole, if so then call a hole event
                        //see if the pinball is smaller or equal to the size of the hole
                        if (r2 <= r1) {
                            //remove ball from array
                            //BUG: while this way of removing a pinball of the machine would be far easier an not need the removed parameter for each piball
                            //iterator.remove() produced a current modification error I couldnt solve.
                            //iterator.remove();

                            //alternative solution to error above
                            ((Pinball)pinball).removeBall();
                            //Undraw the pinball
                            erasePinball(pinball);

                        } else {
                            //Cast the pinball to access the empty method, empty its score
                            ((Pinball)pinball).emptyScore();
                        }
                    }

        }
        }
    }

    /**
     * Check to see if the pinball being moved has collided with a wall
     *
     * @param object the current pinball being moved
     */
    public void wallCollision(PinballObject object)
    {
        //initialise variable
        wallCollisonState = false;
        
        //Get necessary data from the pinball
        int currentXLocation = object.getXPosition();
        int currentYLocation = object.getYPosition();
        int radius = object.getIntRadius();
        int diameter = object.getDiameter();

        //check to see if ball has collided with the left wall
        if(currentXLocation <= (leftWallPosition + radius)) 
        {
            currentXLocation = leftWallPosition + 2*radius;
            object.xRebound();
            wallCollisonState = true;
        }

        //check to see if ball has collided with the right wall
        if(currentXLocation >= (rightWallPosition - radius)) 
        {
            currentXLocation = rightWallPosition - 2*radius;
            object.xRebound();
            wallCollisonState = true;
        }

        //check to see if ball has collided with the Top wall
        if(currentYLocation <= (topWallPosition + radius)) 
        {
            currentYLocation = topWallPosition + 2*radius;
            object.yRebound();
            wallCollisonState = true;
        }

        //check to see if ball has gone through the bottom gap or hit the bottom wall
        if ((currentXLocation >= (bottomWallLeftXPosition + radius) && (currentXLocation <= (bottomWallRightXPosition - radius)) && (currentYLocation >= (bottomWallYPosition - radius)) && (diameter <= (2 * gapWidth))))
        {
            end();
        }
        else if(currentYLocation >= (bottomWallYPosition - radius))
        {
            currentYLocation = bottomWallYPosition - 2*radius;
            object.yRebound();
            wallCollisonState = true;
        }
        
        //if a pinball has collided find what type of pinball and executes its wall event
        if (wallCollisonState)
        {
            if (object instanceof PinballTypeZero)
            {
                //Add score to pinball object
                ((Pinball)object).updateScore(1);
                ((PinballTypeZero)object).WallEvent();
            }
            
            if (object instanceof PinballTypeThree)
            {
               //Add score to pinball object
               ((Pinball)object).updateScore(1);
               ((PinballTypeThree)object).WallEvent();
            }
            
            //Reset the wall collision state to false
            wallCollisonState = false;
        }
    }
    
    public int totalScore()
    {
        //set up an iterator to go though the pinball array
        Iterator<Pinball> iterator = PinObjects.iterator();
        //Initialise the score
        totalScore = 0;
        while (iterator.hasNext()) {
                PinballObject Pinball = iterator.next();
                //see if the pinball has been removed
                boolean removed = ((Pinball)Pinball).getBallStatus();
                if (!removed)
                {
                    //add the value of the pinball's score to the total score
                    totalScore += ((Pinball)Pinball).getScore();
                }
            }
        return totalScore;
    }
    
    /**
     * Start will begin iterating through the object arrays, drawing and reacting to events until its "game over"
     */
    public void start()
    {
        resetMachine();
        while (!endGame)
        {
            pauseMachine(); // small delay
            erase(); //erase all items

            //Create iterators for both arraylists
            Iterator<StaticObject> iterator = StatObjects.iterator();
            Iterator<Pinball> iteratorTwo = PinObjects.iterator();

            //Go through static array and draw the static objects and react to any collisions
            while (iterator.hasNext()) {
                StaticObject statObject = iterator.next();
                staticObjectCollision(statObject);
                drawPinballObject(statObject);
            }
            //Go through pinball array and draw the pinball objects and react to any collisions, also update score
            while (iteratorTwo.hasNext())
            {
                PinballObject Pinball = iteratorTwo.next();
                //see if the pinball has been removed
                boolean removed = ((Pinball) Pinball).getBallStatus();
                if (!removed) {
                    Pinball.move();
                    drawPinballObject(Pinball);
                    drawScore(Pinball);
                    drawMachine();
                }
            }
        }
        //End Game as the ball passed through the bottom hole, display game over message and total score on screen
        machine.setFont(new Font("Arial", Font.BOLD, 20));
        machine.drawString("GAME OVER, Total Score: " + totalScore(), 250, 250);
    }

    /**
     * Set endgame variable to true to end the loop and get the total score for objects in the machine
     */
    public void end()
    {
        endGame = true;
    }
    
}
