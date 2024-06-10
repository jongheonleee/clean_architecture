package chapter03.ocp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Ocp_01 {

    public void print(List<Character> list) {
        Iterator it = list.iterator();
        while(it.hasNext()) {
            char next = (char)(it.next());
            System.out.println(next);
        }
    }

    private void print() {
        List list = new ArrayList<>();
        String s = "HELLO";

        for (char ch : s.toCharArray()) {
            list.add(ch);
        }

        print(list);
    }
}
