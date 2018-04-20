package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class FizzBuzzGameTest {

    @Test
    public void testFindKyeWord() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.allnumber2 = new String[]{"1","3"};

        assertThat(fizzBuzzGame.FindKeyWords()).isTrue();
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
