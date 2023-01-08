package lecture10.lecture;

public class LambdaDemo {
    public static void main(String args[]){
        Teacher t = new Teacher();
        //t.print();
        printIT(
                () -> System.out.println("teach teach") // teacher t has nothing to do with our printable hence we could just pass the function code
        ); // => this transforms printIT to to a higher order function

        printIT((pr) -> System.out.println(pr + "TEach TTT"));
        printIT((pr) -> { System.out.println(pr + "TEach TTT"); System.out.println(pr + "TEach QQQQ"); });
        printITReturn((pr) -> { System.out.println(pr + "TEach REQW"); System.out.println(pr + "TEach QQQQ"); return "RRRR";});
    }

    static void printIT(Printable p){
        p.print();
    }

    static void printIT(PrintablePrefix p){
        String prefix = "some argument: ";
        p.print(prefix);
    }

    static void printITReturn(PrintableReturn p){
        p.printReturn("some argument return : ");
    }
}
