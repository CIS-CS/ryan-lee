/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;

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
    }
    
    public void setRefNumber(String ref)
    { 
        this.ref = refNumber;
    }
    
    public void setBorrowNumber(String borrow)
    {
        this.borrow = borrowed;
    }
    
}
