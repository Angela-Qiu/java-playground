public class Cat extends Animal{
    //Cat takes everything from Animal
    //Animal implements interface

    //constructor shortcut:
    //code-generate-shift-down arrow-select all fields

    public Cat(String name, int age) {
        /*
        this.name = name;
        this.age = age;
         */

        //these two variables are defined in the base class
        //here in the derive class constructor, we are initializing the variables from the base class
        //prefer way to do:
        super(name, age);
        //should add a constructor in the base class
        //<super>: call the constructor in the base class
    }
    //by extending the base class, you can't access variables in this way: this.name = name with "private" access modifier;
    //bc "private" means variables private to that class, now variables are private to the animal class
    //when access modifier is "protected", can access

    //setter
    public void setName(String name) {
        this.name = name;
        //this means the current object
        //assigning the value from the parameter to the member variable
    }

    public String getName(){
        return name;
    }
    @Override //overriding the play function in the base class
    public void play(){
        System.out.println("CAT: CAT " + name + " jumps on the table");
    }

    //since interface added 1 more function, it should be added here
    //otherwise this class is not complete

    @Override
    public void play(Toy toy){
        System.out.println("CAT: CAT " + name + " is playing the toy " + toy);
        //everything printed here is string, toString function will be called in toy class
    }
    //Each of the above play function are called override
    //but bt them, the first one is override, the second is overload
    //<overload>: same function name, but diff signature
}