public class Main {
    public static void main(String[] args) {
        // create a Cat object by calling "new"
        Cat coco = new Cat("coco",14);//initialize to this object
        //coco.name = "coco II";
        // you do not want to change the member variable in this way
        // bc this changes the variable from outside the object
        //SOLUTION: change the member variables to "private"
        //this way, you cannot access the variable by the above statement
        //if wants to access/change the name, use setter
        coco.setName("coco II");
        coco.play();
        //System.out.println("there's a cat called " + coco.name + " on the table");
        //cannot get the name this way, use getter
        System.out.println("Main: there's a cat called " + coco.getName() + " on the table");

        Dog max = new Dog("max",5,"Peng");
        max.play();

        Rabbit snowBall = new Rabbit("snow ball",2,"red");

        Toy curiousGeorge = new Toy("ABC corp");

        //Dog and Cat both have name and age, we don't want duplicates
        //put them in a different class: Animal
        //copy and paste name and age variables to Animal class, delete in Cat and Dog class
        //get those variables from the base class"Animal" by adding "extends Animal" in the signature of  Cat and Dog

        /*
        Animal[] animals = new Animal[3];
        animals[0] = coco;
        animals[1] = max;
        animals[2] = snowBall;
         */

        //an array can only have objects that belong to the same type
        //reason for coco and max to be able to put in the same array is
        //they both have the same base class Animal
        //so even tho they are different classes, they have sth in common
        //we can put them in the same array of the type of common class they have

        //when interface Action is created, the type of the above array should change to Action as below
        Action[] homeFriend = new Action[4];
        homeFriend[0] = coco;
        homeFriend[1] = max;
        homeFriend[2] = snowBall;
        homeFriend[3] = curiousGeorge;

        //4 objects in this array, each of diff type
        //only thing common: interface(things in common) -- every object in this array has that function


        for(Action friend: homeFriend){
            friend.play(); //should put a play function in base class
            //this introduces <polymorphism> where animal variable could be anything that has the same base class
            //<polymorphism>: the ability of a class to provide diff implementations of a method,
            // depending on the type of object that is passed to method
        }

        curiousGeorge.play();
        //cannot put curiousGeorge inside the array bc the type of the array is Animal
        //but the type of curiousGeorge is Toy, so there's almost nothing in common
        //only thing in common bt Toy class and Animal class is they both have play function
        //this introduces <interface> - different version of inheritance
        //<interface>: contract bt objects and the outside world
        //it can have some functions in it
        //it is still a class(type) but no implementations

        //<interface> is what the user of the class can see
        //we/main function is a user
        //interface means the way you call the function is the same

        //After the interface added another function
        Toy legoCar = new Toy("Lego Truck");
        //LegoCar is a class

        for(Action friend: homeFriend){
            friend.play(legoCar);
        }
    }
}
