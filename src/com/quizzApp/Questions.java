package com.quizzApp;

public class Questions {
    private int id;
    private String question;
    private int opt1;
    private int opt2;
    private int opt3;
    private int opt4;
    private String answer;

    public Questions(int id, String question, int opt1, int opt2, int opt3, int opt4, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public int getOpt1() {
        return opt1;
    }

    public int getOpt2() {
        return opt2;
    }

    public int getOpt3() {
        return opt3;
    }

    public int getOpt4() {
        return opt4;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", opt1=" + opt1 +
                ", opt2=" + opt2 +
                ", opt3=" + opt3 +
                ", opt4=" + opt4 +
                ", answer='" + answer + '\'' +
                '}';
    }
}
