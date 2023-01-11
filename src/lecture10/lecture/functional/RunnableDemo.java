package lecture10.lecture.functional;

public class RunnableDemo {
    public static void main(String args[]){
        System.out.println("=== RunnableTest ===");

        // anonymous runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello there");
            }
        };

        // lambda runnable
        Runnable r2 = () -> System.out.println("Hello there general kenobi");
        // outsourced
        Runnable r3 = new RunnableTeacher();

        r1.run();
        r2.run();
        r3.run();
    }
}
