package com.company.pkgx;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human one = new Human(35, BigDecimal.valueOf(77), "Vasya1");
        Human two = new Human(47, BigDecimal.valueOf(81), "Oleg");
        Human two2 = new Human(49, BigDecimal.valueOf(88), "Oleg");
        Human three = new Human(38, BigDecimal.valueOf(69), "Igor1");
        // TreeSet: Igor1 (name)

        Human four = new Human(35, BigDecimal.valueOf(77), "Vasya");
        Human five = new Human(55, BigDecimal.valueOf(54), "Misha22");

        HashMap<Human, String> someMap = new HashMap<>();
        someMap.put(two, "Stroka222");
        someMap.put(three, "Stroka444");
        someMap.put(one, "Stroka331");
        someMap.put(five, "Stroka555");
        someMap.put(two, "Stroka5559999");
        for(Map.Entry<Human, String> tmp : someMap.entrySet()) {
            System.out.println(tmp);
        }
        System.out.println("someMap.containsKey(one): " + someMap.containsKey(one));
        System.out.println("someMap.containsValue(one): " + someMap.containsValue("Stroka555"));
        System.out.println("someMap.containsValue(one): " + someMap.containsValue("S4325435troka555"));
        System.out.println("someMap.size() = " + someMap.size());
        System.out.println("someMap.get(two) = " + someMap.get(two));
        
// ------------------------------- SET -----------------------
/*        HashSet<Integer> someInteger = new HashSet<>();
        someInteger.add(5);
        someInteger.add(6);
        System.out.println(someInteger.add(7));
        System.out.println("someInteger = " + someInteger);
        System.out.println(someInteger.add(5));
        System.out.println("someInteger = " + someInteger);

        System.out.println("one = " + one.hashCode());
        System.out.println("two = " + two.hashCode());
        System.out.println("three = " + three.hashCode());
        System.out.println("four = " + four.hashCode());
        System.out.println("five = " + five.hashCode());
        System.out.println("--------------------");

        HashSet<Human> humans = new HashSet<>();
        humans.add(one);
        humans.add(two);
        humans.add(three);
        humans.add(four);
        humans.add(five);
        // sashaMethod(hashSet<Human> myHumans) { ... }

        System.out.println("humans contains three: " + humans.contains(three));
        Human six = new Human(99, BigDecimal.valueOf(98), "Unknown");
        System.out.println("humans contains five: " + humans.contains(five));

        Iterator<Human> hiter = humans.iterator();
        while(hiter.hasNext())
            System.out.println(hiter.next());

        for(Human tmp : humans)
            System.out.println("ForEach humans (TreeSet): " + tmp);

        TreeSet<Human> humansTree = new TreeSet<>();
        List<String> myList = new...
        humansTree.add(one);
        humansTree.add(two);
        humansTree.add(two2);
        humansTree.add(three);
        humansTree.add(four);
        humansTree.add(five);
        System.out.println("humansTree:");
        // System.out.println("humansTree = " + humansTree);
        for(String a : myList)
        for(Human chel : humansTree)
            System.out.println(chel);
            // for( Element : List)
                 Element...
        // for(int i = 0; i < humans.length(); i++)
        //      println(humans.get(i))   // GET'а НЕТУ!

*//*        Person tom = new Person("Tom", 23); // tom -> "new Person"
        tom.display();      // Person Tom
        Person bob = tom.clone();                          // bob -> tom (-> "Person...")
        bob.setName("Bob");                           // 
        tom.display();      // Person Bob
        */
    }
}
class Person implements Cloneable{
    private String name;
    private int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void display(){
        System.out.printf("Person Name: %s \n", name);
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}



