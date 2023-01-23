
public class Generics <T extends Animals> {

    T what;

    public Generics(T what) {
        this.what = what;
    }


}

 class Cats <T extends Animals>{

   T cat;

    public Cats(T cat) {
        this.cat = cat;
    }

public String makeSound(){
    return this.cat + " !!!!";
}

}

 class Animals {

    private String sound;

    public Animals(String sound) {
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(this.sound + "!!!!");
    }

}