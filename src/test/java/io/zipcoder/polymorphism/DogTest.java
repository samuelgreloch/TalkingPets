package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test

    public void speakTest(){

        Dog dog = new Dog();
        String expected = "ruff!";
        String actual = dog.speak();
        Assert.assertEquals(expected,actual);
    }
    @Test

    public void getNameTest(){

        Dog dog = new Dog();
        String expected = "Max";
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);

    }

    @Test

    public void setNameTest(){

        Dog dog = new Dog();
        String expected = "Max";
        dog.setName();
        String actual = dog.setName();
        Assert.assertEquals(expected, actual);

    }




}

