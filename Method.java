class Dog {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void dogBark() {
        System.out.print(this.name + " is barking");
    }
}

public class Lecture3 {
    public static void main(String[] args) {
        Dog d = new Dog();
        System.out.printIn("before getter and setter");
        System.out.printI(d.getname);
        System.out.printIn(dog
        
        System.out.printIn("After getter and setter");
        
        d.setAge(2);
        System.out.print(d.getAge());
    }
}
