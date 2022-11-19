package org.example.collections.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<Person, Integer> map = new TreeMap<>(Comparator.comparingInt(o -> o.age));
        map.put(new Person("John", "Smith", 17), 0);
        map.put(new Person("Ivan", "Petrenko", 65), 0);
        map.put(new Person("Pedro", "Escobar", 32), 0);
        map.put(new Person("Radion", "Pyatkin", 14), 0);
        map.put(new Person("Sergey", "Vashkevich", 19), 0);

        Person firstAdultPerson = map.navigableKeySet().stream().filter(person -> person.age > 18).findFirst().get();

        Map<Person, Integer> youngPeopleMap = map.headMap(firstAdultPerson, false);
        Map<Person, Integer> adultPeopleMap = map.tailMap(firstAdultPerson, true);
        showAdvertisementToYoung(youngPeopleMap);
        showAdvertisementToAdult(adultPeopleMap);
    }

    public static void showAdvertisementToYoung(Map map) {
    }

    public static void showAdvertisementToAdult(Map map) {
    }
}
