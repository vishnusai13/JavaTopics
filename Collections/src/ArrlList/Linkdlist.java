package ArrlList;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkdlist {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("vishnu");
        names.add("purush");
        names.add("neelam");
        names.add("yagnesh");
        names.add("Nani");

        ListIterator<String> it = names.listIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        while (it.hasNext()) {
            String name = it.next();

            if (name.equals("Nani")) {
                it.set("Mahesh");
            }
        }

        System.out.println(names);
    }
}