import greenfoot.*;
import java.awt.Color;
import java.util.*;

/**
 * Write a description of class Question here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question extends Actor
{
    private String sQuestion;
    private List<String> aAnswers;
    private int nCorrect;
    private String sRight;
    private String sWrong;
    
    public Question(String sQuestion, List<String> aAnswers, int nCorrect, String sRight, String sWrong) 
    {
        this.sQuestion = sQuestion;
        this.aAnswers = aAnswers;
        this.nCorrect = nCorrect;
        this.sRight = sRight;
        this.sWrong = sWrong;
    }    
    
    private GreenfootImage img = null;
    
    public void render(){
        if (img == null) {
            World w = getWorld();
            img = new GreenfootImage(w.getWidth(), w.getHeight());
            img.setColor(Color.WHITE);
            img.fill();
            img.setColor(Color.BLACK);
            img.drawString(sQuestion, 20, 40);
            int y = 60;
            for (String sAnswer : aAnswers) {
                img.drawString(sAnswer, 30, y);
                y += 20;
            }
            setImage(img);
            
        }


    }
}
