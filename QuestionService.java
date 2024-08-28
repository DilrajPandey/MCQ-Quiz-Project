package McqTimeProject;

public class QuestionService {
    Question[] questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1,"what is yr name?","Rahul","Anshul","Ayush","Gaurav","Rahul");  
        questions[1] = new Question(1,"which is integer?","21.2","24/2","45","4.34","45");  
        questions[2] = new Question(1,"which is double?","21.2","24/2","45","4","21.2");  
        questions[3] = new Question(1,"which is fraction?","21.2","24/2","45","4.34","24/2");  
        questions[4] = new Question(1,"which is irrational?","21.2","24/2","45","1.3333","1.3333");  
        //create object of each questions otherwise it will give NullPointerException(for every question = that's why in the constructor)
    }

    public void displayQuestions(){
        
        for(Question q : questions){  //for each questions
            System.out.println(q.getQuestion());
        }
        
    }
}
