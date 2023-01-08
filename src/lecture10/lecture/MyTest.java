package lecture10.lecture;

/**
 * create a "test" to decide whether a person should be contacted or not
 */
public interface MyTest<T> {
  public boolean test(T t);
}
