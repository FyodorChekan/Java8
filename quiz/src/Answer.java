public class Answer {
    private Question question;
    private int user_index_answer;

    public Answer(Question question, int user_index_answer) {
        this.question = question;
        this.user_index_answer = user_index_answer;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public int getUser_index_answer() {
        return user_index_answer;
    }

    public void setUser_index_answer(int user_index_answer) {
        this.user_index_answer = user_index_answer;
    }

    @Override
    public String toString() {
        return "Вопрос: " + question.getQuestion() +
                "Ваш ответ: " + user_index_answer +
                "Правильный ответ: " + question.getIndex_right_answer();
    }
}
