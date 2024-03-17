package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add(0, "Влад");
        list1.add(1, "Анна");
        list1.add(2, "Игорь");
        list1.add(3, "Глеб");

        for (String s : list1) {
            System.out.println(s);
        }
    }
}

