package io.zipcoder;


import java.util.ArrayList;
import java.util.Collections;
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
                    addPet(new Dog("dog", "bark"));
                    break;
                case "cat":
                    addPet(new Cat("cat", "meow"));
                    break;
                case "fish":
                    addPet(new Fish("fish", "blub"));
                    break;
                default:
                    System.out.println("Please enter a valid pet.");
            }
        }
    }

    public void printPets() {
        Collections.sort(pets);
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

