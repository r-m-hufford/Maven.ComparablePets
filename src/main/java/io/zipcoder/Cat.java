package io.zipcoder;

public class Cat extends Pet{


    public Cat(String name, String speak) {
        this.name = "cat";
        this.speak = "meow";
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
        if (o1.getClass().getName().charAt(0) == o2.getClass().getName().charAt(0)) {
            return 0;
        } else if (o1.getClass().getName().charAt(0)  > o2.getClass().getName().charAt(0)) {
            return 1;
        } else if (o1.getClass().getName().charAt(0) < o2.getClass().getName().charAt(0)) {
            return -1;
        }
        return 0;
    }
}

