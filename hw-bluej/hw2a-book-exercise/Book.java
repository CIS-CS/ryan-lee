/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (your name) 
 * @version (a version number or a date)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private String refNumber;
    private int pages;
    private int borrowed;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = bookCourseText;
    }

    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
    
    public String getRefNumber() 
    {
        return refNumber;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean isCourseText() 
    {
        return courseText;
    }

    public void printAuthor()
    {
        System.out.println(author);
    }
    
    public void printTitle()
    {
        System.out.println(title);
    }
        
    public boolean setRefNumber(String refNumber)
    {   
        boolean isValid = false;
        
        if (refNumber.length() >= 3)
        {
            this.refNumber = refNumber;
            isValid = true;
        }
        return isValid;
    }
    
    public boolean borrow() 
    {
        borrowed++;
        return true;
    }
    
    public boolean printDetails()
    {
        if (refNumber.length() > 0)
             System.out.println("Title: " + title + ", Author: " + author + ", Number of pages: " + pages 
             + ", Reference number: " + refNumber + ", Number of times borrowed: " + borrowed);
        
        return true;
    }
}