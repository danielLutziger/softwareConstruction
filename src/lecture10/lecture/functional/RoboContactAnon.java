package lecture10.lecture.functional;

import java.util.List;

/**
 *
 * @author MikeW
 */
public class RoboContactAnon {
    /**
     * better version of the implementation than 1&2 it referes to a test which should be used
     * to decide whether a person should be contacted
     * => more flexible code
     */
  public void phoneContacts(List<Person> pl, MyTest<Person> aTest){
    for(Person p:pl){
      if (aTest.test(p)){
        roboCall(p);
      }
    }
  }

  public void emailContacts(List<Person> pl, MyTest<Person> aTest){
    for(Person p:pl){
      if (aTest.test(p)){
        roboEmail(p);
      }
    }
  }

  public void mailContacts(List<Person> pl, MyTest<Person> aTest){
    for(Person p:pl){
      if (aTest.test(p)){
        roboMail(p);
      }
    }
  }  
  
  public void roboCall(Person p){
    System.out.println("Calling " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getPhone());
  }
  
  public void roboEmail(Person p){
    System.out.println("EMailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getEmail());
  }
  
  public void roboMail(Person p){
    System.out.println("Mailing " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge() + " at " + p.getAddress());
  }

}
