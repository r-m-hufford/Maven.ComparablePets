package io.zipcoder;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    Display display = new Display();
    Console console = new Console();
    Integer numberOfPets = 0;
    Scanner scanner = new Scanner(System.in);
    List<Pet> pets = new ArrayList<Pet>();

    public void applicationEngine() {
        setNumberOfPets(display.requestNumberOfPets());
        listEachPet(numberOfPets);
        printPets();
    }

    public void setNumberOfPets(Integer requestNumberOfPets) {
        this.numberOfPets = requestNumberOfPets;
    }

    public void listEachPet(Integer numberOfPets) {
        for (int i = 0; i < numberOfPets; i++) {
            String pet = display.inputPetType();
            switch (pet.toLowerCase()) {
                case "dog":
                    addPet(new Dog());
                    break;
                case "cat":
                    addPet(new Cat());
                    break;
                case "fish":
                    addPet(new Fish());
                    break;
                default:
                    System.out.println("Please enter a valid pet.");
            }
        }
    }

    public void printPets() {
        System.out.println(pets.toString());
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        numberOfPets++;
    }

    public Pet getPet(Integer index) {
        return pets.get(index);
    }
}

