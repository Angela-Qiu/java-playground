public class Toy implements Action{
    //meaning Toy implements all the functions in Action
    //a toy is not animal so we cannot do "extends Animal"
    private String brand;

    public Toy(String brand) {
        this.brand = brand;
    }

    @Override
    public void play(){
        System.out.println("TOY of brand " + brand + " is making some weird sound");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Toy of brand" + brand + " is happy to see another toy " + toy);
    }

    //every class in java has a common base class: Object
    //in this base class, a function is called toString
    //implement toString function to print out sth by variable name of an object in a class
    @Override
    public String toString() {
        return brand;
    }
}

