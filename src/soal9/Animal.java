package soal9;

/**
 * Created by mirantis on 5/23/17.
 */
public class Animal {

    private boolean isAlive;
    private String name;
    private int age;

    public Animal(String name , boolean isAlive, int age) {
        this.name = name;
        this.isAlive = isAlive;
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

