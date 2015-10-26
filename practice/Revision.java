import java.util.Random;
import java.util.Scanner; 

public class Revision extends Object
{
	private String[] daysWeek = new String[7]; // declaring variable and creating array object
	private String[] subjectsTaught = new String[7];

	//constructor for instance variables
	public Revision()
	{
		daysWeek[0] = "Monday"; // initializing
		daysWeek[1] = "Tuesday";
		daysWeek[2] = "Wednesday";
		daysWeek[3] = "Thursday";
		daysWeek[4] = "Friday";
		daysWeek[5] = "Saturday";
		daysWeek[6] = "Sunday";
				
		subjectsTaught[0] = "Mathematics";
		subjectsTaught[1] = "Chemistry";
		subjectsTaught[2] = "Physics";
		subjectsTaught[3] = "English";
		subjectsTaught[4] = "Chinese";
		subjectsTaught[5] = "Biology";
		subjectsTaught[6] = "Economics";
    }

	//method which generates random number between 0 and 6. 
	public int getRandomDay() //denotes the random day
	{
		Random randomDay = new Random();
		return randomDay.nextInt(7);
	}
	public int getRandomSubject() //denotes the random day
	{
		Random randomSubject = new Random();
		return randomSubject.nextInt(7);
	}
	
	//toString method
	public String toString()
	{
		return daysWeek[getRandomDay()] + ":" + subjectsTaught[getRandomSubject()] + " , " + daysWeek[getRandomDay()]  + ":" + subjectsTaught[getRandomSubject()] + " , " + 		daysWeek[getRandomDay()] + ":" + subjectsTaught[getRandomSubject()] + " , " + daysWeek[getRandomDay()]  + ":" + subjectsTaught[getRandomSubject()] + " , " +
		daysWeek[getRandomDay()] + ":" + subjectsTaught[getRandomSubject()];
	}
}


