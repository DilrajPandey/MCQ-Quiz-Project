package McqTimeProject;
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1,"what is yr name?","Rahul","Anshul","Ayush","Gaurav","Rahul");  
        questions[1] = new Question(2,"which is integer?","21.2","24/2","45","4.34","45");  
        questions[2] = new Question(3,"which is double?","21.2","24/2","45","4","21.2");  
        questions[3] = new Question(4,"which is fraction?","21.2","24/2","45","4.34","24/2");  
        questions[4] = new Question(5,"which is irrational?","21.2","24/2","45","1.3333","1.3333");  
        //create object of each questions otherwise it will give NullPointerException(for every question = that's why in the constructor)
    }

//WAY TWO OF CALCULATING QUIZ SCORE
    public void PlayQuiz(){

        int i = 0;    //for iteration
        for(Question q : questions){  //for each questions
            System.out.println("Question no. : "+ q.getId()+" ");
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            System.out.print("Your Ans : ");  
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();    //storing the ans in selection[]
            i++;
            //We have stored all the answers in an array as we want to use answers outside this function
            // String[] selections = new String[5];
            //like creating another function which calculates the score (PrintScore)
            System.out.println();
            
        }
        
    }
    public void PrintScore(){
        int Score = 0;
        for(int i=0;i<questions.length;i++){
            Question que = questions[i];   //taken the Question type data type to store the question[i] so that we can get the actual answer from it (as question[i] contains all details)

            String ActualAnswer = que.getAnswer();  //actual ans from questions[i]
            String SelectedAnswer = selection[i];   //selected ans 

            if(SelectedAnswer.equals(ActualAnswer)){ //checking if the answer is equals to the actual ans or not
                Score++;                      //incrementing the score
            }
        }
        System.out.println("Your total score is : "+Score);  //printing the total score
    }
}
