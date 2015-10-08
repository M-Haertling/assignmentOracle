
public class ArrayQueueTest {

    public static void main(String[] args) {
        ArrayQueue testCirc = new ArrayQueue(10);
        String[] test =
        {
            "A", "B", "C", "D", "E"
        };
        for (String s : test)
        {
            
            testCirc.enqueue(s);
        }

        for (int i = 0; i < 1000; i++)
        {
            try
            {
                //System.out.print("\nDequeue(queue) pair \n-----------");
                testCirc.enqueue(testCirc.dequeue());
                //System.out.println("-----------\n I="+i);
            }
            catch (Exception e)
            {
                System.err.println("Circularity has caused an error");
                return;
            }
        }
        
        if (testCirc.dequeue() != "A")
        {
            System.err.println("Incorrect dequeue order");
            return;
        }
        
        if (testCirc.getSize() != 4)
        {
            System.err.println("Incorrect size");
            return;
        }
        System.out.println("Success");
    }
}
