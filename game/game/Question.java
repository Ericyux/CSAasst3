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
        {"f(x) = 3x^2 + 8, what is f'(x)", "6x"}
    };
    private static String[][] geoQA = {
        {"A definite location in space is a...", "point"},
        {"If AB = 6 and BC = 5, then AC = ?", "11"}
    };
    private static String[][] algQA = {
        {"If x=5 and f(x) = 6x^3 - 2x, then -f(2) = ?", "-44"},
        {"x^2 - 2x + 1 = 0, solve x", "1"}
    };
    private static String[][] trigQA = {
        {"sin(270deg)", "-1"},
        {"arctan(-1) in deg", "-45"}
    };
    public static String[] getRandomQuestion(String subject)
    {
        Random rand = new Random();
        int qIndex = rand.nextInt(2);
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
