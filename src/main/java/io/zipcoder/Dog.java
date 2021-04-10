package io.zipcoder;

public class Dog extends Pet{

    public Dog(String name, String speak) {
        this.name = "dog";
        this.speak = "bark";
    }

    @Override
    public String getSpeak() {
        return speak;
    }

    @Override
    public void setSpeak(String speak) {
        this.speak = speak;
    }

    @Override
    public int compareTo(Pet o) {
        if (this.name.charAt(0) == o.name.charAt(0)) {
            return 0;
        } else if (this.name.charAt(0) > o.name.charAt(0)) {
            return 1;
        } else if (this.name.charAt(0) < o.name.charAt(0)) {
            return -1;
        }
        return 0;
    }
}

