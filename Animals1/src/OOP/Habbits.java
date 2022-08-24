package OOP;

public class Habbits extends Actions {// will be able to inherit cat class parameters, also speed from action class
    private String play;
    private String sleep;
    private String eat;
    private String mood;

    public Habbits (String name, String breed, String color, String age, int speed, String mood){
        super (name,breed,color, age, speed);
        this.mood=mood;

    }
   // @Override
    public void ourCat(){ //currently does not override. shows only mood from added parameters
       // super.ourCat();
        System.out.println("Our cat currently is : "+mood);
    }

    public void habbits(String play, String sleep, String eat){ //specific only to Habbits class
        this.play=play;
         this.sleep=sleep;
         this.eat=eat;
        System.out.println("Our cat sleeps at :"+sleep + ", like to play with: "+play+ ", and favorite food is: "+ eat);
    }
}
