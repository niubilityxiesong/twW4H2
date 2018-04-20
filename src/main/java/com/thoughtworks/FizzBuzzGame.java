package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {

    public List<String> results = new ArrayList<>();
    public String[] allnumber2;
    private static String array3 = "Fizz";
    private static String array5 = "Buzz";
    private static String array7 = "Whizz";

    public void start(int count) {

        int i;
        String temp = new String();
        for(i = 1; i < count + 1; i++){

            allnumber2 = String.valueOf(i).split("");
            if(FindKeyWords()){

                results.add(array3);
            }
            else {
                rule1(i);
            }
        }

        getResults();
    }

    public boolean FindKeyWords(){

        for(int i = 0; i < allnumber2.length; i++){
            if(allnumber2[i].equals("3")){
                return true;
            }
        }
        return false;
    }

    public void rule1(int i){


        String temp = new String();
        if(i % 3 == 0){
            temp += array3;
        }
        if(i % 5 == 0){
            temp += array5;
        }
        if(i % 7 == 0){
            temp += array7;
        }
        if(temp.length() == 0) {
            temp = String.valueOf(i);
        }
        results.add(temp);

    }


    public List<String> getResults() {


        return results;
    }
}


