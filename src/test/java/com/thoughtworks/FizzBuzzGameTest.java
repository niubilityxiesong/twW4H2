package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class FizzBuzzGameTest {

    @Test
    public void testIntToString() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        fizzBuzzGame.IntToString(13);
        assertThat(fizzBuzzGame.allnumber.get(0)).isEqualTo("1");
        assertThat(fizzBuzzGame.allnumber.get(1)).isEqualTo("3");
    }

    @Test
    public void testKeywords() throws Exception {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();

        fizzBuzzGame.IntToString(13);

        assertThat(fizzBuzzGame.FindKeyWords()).isEqualTo(1);
    }

    @Test
    public void testrule1() throws Exception {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String result= "FizzBuzz";

        fizzBuzzGame.rule1(15);
        assertThat(result).isEqualTo(fizzBuzzGame.results.get(0));

    }

    @Test
    public void testResultSize() throws Exception {

        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.start(100);
        assertThat(fizzBuzzGame.results.size()).isEqualTo(100);
    }
}
