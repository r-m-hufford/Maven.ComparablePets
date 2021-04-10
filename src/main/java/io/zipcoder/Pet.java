package io.zipcoder;

public abstract class Pet implements Comparable<Pet>{
    //comment added for testing
    public String name;
    public String speak;


    public Pet() {
        }

    //////ADD A GET TYPE METHOD////////
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", speak='" + speak + '\'' +
                '}';
    }
}
