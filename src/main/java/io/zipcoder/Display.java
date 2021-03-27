package io.zipcoder;

public class Display {

    Console console = new Console();

    public Integer requestNumberOfPets() {
        Integer numberOfPets = console.isInteger("How many pets do you have?");
        return numberOfPets;
    }

    public String inputPetType() {
        String pet = console.getStringInput("List your next Pet");
        return pet;
    }


}
