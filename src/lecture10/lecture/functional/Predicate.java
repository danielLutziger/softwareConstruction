package lecture10.lecture.functional;

// predicate tests if something is true or false (naming convention in java)
public interface Predicate<Person> {
  public boolean test(Person t);
}
