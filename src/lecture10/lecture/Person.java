package  lecture10.lecture;

public class Person {

    private String givenName;
    private String surName;
    private int age;
    private String eMail;
    private String phone;
    private String address;

    public Person(String givenName, String surName, int age, String eMail, String phone, String address) {
        this.givenName = givenName;
        this.surName = surName;
        this.age = age;
        this.eMail = eMail;
        this.phone = phone;
        this.address = address;
    }

    public String getGivenName(){
        return givenName;
    }

    public String getSurName(){
        return surName;
    }

    public int getAge(){
        return age;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return eMail;
    }

    public String getAddress(){
        return address;
    }

    public void print(){
        System.out.println(
                "\nName: " + givenName + " " + surName + "\n" +
                        "Age: " + age + "\n" +
                        "eMail: " + eMail + "\n" +
                        "Phone: " + phone + "\n" +
                        "Address: " + address + "\n"
        );
    }

    public void printName(){
        System.out.println(
                "Name: " + givenName + " " + surName);
    }

    @Override
    public String toString(){
        return "Name: " + givenName + " " + surName + "\n" + "Age: " + age + "\n" + "eMail: " + eMail + "\n" + "Address: " + address + "\n";
    }



}
