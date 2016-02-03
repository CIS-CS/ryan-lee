
/**
 * DoubleNode.java
 * From: http://www.ib-computing.com/java/datastructures/lists.html
 * @author Mr J (andrew jones?)
 * @version 20050208
 */
class DoubleNode
{
    // data member
    private VideoTape tape;
    private String name;
    private int length; 
    private boolean lent; 
  
    // The fields that links nodes together.
    private DoubleNode next = null;
    private DoubleNode prev = null;
    private int videoNumber = 0;
    private int totalNumber = 0;
    
    public DoubleNode()
    {
        name = "no name";    
    }
    
    public DoubleNode(VideoTape tape)
    {
        // Second Constructor for a student record, assigns fields
        setTape(tape);
        name = tape.getTitle();
        length = tape.getLength();
        lent = tape.isLent();
    }
    
    // accessor methods
    public VideoTape getTape()
    { 
        return tape;
    }
    public DoubleNode getNext()
    {   
        return next;
    }
    public DoubleNode getPrev()
    { 
        return prev;
    }
    
    // modifier methods
    public void setTape( VideoTape tape)   
    {
        this.tape = tape;
    }
    public void setNext( DoubleNode name)
    {
        this.next = name;
    }
    public void setPrev( DoubleNode prev)
    {
        this.prev = prev;
    }
}





