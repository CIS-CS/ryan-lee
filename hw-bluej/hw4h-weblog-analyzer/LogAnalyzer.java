/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer(String logFile)
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeHourlyData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
        }
    }

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
        }
    }
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }
    
    /**
     * Return the number of accesses recorded in the log
     * file.
     */
    public int numberOfAccesses()
    {
       int total = 0;
       for(int index = 0; index < hourCounts.length; index++) 
       {
         total = total + hourCounts[index];
       }
       return total;
    }
    
    public int busiestHour()
    {
        int hour = 0;
        int max = 0;
        
        for(int i = 0; i < hourCounts.length; i++) {
            if(hourCounts[i] > max) {
                max = hourCounts[i];
                hour = i;
            }
        }
        
        return hour;
    }
    
    public int quietestHour()
    {   
        int hour = 0;
        int min = 2147483647;
        
        for(int i = 0; i < hourCounts.length; i++) {
            if(hourCounts[i] < min) {
                min = hourCounts[i];
                hour = i;
            }
        }
        
        return hour;
    }
    
    public int busiestTwoHours() {
        int twoHours = 0;
        int max = 0;
        int hour = 0;
        
        for(int i = 0; i < hourCounts.length - 1; i++) {
            
            twoHours = hourCounts[i] + hourCounts[i + 1];
            
            if(twoHours > max) {
                max = twoHours;
                hour = i;
            }
        }
        
        return hour;
    }
}