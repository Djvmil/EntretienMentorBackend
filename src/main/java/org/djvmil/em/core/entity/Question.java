package org.djvmil.em.core.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionID;

    private String questionText;
    private String questionType;

    public Question() {
    }

    public Question(Long questionID, String questionText, String questionType) {
        this.questionID = questionID;
        this.questionText = questionText;
        this.questionType = questionType;
    }

    public Long getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Long questionID) {
        this.questionID = questionID;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionID=" + questionID +
                ", questionText='" + questionText + '\'' +
                ", questionType='" + questionType + '\'' +
                '}';
    }
}