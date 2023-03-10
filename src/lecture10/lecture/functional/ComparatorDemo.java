package lecture10.lecture.functional;

import java.util.*;

public class ComparatorDemo {
    public static void main(String args[]){

        List<Person> personList = PeopleBuilder.createShortList();

        // Sort with Inner Class
        Collections.sort(personList, new Comparator<Person>(){
            public int compare(Person p1, Person p2){
                return p1.getSurName().compareTo(p2.getSurName());
            }
        });

        System.out.println("=== Sorted Asc SurName ===");
        for(Person p:personList){
            p.printName();
        }

        // Use Lambda instead

        // Print Asc
        System.out.println("=== Sorted Asc SurName ===");
        Collections.sort(personList,
                (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));

        for(Person p:personList){
            p.printName();
        }

        // Print Desc
        System.out.println("=== Sorted Desc SurName ===");
        Collections.sort(personList, (p1,  p2) -> p2.getSurName().compareTo(p1.getSurName()));

        for(Person p:personList){
            p.printName();
        }

    }
}
