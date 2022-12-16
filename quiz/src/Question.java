import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    private List<String> answers;
    private int index_right_answer;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public int getIndex_right_answer() {
        return index_right_answer;
    }

    public void setIndex_right_answer(int index_right_answer) {
        this.index_right_answer = index_right_answer;
    }

    public Question(String question, List<String> answers, int index_right_answer) {
        this.question = question;
        this.answers = answers;
        this.index_right_answer = index_right_answer;
    }

    public void answers_to_array() {
        for (int i = 0; i < answers.size(); i++) {

        }
    }

    @Override
    public String toString() {
        return "Вопрос: " + question +
                "Варианты ответов: " + answers;
    }
}
