package soal10;

import soal9.Animal;

/**
 * Created by mirantis on 5/23/17.
 */
public class Dog extends Animal {

    public Dog(String name, boolean isAlive, int age) {
        super(name, isAlive, age);
    }

    public String bark() {
        return "bark";
    }
}
