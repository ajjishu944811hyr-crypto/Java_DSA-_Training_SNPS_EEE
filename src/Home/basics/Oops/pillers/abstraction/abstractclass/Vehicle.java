package Home.basics.Oops.pillers.abstraction.abstractclass;

abstract class Vehicle {
    //two types of java
    // 1. Normal or concrete ->> writting code like below it having a body or define in {} braket
    void Vehicle_type() {
        System.out.println("Two Wheeler");
    }


    //2. Abstract Method
    abstract void start();
    //this abstract method will be defined in the child class
    //if there are only abstract methods - 100% abstraction
    //if there is even 1 normal method - not 100% abstraction
}


class Metero350 extends Vehicle {

    @Override
    void start() {
        System.out.println("Meteor350 starts with self.");

    }
}

    class TataHexa extends Vehicle {
        @Override
        void start() {
            System.out.println("Hexa starts with key.");

        }

    }
    class Demo {
        public static void main(String[] args) {
            Metero350 bike = new Metero350();
            TataHexa car = new TataHexa();
            bike.start();
            bike.Vehicle_type();
            car.start();
            car.Vehicle_type();
        }
    }






