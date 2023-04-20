public interface Action {
    void play();

    //void pee();
    //this would not compile
    //bc every function in the interface has to be implemented somewhere

    //if add a function here, it should be added in all hierachy/level
    void play(Toy toy);
}
