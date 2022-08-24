package OOP;

//breed->name->age

public class Cats  {
    private String name;
    private String breed;
    private String color;
    private String age;
    public Cats(String name,String breed, String color, String age){ //constructor method , same as class one
        this.name=name;
        this.breed=breed;  //refers to private Strings in cat object
        this.color=color;
        this.age=age;
    }
    public void ourCat(){
        System.out.println("Our cat is: ");
        System.out.println("Name: ".toUpperCase() +name.substring(0, 1).toUpperCase()+ name.substring(1)+", Breed: "+breed+", Color: "+color+", Age: "+age);
         //name.substring(0, 1).toUpperCase()+ name.substring(1) --->starts cats name with upper case.
         //.toUpperCase() --> uses UpperCase
    }

}
