package com.example.quiztakingapp;

public class Question {
    public String question;
    public String[]options;
    public String correctOption;
    public Question(){
        question=null;
        options=null;
        correctOption=null;
    }
    void insertOption(int index,String option){
        options[index]=option;
    }
    String getOption(int index){
        return options[index];
    }
}
