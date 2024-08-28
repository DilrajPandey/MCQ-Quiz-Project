package McqTimeProject;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1,"what is yr name?","Rahul","Anshul","Ayush","Gaurav","Rahul");  
        questions[1] = new Question(2,"which is integer?","21.2","24/2","45","4.34","45");  
        questions[2] = new Question(3,"which is double?","21.2","24/2","45","4","21.2");  
        questions[3] = new Question(4,"which is fraction?","21.2","24/2","45","4.34","24/2");  
        questions[4] = new Question(5,"which is irrational?","21.2","24/2","45","1.3333","1.3333");  
        //create object of each questions otherwise it will give NullPointerException(for every question = that's why in the constructor)
    }

//WAY ONE OF CALCULATING QUIZ SCORE
    public void PlayQuiz(){

        int Score = 0;     //to count the score
        for(Question q : questions){  //for each questions
            System.out.println("Question no. : "+ q.getId()+" ");
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine();    //taking ans input   
            //We can store all the answers in an array if we want to use answers outside this function
            // String[] selections = new String[5];
            //like creating another function which calculates the score 

            if(ans.equals(q.getAnswer())){    //checking if the answer is equals to the actual ans or not
                Score++;                      //incrementing the score
                System.out.println("CORRECT");
            } else{
                System.out.println("INCORRECT");
            }
            System.out.println();             //for spacing
        }
        System.out.println("Your total score is : "+Score);  //printing the total score
    }
}
