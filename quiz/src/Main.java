import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String question11 = "Что такое конструктор у класса?";
        String answer11 = "метод, который вызывается при создании экземпляра объекта;";
        String answer12 = "специальная переменная класса;";
        String answer13 = "объект класса;";
        List<String> answers1 = new ArrayList<String>();
        answers1.add(answer11);
        answers1.add(answer12);
        answers1.add(answer13);
        int right_answer_index1 = 1;
        Question question1 = new Question(question11, answers1, right_answer_index1);

        String question22 = "Если у класса в теле не объявлен конструктор тогда";
        String answer21 = "у данного класса автоматически создается конструктор по умолчанию;";
        String answer22 = "нельзя создать объект этого класса;";
        String answer23 = "код не скомпилируется;";
        List<String> answers2 = new ArrayList<String>();
        answers2.add(answer21);
        answers2.add(answer22);
        answers2.add(answer23);
        int right_answer_index2 = 1;
        Question question2 = new Question(question22, answers2, right_answer_index2);

        String question33 = "Сколько конструкторов может быть у класса?";
        String answer31 = "неограниченное количество;";
        String answer32 = "только один;";
        String answer33 = "не более пяти;";
        List<String> answers3 = new ArrayList<String>();
        answers3.add(answer31);
        answers3.add(answer32);
        answers3.add(answer33);
        int right_answer_index3 = 1;
        Question question3 = new Question(question33, answers3, right_answer_index3);

        String question44 = "Переменные в классе инициализируется";
        String answer41 = "в порядке их объявления;";
        String answer42 = "все одновременно;";
        String answer43 = "в случайном порядке;";
        List<String> answers4 = new ArrayList<String>();
        answers4.add(answer41);
        answers4.add(answer42);
        answers4.add(answer43);
        int right_answer_index4 = 1;
        Question question4 = new Question(question44, answers4, right_answer_index4);

        String question55 = "Для каких целей служат методы get и set";
        String answer51 = "чтобы другие классы могли корректно получать или менять данные внутри объектов вашего\n" +
                "класса;";
        String answer52 = "это специальные конструкторы класса;";
        List<String> answers5 = new ArrayList<String>();
        answers5.add(answer51);
        answers5.add(answer52);
        int right_answer_index5 = 1;
        Question question5 = new Question(question55, answers5, right_answer_index5);

        List<Question> questions = new ArrayList<Question>();
        List<Answer> answers = new ArrayList<Answer>();
        List<String> wrong_questions = new ArrayList<String>();

        questions.add(question1);
        questions.add(question2);
        questions.add(question3);
        questions.add(question4);
        questions.add(question5);

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Вопрос: " + questions.get(i).getQuestion());
            for (int j = 0; j < questions.get(i).getAnswers().size(); j++) {
                System.out.println(j + 1 + ". " + questions.get(i).getAnswers().get(j));
            }
            System.out.print("Ваш ответ: ");
            int user_answer = scanner.nextInt();
            Answer answer = new Answer(questions.get(i), user_answer);
            answers.add(answer);
        }
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).getUser_index_answer() == answers.get(i).getQuestion().getIndex_right_answer())
                System.out.println("Правильный ответ!");
            else {
                System.out.println("Ответ неверный");
                wrong_questions.add(answers.get(i).getQuestion().getQuestion());
            }
        }

        System.out.println("Вы ответили правильно на " + (questions.size() - wrong_questions.size()) + " вопросов.");
        System.out.println("Неправильные ответы были даны на эти вопросы:");
        for (int i = 0; i < wrong_questions.size(); i++) {
            System.out.println(wrong_questions.get(i));
        }
    }
}
