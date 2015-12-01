
/**
 * Write a description of class ex430 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ex430
{
    public void multiplesOfFive()
    {
        int number = 10;

        while (number < 95)
        {
            if (number % 5 == 0)
            {
                System.out.println(number);
            }
            number++;
        }
    } 
   
    public void sumOfTen()
    {
        int number = 1;
        int sum = 0;
        while(number <= 10)
        {
            sum = sum + number;
            number++;
        }
        System.out.println(sum);
    } 
    
    /*public void sum(int a, int b)
    {
        while
        
        
        
        
    } */
}