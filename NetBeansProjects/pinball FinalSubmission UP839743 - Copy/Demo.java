import java.awt.*;
import java.util.ArrayList;
/**
 * Class to demonstrate functionality of the Pinball machine
 *
 * The Program performs best when velocities of the balls do not exceed +/- 5
 * and when the radius of the balls is between (20-40)
 */
public class Demo
{
    private Machine machine;
    /**
     * Constructor for objects of class Demo
     */
    public Demo()
    {
        machine = new Machine();
    }



    /**
     * holeDemo - Shows functionality of the holes
     */
    public void holeDemo()
    {
        machine.addStatic( new Hole(400, 400, 40, machine));
        machine.addStatic( new Hole(0, 0, 50, machine));
        machine.addPinball( new PinballTypeThree(100, 100, 1, 1,Color.RED , 15, machine));
        machine.addPinball( new PinballTypeThree(200, 200, 1, 1, Color.BLUE, 15, machine));
        machine.addPinball( new PinballTypeThree(300, 300, -1, -1, Color.GREEN, 15, machine));
        machine.addPinball( new PinballTypeZero(100, 400, 1, 0, Color.YELLOW, 20, machine));
        machine.addPinball( new PinballTypeZero(200, 400, 1, 0, Color.CYAN, 15, machine));
        machine.addPinball( new PinballTypeZero(300, 400, 1, 0, Color.MAGENTA, 20, machine));
        machine.start();
    }

    /**
     * bumperDemo - Shows functionality of the bumpers
     */
    public void bumperDemo()
    {
        machine.addStatic( new Bumper(500, 200, 25, machine));
        machine.addStatic( new Bumper(100, 200, 25, machine));
        machine.addPinball( new PinballTypeThree(200, 200, 1, 0,Color.RED , 15, machine));
        machine.addPinball( new PinballTypeThree(400, 200, 1, 0, Color.GREEN, 15, machine));
        machine.start();
    }

    /**
     * endDemo - Shows that the game ends if the ball passes through the hole in the machine walls
     */
    public void endDemo()
    {
        machine.addPinball( new PinballTypeThree(300, 200, 0, 3,Color.RED , 15, machine));
        machine.start();
    }

    /**
     * ballCollisionDemo - Shows that balls collide and their respective events trigger
     */
    public void ballCollisionDemo()
    {
        machine.addPinball( new PinballTypeThree(100, 100, 1, 0,Color.RED , 15, machine));
        machine.addPinball( new PinballTypeThree(100, 200, 1, 0, Color.BLUE, 15, machine));
        machine.addPinball( new PinballTypeThree(100, 300, 1, 0, Color.GREEN, 15, machine));
        machine.addPinball( new PinballTypeZero(500, 100, -1, 0, Color.YELLOW, 15, machine));
        machine.addPinball( new PinballTypeZero(500, 200, -1, 0, Color.CYAN, 15, machine));
        machine.addPinball( new PinballTypeZero(500, 300, -1, 0, Color.MAGENTA, 15, machine));
        machine.start();
    }

    /**
     * wallCollisionDemo - Shows that balls collide with walls and their respective events trigger
     */
    public void wallCollisionDemo()
    {
        machine.addPinball( new PinballTypeThree(100, 100, -1, 1,Color.RED , 15, machine));
        machine.addPinball( new PinballTypeThree(100, 200, -1, 1, Color.BLUE, 15, machine));
        machine.addPinball( new PinballTypeThree(100, 300, -1, 1, Color.GREEN, 15, machine));
        machine.addPinball( new PinballTypeZero(500, 100, 1, -1, Color.YELLOW, 15, machine));
        machine.addPinball( new PinballTypeZero(500, 200, 1, -1, Color.CYAN, 15, machine));
        machine.addPinball( new PinballTypeZero(500, 300, 1, -1, Color.MAGENTA, 15, machine));
        machine.start();
    }

    /**
     * A demo similar to the one shown on the instruction sheet
     */
    public void Demo()
    {
        machine.addStatic( new Hole(450, 125, 25, machine));
        machine.addStatic( new Hole(200, 125, 10, machine));
        machine.addStatic( new Bumper(130, 470, 25, machine));
        machine.addStatic( new Bumper(30, 230, 25, machine));
        machine.addPinball( new PinballTypeThree(100, 100, 2, 3, Color.RED, 20, machine));
        machine.addPinball( new PinballTypeThree(100, 200, 1, 2, Color.BLUE, 20, machine));
        machine.addPinball( new PinballTypeThree(300, 100, 4, 2, Color.GREEN, 10, machine));
        machine.addPinball( new PinballTypeZero(300, 200, 1, 5, Color.YELLOW, 30, machine));
        machine.addPinball( new PinballTypeZero(500, 100, 3, 2, Color.CYAN, 20, machine));
        machine.addPinball( new PinballTypeZero(500, 200, 5, 5, Color.MAGENTA, 15, machine));
        machine.start();
    }
}
