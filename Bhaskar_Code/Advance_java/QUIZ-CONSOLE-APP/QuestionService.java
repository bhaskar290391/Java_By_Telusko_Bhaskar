import java.util.Scanner;

public class QuestionService {
    Question[] questions =new Question[5];
    String[] selection=new String[5];
    
    QuestionService(){
        questions[0]=new Question(1, "Size of int", "2"  , "6", "4", "8", "4");
        questions[1]=new Question(2, "Size of double", "2"  , "6", "4", "8", "8");
        questions[2]=new Question(3, "Size of char", "2"  , "6", "4", "8", "2");
        questions[3]=new Question(4, "Size of long", "2"  , "6", "4", "8", "8");
        questions[4]=new Question(5, "Size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz(){
        int i=0;
        for (Question question : questions) {
            System.out.println("Question No. : "+question.getId());
            System.out.println(question.getQuestion());
            System.out.println(question.getOpt1());
            System.out.println(question.getOpt2());
            System.out.println(question.getOpt3());
            System.out.println(question.getOpt4());
            Scanner sc=new Scanner(System.in);
            selection[i]= sc.nextLine();
            i++;
        }

        for (String answer:selection) {
            System.out.println(answer);
        }
    }

    public void printScores(){
        int score=0;

        for(int i=0;i<questions.length;i++){

            Question ques=questions[i];

            String actualAnswer=ques.getAnswer();
            String userAnswer=selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }

        System.out.println("The score is : "+ score);
        
    }
}
