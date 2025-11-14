package rvt;

import java.util.ArrayList;

public class JMArrayList {
    // Klases līmeņa mainīgais vārdu masīvam
    private static String[] words = {"A", "V", "X", "Z", "E", "Q", "L", "M", "N", "O"};

    public static void main(String[] args) {
        onlyTheseNumbers();
        listSize();
        onTheList();
        
        // Izveido ArrayList un izsauc removeLast
        ArrayList<String> strings = new ArrayList<>();
        for (String word : words) {
            strings.add(word);
        }
        removeLast(strings);
    }

    // Metode, kas izvada konkrētus burtus (piemēra realizācija)
    public static void onlyTheseNumbers() {
        System.out.println("Tikai šie burti: A, V, X");
    }

    // Metode, kas izvada vārdu masīva garumu
    public static void listSize() {
        System.out.println("Saraksta garums: " + words.length);
    }

    // Metode, kas pārbauda, vai elements ir sarakstā (piemēra realizācija)
    public static void onTheList() {
        String search = "X";
        boolean found = false;
        for (String word : words) {
            if (word.equals(search)) {
                found = true;
                break;
            }
        }
        System.out.println("Vai " + search + " ir sarakstā? " + found);
    }

    // Metode, kas izņem pēdējo elementu no ArrayList
    public static void removeLast(ArrayList<String> strings) {
        if (!strings.isEmpty()) {
            String removed = strings.remove(strings.size() - 1);
            System.out.println("Izņemts pēdējais elements: " + removed);
        } else {
            System.out.println("Saraksts ir tukšs.");
        }
    }
}