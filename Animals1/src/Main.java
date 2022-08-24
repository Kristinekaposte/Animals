import OOP.Actions;
import OOP.Cats;
import OOP.Habbits;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to our cat introduction:".toUpperCase());

        Cats cat1 = new Cats("suzy","persian", "brown", "3");
        Actions cat2 = new  Actions("mark","persian", "brown", "5", 30);
        Actions cat3 = new Actions("opal","sphynx", "white", "2",20);
        Habbits h = new Habbits("Furry","Mixed","red","1",+ 1,"happy"); // needs to show only mood on this line, (does not override)

        cat1.ourCat();
             System.out.println("________________________________");
        cat2.ourCat();
             System.out.println("________________________________");
        cat3.ourCat();
             System.out.println("________________________________");
        h.ourCat();
        h.habbits("ball", " daytime", "fish");



    }
}