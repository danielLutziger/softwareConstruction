package lecture11;


import lecture11.exceptions.BrokeException;
import lecture11.exceptions.MessyError;
import lecture11.model.Animal;
import lecture11.model.Keeper;
import lecture11.model.Manager;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    /**
     * array:
     * null: nullpointer exception
     *
     * exceptions (throwable):
     * - exception : surrounded by try catch
     * - error : raise an error
     *
     * error vs assertion
     * => similar
     * => semantics => assertions are for the semantics (pre & post) | -ea
     * => errors all the time (e.g. assertions are not in the production)
     * => out of memory => an error
     */

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        System.out.println("The Zoo is open for business.");

        for (int i = 0; i < 3; i++) {
            animals.add(new Animal());
        }

        Keeper keeper = new Keeper(animals);
        Manager manager = new Manager(animals, keeper);
        try {
            manager.manage();
        } catch (BrokeException e) {
            System.out.println("Reduce costs!!");
        } catch (MessyError e) { //does not need to be told to raise a specific error
            System.out.println("Keeper stop whining.");
        } finally {
            // executred regardless of whether an exception is thrown
            // external sources (e.g. db connection to close connection)
            System.out.println("...profits!");
        }
        System.out.println("And everything goes on as normal.");

    }
}
