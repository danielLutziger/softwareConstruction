package lecture10.lecture;
import lecture10.lecture.PeopleBuilder;

import java.util.List;

/**
 * @author MikeW
 */
public class RoboCallTest03 {

  /**
   * anon classes test
   * => code gets more flexible but a lot of clutter code (anon classes)
   */
  public static void main(String[] args) {

    List<Person> pl = PeopleBuilder.createShortList();
    RoboContactAnon robo = new RoboContactAnon();
    
    System.out.println("\n==== Test 03 ====");
    System.out.println("\n=== Calling all Drivers ===");
    robo.phoneContacts(pl, 
        new MyTest<Person>(){
          @Override
          public boolean test(Person p){
            return p.getAge() >=16;
          }
        }
    );
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailContacts(pl, 
        new MyTest<Person>(){
          @Override
          public boolean test(Person p){
            return p.getAge() >= 18 && p.getAge() <= 25 ;
          }
        }
    );
    
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailContacts(pl, 
        new MyTest<Person>(){
          @Override
          public boolean test(Person p){
            return p.getAge() >= 23 && p.getAge() <= 65;
          }
        }
    );

    
  }
}
