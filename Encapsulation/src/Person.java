public class Person {

    private String name;
    private int age;
    private String gender;

    public Person()
    {
        this.name = "vini";
        this.age = 22;
        this.gender = "Female";
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean setAge(int age) {
        if(age >= 0 && age <=100)
        {
            this.age = age;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
