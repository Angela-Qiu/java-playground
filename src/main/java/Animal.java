public abstract class Animal implements Action{
    //"implements" bc interface Actions has no implementations
    protected String name;
    protected int age;
    //"private" would not allow access from derive class
    //use "protected" in access modifier

    //public abstract void play(); //this play function here should never be called

    //when using <abstract>, functions should not have any implementations
    //when there are some functions that are abstract, the whole class has to become abstract as well
    //a class is abstract means u cannot create an object from abstract class ( class is not complete

    //when interface "Actions" is created, play function here can be removed

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
