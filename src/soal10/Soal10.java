package soal10;

/**
 * Created by mirantis on 5/23/17.
 */
public class Soal10 {

    public static void main(String[] args) {
        Cat cat = new Cat("Sophie", true, 10);
        Dog dog = new Dog("Indra", false, 24);

        String catName = cat.getName();
        boolean isCatAlive = cat.isAlive();
        int catAge = cat.getAge();

        String dogName = dog. getName();
        boolean isDogAlive = dog.isAlive();
        int dogAge = cat.getAge();

        System.out.println("Cat, name = " + catName + ", isAlive = " + isCatAlive + ", age = " + catAge);
        System.out.println("Dog, name = " + dogName + ", islive = " + isDogAlive + ", age = " + dogAge);
    }
}
