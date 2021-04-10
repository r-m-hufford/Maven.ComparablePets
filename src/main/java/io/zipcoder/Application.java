package io.zipcoder;


import java.util.*;

public class Application implements Comparator<Pet> {
    Display display = new Display();
    Integer numberOfPets = 0;
    List<Pet> pets = new ArrayList<>();

    public void applicationEngine() {
        setNumberOfPets(display.requestNumberOfPets());
        listEachPet(display.inputPetType(numberOfPets));
        printPets();
    }

    public void setNumberOfPets(Integer requestNumberOfPets) {
        this.numberOfPets = requestNumberOfPets;
    }

    public void listEachPet(List<String> pets) {
        for (int i = 0; i < pets.size(); i++) {
            //String input from display
            switch (pets.get(i).toLowerCase()) {
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

    @Override
    public int compare(Pet o1, Pet o2) {
        return 0;
    }

    /*@Override
    public int compare(Pet o1, Pet o2) {
        return -o1.getType().compareTo(o2.getType());
    }

    Arrays.sort(warehouse, (a,b) -> a.getType().compareTo(b.getType())*/
}

