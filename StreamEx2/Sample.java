package StreamEx2;

import java.util.*;
import java.util.stream.Collectors;

public class Sample {
    private final List<User> userList = Arrays.asList(
            new User(1, "Michael", "Robert", 37, "TR"),
            new User(2, "Mary", "Patricia", 11, "EN"),
            new User(3, "John", "Michael", 5, "FR"),
            new User(4, "Jennifer", "Linda", 77, "TR"),
            new User(5, "William", "Elizabeth", 23, "US"),
            new User(6, "Sue", "Jackson", 11, "IT"),
            new User(7, "Michael", "Tommy", 37, "EN")
    );

    public static void main(String... args) {
        Sample sample = new Sample();

      sample.test1();

    }
private void test1(){

        userList.forEach(System.out::println);
    }

    private void test2(){
       userList.stream()
               .map(x ->{
                   return new User(
                           x.getId(),
                           x.getFirstName(),
                           x.getLastName(),
                           x.getAge() + 10,
                           x.getNationality());
               })
               .toList()
               .forEach(System.out::println);

    }
    private void test3(){
        userList.stream()
                .sorted(Comparator.comparing(User::getAge))
                .forEach(System.out::println);
    }
private void test4(){

    userList.stream()
            .sorted(Comparator.comparing(User::getAge)
                    .thenComparing(User::getFirstName)
                    .thenComparing(User::getLastName))
            .forEach(System.out::println);
    }
   private void test5(){

        double age = userList.stream()
                .mapToInt(User::getAge)
                .average()
                .orElse(0.0);
       System.out.println( age);

       int length = userList.stream()
               .mapToInt(x -> x.getFirstName().length())
               .summaryStatistics()
               .getMax();
       System.out.println(length);
   }
    private void test6(){

        userList.stream()
                .filter(x -> x.getAge() > 6)
                .forEach(System.out::println);
    }
  private void test7(){

        char s = 'S';

        userList.stream()
                .filter(x -> x.getFirstName().startsWith(String.valueOf(s)))
                .forEach(System.out::println);
    }
     private void test8(){

         List<User> list = userList.stream()
                 .collect(Collectors.toCollection(LinkedList::new ));
         System.out.println(list);
    }
private void test9(){

        Set<String> strings = userList.stream()
                .map(User::getNationality)
                .collect(Collectors.toSet());

        int nation = strings.size();
        System.out.println(nation);

    }


    private void test10(){

        char m = 'M';

        userList.stream()
            .filter(x -> x.getAge() > 10)
                .filter(x -> !x.getFirstName().startsWith(String.valueOf(m)))
                .forEach(System.out::println);
}

}



