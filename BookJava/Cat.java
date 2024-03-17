package BookJava;

public class  Cat extends Animal {



    @Override
    void doit() {
        System.out.println("Вася хочет пить");
    }

    Cat(String name, int leg, int teeth, int age){
      super(name, leg, teeth, age);


  }



}
