/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author
 * @version 
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    //private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPage, String referenceNumber, int borrowNumber)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPage;
        refNumber = "";
        borrowed = borrowNumber;
    }

    // Add the methods here ...
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

    public void printAuthor()
    {
        System.out.println("The author is " + getAuthor() + ".");
    }
    
    public void printTitle()
    {
        System.out.println("The title is " + getTitle() + ".");
    }
    
    public void printDetails()
    {
        System.out.println("Title: " + getTitle());
        System.out.println("Author:" + getAuthor());
        System.out.println("The number of pages is: " + getPages());
        System.out.println("The number of times this book has been borrowed is: " + getBorrowed());
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
    
    public void setBorrowNumber(int borrowed)
    {
        this.borrowed = borrowed;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    //public int isCourseText()
    //{
        
    //}
}
