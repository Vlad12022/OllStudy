package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        list1.add(0, "����");
        list1.add(1, "����");
        list1.add(2, "�����");
        list1.add(3, "����");

        for (String s : list1) {
            System.out.println(s);
        }
    }
}

