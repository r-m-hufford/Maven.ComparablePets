package io.zipcoder;

public class Fish extends Pet{

    public Fish() {

    }

    public Fish(String name, String speak) {
        this.name = "fish";
        this.speak = "blub";
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

    @Override
    public int compare(Object o1, Object o2) {
        if (this == o2) {
            return 0;
        } else if (this > o2) {
            return 1;
        } else if (this < o2) {
            return -1;
        }
        return 0;
    }
}
