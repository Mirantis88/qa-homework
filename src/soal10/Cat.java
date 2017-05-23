package soal10;

import soal9.Animal;

/**
 * Created by mirantis on 5/23/17.
 */
public class Cat extends Animal {

    public Cat(String name, boolean isAlive, int age) {
        super(name, isAlive, age);
    }
    public String meow(){
        return "meow";
    }

}
