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
    private DoubleNode head = null;
    private DoubleNode tail = null;
    private DoubleNode current = null;  // points to last inserted node

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
    }
    
    public VideoTape getNextTape()
    {
        if (current.getNext() == null){
            return null;
        }
        
        else {
            current = current.getNext();
            return current.getTape();
        }
    }
    
    public VideoTape getPreviousTape()
    {
        if (current.getPrev() == null){
            return null;
        }
        
        else {
            current = current.getPrev();
            return current.getTape();
        }
    }
    
    public void editTape(String title, int length, boolean lent)
    {
        VideoTape tape = current.getTape();
        
        tape.setTitle(title);
        tape.setLength(length);
        tape.setLent(lent);       
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
