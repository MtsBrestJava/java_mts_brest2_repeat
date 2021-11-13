package com.company.pkgx;

import java.math.BigDecimal;
import java.util.Objects;

public class Human implements Comparable<Human>{

    Integer age;                // 35
    BigDecimal weight;      // 70
    String name;            // Vasya
                            // hashCode() = 731, 104332, 2372

    // Human serj = new Human(25, ..., )
    // serj.Human(25, ...) {
    // serj.age = newAge (25)
    // Human leha = new Human(36, ..., )
    // 
    public Human(int age, BigDecimal weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (weight != null ? !weight.equals(human.weight) : human.weight != null) return false;
        return name != null ? name.equals(human.name) : human.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Human o) {
        // -1 -> вверх
        // 1 -> вниз
        // 0 -> не менять
/*
        if(age > o.age) return 1;
        else if (age < o.age) return -1;
        else return 0;
*/
        // serj.name.length() > o.
/*        if(name.length() > o.name.length()) return 1;
        else if(name.length() < o.name.length()) return -1;
        else return 0;*/
        return age.compareTo(o.age);
        //return name.compareTo(o.name);
    }

}


