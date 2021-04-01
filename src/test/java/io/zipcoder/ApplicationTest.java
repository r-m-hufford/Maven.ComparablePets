package io.zipcoder;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTest {

    private Application app;
    @Before
    public void setUp() throws Exception {
        app = new Application();
    }

    @Test
    public void numberOfPetsTest() {
        app.setNumberOfPets(5);
        Integer expected = 5;
        Integer actual = app.numberOfPets;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addPetTest() {
        app.addPet(new Cat("claws", "purr"));
        Integer expected = 1;
        Integer actual = app.numberOfPets;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petTypesTest() {
        List<String> pets = new ArrayList<>();
        pets.add("dog");
        app.listEachPet(pets);

        Integer expected = 1;
        Integer actual = app.pets.size();

        Assert.assertEquals(expected, actual);
    }

}
