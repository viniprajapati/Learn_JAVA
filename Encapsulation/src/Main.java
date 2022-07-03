public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        // Getting value using object
        System.out.println("name = "+person.getName());
        System.out.println("age = "+person.getAge());
        System.out.println("gender = "+person.getGender());
        System.out.println("=================================================");
        System.out.println(person );
        System.out.println("=================================================");

        // Setting value using object
        person.setName("vidhi");
        person.setAge(25);
        person.setGender("Female");
        System.out.println(person );
    }
}
