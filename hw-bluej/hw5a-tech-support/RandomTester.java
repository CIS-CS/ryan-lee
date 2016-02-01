import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 * 
 * @author Ryan Lee
 * @version 1.0
 */
public class RandomTester
{
    private Random randomGen;
    private ArrayList<String> responses;

    public RandomTester()
    {
        randomGen = new Random();
    } 
    //5.14a
    public void printOneRandom()
    {
        int index = randomGen.nextInt();
        System.out.println(index);
    }
    //5.14b
    public void printMultiRandom (int six)
    {
        for (int numberOfValues = 1; numberOfValues <= 6; numberOfValues++){
            int index = randomGen.nextInt();
            System.out.println(index);
        }
    }
    //5.15
    public int nextInt() 
    {
        int value = 0 + randomGen.nextInt(100);
        return value;
    }
    //5.16
    public int throwDice()
    {
        int value = 1 + randomGen.nextInt(7);
        return value;
    } 
    //5.17 and 5.18
    public void getResponse()
    {
        ArrayList<String> responses = new ArrayList<String>();
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        System.out.println(responses.get(randomGen.nextInt(responses.size())));
    }
    //5.19
    public int numberGenerator(int max)
    {
        int randomNum = randomGen.nextInt((max-1) + 1) + 1;
        return randomNum;
    }
    //5.20
    public int numberGeneratorTwo(int min, int max)
    {
        int randomNumTwo = randomGen.nextInt((max-min) + 1) + min;
        return randomNumTwo;
    }
}