
public class ArrayQueue {
	private String[] queueArray;
	private int size;
	private int front;
	private int back;
	
	public ArrayQueue(){
		queueArray = new String[100];
		size = 0;
		front = 0;
		back = -1;
	}
	
	public ArrayQueue(int startSize){
		queueArray = new String[startSize];
		size = 0; //number of elements
		front = 0;
		back = -1;
	}
	/**
	 * @function returns the number of elements in the queue
	 * @return size
	 */
	public int getSize(){
            
		return size;
	}
	/**
	 * @function adds a string to the end of the queue
	 * @param input: the input to be inserted
	 */
	public void enqueue(String input){
		//TODO implement enqueue
            
            if(back < queueArray.length-2)
            {
                //System.out.println("PreTEST: adding"+input+" at position"+back+". Size = "+size
                                //    +"\n Also, Length = "+ queueArray.length);
                        
                queueArray[++back] = input;
                size++;
                
                System.out.println("INPUT TEST: adding \""+input+"\" to position"+back+". Size = "+size);
            }
            else System.out.println("Yikes, it won't fit!");
            //for each elements elements, if isEmpty == true, then array[index]= toEnqueue
	}
	
	/**
	 * @function removes the string from the front of the queue
	 * @return the string from the front of the queue
	 */
	public String dequeue(){
		
            if(front<back)
            {   
                size--;
                System.out.println("OUTPUT TEST: dequeueing and returning  "+queueArray[front+1]+". Size = "+size);
                return queueArray[front++];
            }
                return queueArray[front++]+"errorwtf";
	}
	
	/**
	 * 
	 * @return returns true if the queue is empty, false otherwise
	 */
	public boolean isEmpty(){
		//TODO implement isEmpty
            
            // for each (whole queue) is empty, return true (for testing end condition)
		return true;
	}

	/**
	 * 
	 * @return returns true if the queue is full, false otherwise
	 */
	public boolean isFull(){
		//TODO implement isFull
            
            //test if isFull, print the error. if invoking and this runs true, re-randomize your selection. 
		return false;
	}
	
}