package io.zipcoder;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FishTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getSpeakTest() {
        Fish fish = new Fish("slimy", "blub");
        String expected = "blub";
        String actual = fish.getSpeak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setSpeakTest() {
        Fish fish = new Fish("slimy", "blub");
        fish.setSpeak("blib blub");

        String expected = "blib blub";
        String actual = fish.getSpeak();

        assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        Fish fish = new Fish("slimy", "blub");
        fish.setName("fishy");

        String expected = "fishy";
        String actual = fish.getName();

        assertEquals(expected, actual);
    }
}