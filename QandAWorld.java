import greenfoot.*;
import java.util.*;

/**
 * Write a description of class QandAWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QandAWorld extends World
{

    /**
     * Constructor for objects of class QandAWorld.
     * 
     */
    public QandAWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Question question = new Question("Rich was Here", Arrays.asList( "a", "b", "c" ), 0, "correct", "incorrect");
        addObject(question, 300, 200);
        question.render();
    }
}
