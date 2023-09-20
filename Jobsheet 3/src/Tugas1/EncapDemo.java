package Tugas1;
public class EncapDemo {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age >= 18 && age <= 30) {
            return age;
        } else {
            return -1;
        }
    }

    public void setAge(int newAge) {
        age = newAge;
    }
}
