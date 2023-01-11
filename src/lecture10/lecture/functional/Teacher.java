package lecture10.lecture.functional;

public class Teacher implements Printable, PrintablePrefix, PrintableReturn{
    private String name;
    private int age;

    public Teacher(){}

    @Override
    public void print() {
        System.out.println("I am a teacher");
    }

    @Override
    public void print(String prefix) {
        System.out.println("Teacher teching teaching: " +  prefix);
    }

    @Override
    public String printReturn(String prefix) {
        System.out.println("Return Teacher teching teaching: " +  prefix);
        return "Return Teacher teching teaching: " +  prefix;
    }
}
