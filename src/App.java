public class App {

    public static void main(String[] args) {

        String q1 = "What color is the sky?\n"
                    + "(a)blue\n(b)green\n(c)psychedelic";

        String q2 = "What color is a banana?\n"
                    + "(a)orange\n(b)yellow\n(c)brown";

        Question [] questions = {
                new Question(q1, "a"),
                new Question(q2, "b")
        };
    }
}
