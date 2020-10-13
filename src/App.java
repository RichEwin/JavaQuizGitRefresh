import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        String q1 = "What color is the sky?\n" + "(a)blue\n(b)green\n(c)psychedelic";

        String q2 = "What color is a banana?\n" + "(a)orange\n(b)mellowyellow\n(c)brown";

        String q3 = "What color is a pink lady apple?\n" + "(a)purple\n(b)red\n(c)black";

        Question[] questions = { new Question(q1, "a"), new Question(q2, "b"), new Question(q3, "a") };
    }

    public static void takeTest(Question[] questions) {
        int score = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = input.nextLine();
            if (answer.equals(questions[i].answer)) {
                score++;
            }
        }
        System.out.println("You scored " + score + "/" + questions.length);
    }
}
