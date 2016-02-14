import java.util.ArrayList;
import java.util.EmptyStackException;
import java.io.File;

/**
 *  Implements a stack in an array (a static stack).
 *  The stack pointer (SP) points to the top item in the stack.
 *  When SP == 0, it is pointing the bottom item in the stock.
 *  If the stack is empty, SP == -1.
 * 
 *  On push, SP is incremented, then the data is added at SP.
 *  On pop,  the data is removed, then SP is decremented.
 */
public class Stack {
    
    private ArrayList arrayList = new ArrayList();

    /**
     * Initializes the stack.
     * @param stackSize
     */
    public Stack() 
    {
        arrayList = new ArrayList();
    }
    
    public void push(int data) 
    {
         // Add obj to the stack.
        arrayList.add(data);
    }
        
    public int pop()
    {
        if (arrayList.isEmpty())
                   throw new EmptyStackException();
        return (int) arrayList.remove((arrayList.size()-1));
    }
   
    public int arrayTop()
    {
        return (int) arrayList.get((arrayList.size() - 1));
    }

    public boolean isEmpty()
    {
        if (arrayList == null) 
        {  
	    return arrayList.isEmpty();
        }
        else 
        {
            return false;
        }
    }
    
    public int size() {

        return arrayList.size();
    }
    
    public String toString() 
    {
	return arrayList.toString();
    }
}