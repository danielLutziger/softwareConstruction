package lecture10.lecture.functional;

import java.util.ArrayList;
import java.util.List;

public class PeopleBuilder {

    public static List<Person> createShortList() {
        List<Person> people = new ArrayList<Person>();

        people.add(new Person("Bob", "Baker", 21, "bob.baker@example.com","201-121-4678","44 4th St, Smallville, KS 12333"));
        people.add(new Person("Jane","Doe",25,"jane.doe@example.com","202-123-4678","33 3rd St, Smallville, KS 12333"));
        people.add(new Person("John","Doe",25,"john.doe@example.com","202-123-4678","33 3rd St, Smallville, KS 12333"));
        people.add(new Person("James","Johnson",45,"james.johnson@example.com","333-456-1233","201 2nd St, New York, NY 12111"));
        people.add(new Person("Joe","Bailey",67,"joebob.bailey@example.com","333-456-1233","201 2nd St, New York, NY 12111"));
        people.add(new Person("Phil","Smith",55,"phil.smith@example.com","222-33-1234","22 2nd St, New Park, CO 222333"));
        people.add(new Person("Betty","Jones",85,"betty.jones@example.com","211-33-1234","22 4th St, New Park, CO 222333"));

        return people;
    }
}
