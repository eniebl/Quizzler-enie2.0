package oop.quizzler.model;
import java.util.ArrayList;

public class MCQuestion extends Question{
    private String[] answers;

    public MCQuestion (String question, String[] answers, ArrayList<String> correctAnswers) {
		super(question, correctAnswers);
        this.displayType = DisplayType.MC;
        this.answers = answers;
	}

    public String[] getAnswers() {
        return this.answers;
    }

    @Override
    public boolean checkAnswer(ArrayList<String> givenAnswers) {
        if (givenAnswers.size() != this.correctAnswers.size()) {
            return false;
        }
        for (String answer : givenAnswers) {
            if (!this.correctAnswers.contains(answer)) {
                return false;
            }
        }
        return true;
    }


}

