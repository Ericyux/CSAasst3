import java.util.*;
import java.util.Random;
/**
 * Write a description of class Question here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question  
{
    private static String[][] calcQA = {
        {"d/dx (5x)", "5"},
        {"f(x) = 3x^2 + 8, what is f'(x)", "6x"},
        {"lim x-->infinity (sin x / x) = ? ", "1"},
        {"y^2 - 2x = 0, dy/dx = ?", "1/y"},
        {"Area of (x^2 - 1) between -1 and 1:", "4/3"}
    };
    private static String[][] geoQA = {
        {"A definite location in space is a...", "point"},
        {"Assuming A, B, C are colinear, if AB = 6 and BC = 5, then AC = ?", "11"},
        {"∠ABC and ∠CBD are complimentary. If m∠ABC=50°, m∠CBD = ? in deg", "40"},
        {"In quad ABCD, if AB & CD and BC & AD are parallel, is ABCD a parallelogram? (y or n)", "y"},
        {"A 1-dimensional surface moving in infinitely in two directions is a...", "line"}
    };
    private static String[][] algQA = {
        {"If x=5 and f(x) = 6x^3 - 2x, then -f(2) = ?", "-44"},
        {"x^2 - 2x + 1 = 0, solve x", "1"},
        {"x^2 - 6x + 5 = 0, what is the sum of the solutions?", "6"},
        {"What is the slope of the line y=5x-4", "5"},
        {"What is the y-intercept of the line y=6x-9", "-9"}
    };
    private static String[][] trigQA = {
        {"sin(270°)", "-1"},
        {"arctan(-1) in deg", "-45"},
        {"arccos(-0.5) in deg", "120"},
        {"sec(0°)", "1"},
        {"What is the period of sin(2x)", "pi"}
    };
    public static String[] getRandomQuestion(String subject)
    {
        Random rand = new Random();
        int qIndex = rand.nextInt(calcQA.length);
        String[] questionChosen = new String[2];
        switch(subject) {
            case "calc":
                questionChosen = calcQA[qIndex];
                break;
            case "alg":
                questionChosen = algQA[qIndex];
                break;
            case "trig":
                questionChosen = trigQA[qIndex];
                break;
            case "geo":
                questionChosen = geoQA[qIndex];
                break;
        }
        return questionChosen;
    }
}
