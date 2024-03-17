package BookJava;

public class ParametriMetoda {
    public static void main(String[] args) {

    Person1 person = new Person1();
    person.setName("Влад",22);
    Person1 person1 = new Person1();
    person1.setName("Глеб", 15);
    person.speak();
    person1.speak();




    }




}
class Person1{

String name;
int age;

   void setName(String username, int userAge){
       name = username;
       age = userAge;
   }

void speak(){
    System.out.println(" Меня зовут " + name + " мне " + age + " лет ");
}


}