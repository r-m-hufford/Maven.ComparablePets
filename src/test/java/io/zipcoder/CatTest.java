package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getSpeakTest() {
        Cat cat = new Cat("purr", "cat");
        String expected = "cat";
        String actual = cat.getSpeak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSpeakTest() {
        Cat cat = new Cat("purr", "cat");
        cat.setSpeak("purr");

        String expected = "purr";
        String actual = cat.getSpeak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Cat cat = new Cat("cat", null);
        cat.setName("CAT");

        String expected = "CAT";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

}