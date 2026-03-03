package Home.basics.FinalKeyword;

public final class Demo {

}
//cannot be extand a final class
//class A extends Demo{
//
//}
class A {
    void show(){
        System.out.println("Show some data.");
    }
}
class B extends A {
//overriding is not posible
//    @Override
//    void show(){
//
//    }
//}
}

class C {
    //it is constant
   final int x = 200;
//    x = 300;// cannot be assign value to a final variable

    void display (final int x){
        //x = 10;  // Cannot assign a value to final variable 'x
    }
}

