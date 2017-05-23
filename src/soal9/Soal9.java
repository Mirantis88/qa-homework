package soal9;

/**
 * Created by mirantis on 5/23/17.
 */
public class Soal9 {

    public static void main(String[] args) {


        Animal hewan = new Animal("Tikus", true, 5);
        Animal kucing = new Animal("Tom", false, 7);

        System.out.println(hewan.getName());
        System.out.println(hewan.getAge());
        hewan.setAge(9);
        System.out.println(hewan.getAge());
        System.out.println(kucing.getName());
    }

}
