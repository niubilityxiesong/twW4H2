package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    public List<String> results = new ArrayList<>();
    //public List<String> allnumber = new ArrayList<>();
    public String[] allnumber2;
    public int keywords = -1;
    String array3 = "Fizz";
    String array5 = "Buzz";
    String array7 = "Whizz";

    public void start(int count) {

        int i;
        String temp = new String();
        for(i = 1; i < count + 1; i++){

            //allnumber.clear();
            //IntToString(i);
            allnumber2 = String.valueOf(i).split("");
            keywords = FindKeyWords();
            if(keywords > 0){
                temp = array3;
                results.add(temp);
                temp = "";
                keywords = -1;
            }
            else {
                rule1(i);
            }
        }

        getResults();
    }

    public int FindKeyWords(){

        for(int i = 0; i < allnumber2.length; i++){
            if(allnumber2[i].equals("3")){
                return 1;
            }
        }
        return -1;
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

  // public void IntToString(int number){
  //     int sum = 1;
  //     int tempnumber = number;

  //     tempnumber /= 10;
  //     while(tempnumber > 0){
  //         tempnumber /= 10;
  //         sum *= 10;
  //     }

  //     while (sum > 0){
  //         tempnumber = number / sum;
  //         number %= sum;
  //         sum /= 10;
  //         allnumber.add(String.valueOf(tempnumber));
  //     }
  // }
}


