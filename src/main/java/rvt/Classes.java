package rvt;

import java.util.ArrayList;

public class Classes {
    ArrayList<Integer> integers = new ArrayList<>();

    public Classes() {
        integers.add(15);
        integers.add(34);
        integers.add(65);
        integers.add(111);

        System.out.println(integers.size());
    }

    public static void main(String[] args) {
        new Classes(); // izsauc konstruktoru
    }
}
