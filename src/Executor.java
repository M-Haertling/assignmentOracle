public class Executor {

	public static void main(String[] args) {
		Utility.init(); // initializes file readers
		String[] questions = Utility.readQuestions(); //reads question.txt file into questions array
		String[] answers = Utility.readAnswers(); // reads answers.txt file into answers array
		
		int numOracles = answers.length; //finds the number of oracles
		
        
        
		//TODO Assign questions to oracles using Utility.random and print the 
        //question paired with the oracle response
        
		// 1. Initialize one ArrayQueue per oracle (arrays will work best).
        ArrayQueue[] oracle = null; // = new ArrayQueue[numOracles];
        for(int k = 0; k < numOracles; k++)
        {
            oracle[k] = new ArrayQueue(questions.length);
        }
        
        
        // 2. Put the questions into the queues, assigning each one to the queue 
        //of the oracle whose number is returned by the random number generator.
        for (String question : questions)
        {
            oracle[Utility.random(numOracles)].enqueue(question);
        }
        
        
		// 3. Loop through the oracles, having each one remove a question from 
        //its queue (if empty do nothing) and answer it with its unique answer 
        //(oracle[k] uses answers[k]). Do this repeatedly till all queues 
        //become empty.
        boolean allEmpty = false;
        while(!allEmpty)
        {
            allEmpty=true;
            
            for (int z = 0; z < numOracles; z++)
            {
                if(oracle[z].isEmpty())
                {
                    continue;
                }
                System.out.println(oracle[z].dequeue());
                System.out.println(answers[z] + "\n");
                allEmpty = false;
            }
        }
        
	}
}
