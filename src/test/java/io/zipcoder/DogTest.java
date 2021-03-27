package io.zipcoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Before
    public void setUp() throws Exception {
        Dog dog = new Dog("duder", "bark");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSpeakTest() {
        Dog dog = new Dog("duder", "bark");
        String expected = "bark";
        String actual = dog.getSpeak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSpeakTest() {
        Dog dog = new Dog("duder", "bark");
        dog.setSpeak("woof");

        String expected = "woof";
        String actual = dog.getSpeak();

        assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Dog dog = new Dog("duder", "bark");
        dog.setName("rex");

        String expected = "rex";
        String actual = dog.getName();

        assertEquals(expected, actual);
    }
}