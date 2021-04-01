package io.zipcoder;

import java.util.ArrayList;

public class Display {

    Console console = new Console();

    public Integer requestNumberOfPets() {
        Integer numberOfPets = console.isInteger("How many pets do you have?");
        return numberOfPets;
    }

    public ArrayList<String> inputPetType(Integer numberOfPets) {
        ArrayList<String> pets = new ArrayList<>();
        for (int i = 0; i < numberOfPets; i++) {
            pets.add(console.getStringInput("List your next Pet"));
        }
        return pets;
    }


}
