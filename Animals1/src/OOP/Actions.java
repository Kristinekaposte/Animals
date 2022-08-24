package OOP;

public class Actions extends Cats {// will be able to inherit parameters from Cat class
    private int speed;
    public Actions(String name, String breed, String color, String age, int speed){
    super (name,breed,color, age); //has access to private in a way
    this.speed=speed;

    }
    @Override
    public void ourCat(){ //to work need to do override cuz same method name
        super.ourCat();
        System.out.println("Cat runs with speed of: "+speed + " km/h");
    }

}
