package io.zipcoder;

import java.util.Comparator;

public abstract class Pet implements Comparable<Pet>, Comparator {

    public String name;
    public String speak;


    public Pet() {
        }

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
