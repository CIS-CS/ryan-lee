import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> songs;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        songs = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        songs.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return songs.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public boolean listFile(int index)
    {
        if(validIndex(index) == true) {
            String filename = songs.get(index);
            System.out.println(filename);
            return true;
        }
        else 
        //{
            return false;
        //}
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public boolean removeFile(int index)
    {
       if(validIndex(index) == true) {
            songs.remove(index);
            return true;
       }
       else 
       {
            return false;
       }
    }
    
    public String checkIndex(int index)
    {
        if (getNumberOfFiles() == 0)
        {
             return "No songs.";
        }
        else if (index < 0 && index > (songs.size()-1))
        {
             return "Invalid index. Index can range from 0 to " + (songs.size()-1) + ".";
        }
        return null;
    }
    
    public boolean validIndex(int index)
    {
        boolean valid;
        
        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index > songs.size()-1) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
}