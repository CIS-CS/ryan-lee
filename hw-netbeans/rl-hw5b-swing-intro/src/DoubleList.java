// DoubleList.java



/**
 * Implements a doubly-linked list.
 * Head points to first node, tail points to last node, current points
 * to MRA node (most recently accessed).
 * @author MHayes
 * @version 2009-01-10
 */
public class DoubleList {

    // Instance variables
    private DoubleNode head;
    private DoubleNode tail;
    private DoubleNode current;  // points to last accessed node
    private int size;

    public DoubleList()
    {
        head = null;
        tail = null;
        current = null;  // points to last accessed node
        size = 0;
    }
    
    /**
     *  Inserts a tape at the head of the list.
     *  @param tape The tape to insert.
     */
    public void insertHead(VideoTape tape)
    {
        DoubleNode node = new DoubleNode(tape);
        
        // Check if the list is empty
        if (head == null)
        {
            // Add the node to the empty list.
            head = node;
            tail = node;
            current = head;
        }
        else
        {
            // The list is not empty. Add at head.
            head.setPrev(node);
            node.setNext(head);
            head = node;
            current = head;
        }
        size++;
    }

    /**
     *  Inserts a tape at the tail of the list.
     *  @param tape The tape to insert.
     */
    public void insertTail(VideoTape tape)
    {
        DoubleNode node = new DoubleNode(tape);
        
        // Check if the list is empty
        if (head == null)
        {
            // Add the node to the empty list.
            head = node;
            tail = node;
            current = node;
        }
        else
        {
            // The list is not empty. Add at tail.
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            current = tail;
        }
        size++;
    }
     
     /**
     *  Inserts a tape before a selected tape item of the list.
     *  @param tape The tape to insert.
     */
    
    public void insertBefore(VideoTape tape) 
    {
        //to be implemented later
    }
    
    public void insertAfter(VideoTape tape)
    {
        DoubleNode node = new DoubleNode(tape);
        
        node.setPrev(current);
        node.setNext(current.getNext());
        current.setNext(node);
        current.getNext().setPrev(node);
        current = node; 
        
        size++;
    }
    
    public VideoTape get()
    {
        return (size == 0) ? null : current.getTape();
        /*
        if (size == 0)
        {
            return null;
        } 
        else
        {
            return current.getTape();
        }
        */
    }
    
    //alternative way:
    //return boolean exp ? val1:val2;
    //return size==0?
    
    
    
        
    public VideoTape getNextTape()
    {
        if (current.getNext() == null) 
        {
            return null;
        }       
        else 
        {
            current = current.getNext();
            return current.getTape();
        }
    }
    
    public VideoTape getPreviousTape()
    {
        if (current.getPrev() == null)
        {
            return null;
        }
        else 
        {
            current = current.getPrev();
            return current.getTape();
        }
    }
    
    public VideoTape getHead() // current pointer not moved
    {	
        current = head;
	return current.getTape();
        
    }
    
    public VideoTape getTail() // current pointer not moved
    {
        current = tail;
        return current.getTape();
    }
    
    public VideoTape getCurrent()
    {
        return current.getTape();
    }

    
    //Possible delete scenarios
    
   /* delete
            if size == 0
              (do nothing)
            else if size == 1
            set HTC = null
            else 
            remove current node
            ( else if first node ---
                    else if last node ---
            else---) */
    
    /**
     * This method will delete the current node.
     */
    public void delete() 
    {
        if (size == 1)
        {
            // list has one node, delete it
            head = null;
            tail = null;
            current = null;
            size = 0;
        }
        else if (current == head)
        {
            // current is pointing at first node of the list
            head = head.getNext();
            current = current.getNext();
            current.getPrev().setNext(null);
            current.setPrev(null);
            size--;
        }
        else if (current == tail)
        {
            // current is pointing at last node of the list
            tail = tail.getPrev();
            current = current.getPrev();
            current.getNext().setPrev(null);
            current.setNext(null);
            size--;
        }
        else
        {   
            // current is pointing to an interior node
            current.getPrev().setNext(current.getNext());
            current.getNext().setPrev(current.getPrev());
            DoubleNode temp = current.getNext();
            current.setPrev(null);
            current.setNext(null);
            current = temp;
            size--;
        }
    }
    
/* 
    public void deleteAtHead()
    {
        head = head.getNext();
	current = head;
	head.getPrev().setNext(null);
	head.setPrev(null);
        
        size--;
    }
            
    public void deleteTail(DoubleNode node)
    {
         // Check if the list is empty
        if (head != null)
        {
            // The list is not empty. Add at tail.
            tail.setNext(node);
            node.setPrev(tail);
            tail = node;
            current = tail;
            size--;
        }  
    }
    
    public void deleteMiddle() 
    {
	
	DoubleNode temp = current.getPrev();
	
	current.getNext().setPrev(current.getPrev());
	current.getPrev().setNext(current.getNext());
	current.setNext(null);
	current.setPrev(null);
	current = temp;
        
        size--;
    }
   
    public void deleteLast() 
    {
	head = null;
	tail = null;
        size--;
    }
*/
    
    public void applyEdit(String title, int length, boolean lent)
    {
        // get the tape in the current node
        VideoTape tape = current.getTape();
        
        // edit the tape details
        tape.setTitle(title);
        tape.setLength(length);
        tape.setLent(lent);       
    }
    
    public int size()
    {
      return size;
    }

    /**
     *  Extracts the names from the nodes and forms a string.
     *  @return String The names in the list, separated by "\n"
     */
    public String toString()
    {
        DoubleNode node = head;
        StringBuffer sb = new StringBuffer();

        // Traverse the list to display each node.
        sb.append("head\n----\n");
        while (node != null)
        {
            sb.append(node.getTape());
            if (node == current)
            {
                sb.append("  <<<");     // Indicate the current node
            }
            sb.append("\n");
            node = node.getNext();
        }
        return sb.toString();
    }
}
