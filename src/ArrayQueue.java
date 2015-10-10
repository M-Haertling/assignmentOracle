/*
 @author Greyson Paris
 NetID: gsp150230
 CS 2336 - M/W 5:30pm - 6:45pm
 */
public class ArrayQueue {

    private String[] queueArray;
    private int size;
    private int front;
    private int back;
    private String temp; //stores the last dequeued element
    
    
    public ArrayQueue() {
        queueArray = new String[100];
        size = 0;
        front = 0;
        back = -1;
    }

    
    public ArrayQueue(int startSize) {
        queueArray = new String[startSize];
        size = 0; // number of elements
        front = 0; // front pointer (for dequeuing elements)
        back = -1; // back pointer (for adding elements)
    }

    
    /**
     * @function returns the number of elements in the queue
     * @return size
     */
    public int getSize() {
        return size;
    }

    
    /**
     * @function adds a string to the end of the queue
     * @param input: the input to be inserted
     */
    public void enqueue(String input) {
       
        if (isFull()) //throw error 
        {
            System.out.println("Error: the array is full");
            return;
        }
        
        //1-if terminal, reset "back" to the beginning of the array
        if (back == queueArray.length-1) 
        {
            back = -1;
        }
        
        //2-increment and store input
        queueArray[++back] = input;
        size++; 
        
    }

    
    /**
     * @function removes the string from the front of the queue
     * @return the string from the front of the queue
     */
    public String dequeue() {
        
        if (isEmpty()) // throw error 
        {
            System.out.println("Error: can't dequeue an empty array");
            return "";
        }
        
        //1-wipe current entry 
        temp = queueArray[front];
        queueArray[front] = "";
        
        //2-increment front, size variables 
        if (front == queueArray.length - 1) front = 0;
        else front ++;
        size--;
        
        //3-return 
        return temp;
    }

    
    /**
     *
     * @return returns true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    
    /**
     *
     * @return returns true if the queue is full, false otherwise
     */
    public boolean isFull() {
        return size == queueArray.length;
    }

}
