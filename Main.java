package McqTimeProject;

public class Main {

    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.PlayQuiz();     //name changed to PlayQuiz(previous : dispayQuestion)
        service.PrintScore();   
    }
}
