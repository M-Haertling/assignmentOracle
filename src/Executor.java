/*
 @author Greyson Paris
 NetID: gsp150230
 CS 2336 - M/W 5:30pm - 6:45pm
 */
public class Executor {

	public static void main(String[] args) { // the main method ¯\_(ツ)_/¯.
		Utility.init(); // initializes file readers
		String[] questions = Utility.readQuestions(); //reads question.txt file into questions array
		String[] answers = Utility.readAnswers(); // reads answers.txt file into answers array
		
		int numOracles = answers.length; //finds the number of oracles (dependent on number of answers)
        
		// 1. Initialize one ArrayQueue per oracle
        ArrayQueue[] oracle = new ArrayQueue[numOracles]; //creates an array with enough elements to fit each oracle
        for(int k = 0; k < numOracles; k++)
        {
            oracle[k] = new ArrayQueue(questions.length);
        }
        
        
        // 2. Distribute questions randomly to each oracle
        for (String question : questions)
        {
            oracle[Utility.random(numOracles)].enqueue(question); //load each question with an enqueue() call
        }
        
        //3. do the data dance. Here we loop through all oracles, asking one question each.
        // the process continues until there are no questions left to ask
        boolean allEmpty = false;
        while(!allEmpty) // run until allEmpty==true
        {
            allEmpty=true; // "arm" the exit condition
            
            for (int z = 0; z < numOracles; z++)
            {
                if(oracle[z].isEmpty())
                {
                    continue;
                }
                System.out.println(oracle[z].dequeue()); //dequeue the question
                System.out.println(answers[z] + "\n"); //print the oracle specific answer
                
                // if all oracles are empty, this statement will be unable "disarm" 
                // the exit condition. Else, we toggle it back to false and continue
                // to loop
                allEmpty = false; 
            }
        }
        
	}
}
