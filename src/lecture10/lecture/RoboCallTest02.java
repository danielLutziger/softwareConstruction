package lecture10.lecture;

import lecture10.lecture.PeopleBuilder;

import java.util.List;

/**
 *
 * @author MikeW
 */
public class RoboCallTest02 {

  public static void main(String[] args) {
    
    List<Person> pl = PeopleBuilder.createShortList();
    RoboContactMethods2 robo = new RoboContactMethods2();
    
    System.out.println("\n==== Test 02 ====");
    System.out.println("\n=== Calling all Drivers ===");
    robo.callDrivers(pl);
    
    System.out.println("\n=== Emailing all Draftees ===");
    robo.emailDraftees(pl);
    
    System.out.println("\n=== Mail all Pilots ===");
    robo.mailPilots(pl);
    
  }

}
