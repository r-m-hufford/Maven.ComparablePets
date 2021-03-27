package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void numberOfPetsTest() {
        Application app = new Application();

        app.setNumberOfPets(5);
        Integer expected = 5;
        Integer actual = app.numberOfPets;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addPetTest() {
        Application app = new Application();

        app.addPet(new Cat("claws", "purr"));

        Integer expected = 1;
        Integer actual = app.numberOfPets;

        Assert.assertEquals(expected, actual);
    }


}
