package lecture10.lecture.functional;

/**
 * create a "test" to decide whether a person should be contacted or not
 */
public interface MyTest<T> {
  public boolean test(T t);
}
