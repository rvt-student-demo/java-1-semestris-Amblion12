package rvt; // Norāda, ka šī klase pieder pakotnei "rvt"

public class function { // Definē publisku klasi ar nosaukumu "function"
    
    public static void main(String[] args) { // Galvenā metode, kas tiek izsaukta, kad programma tiek palaista
        printUntilNumbers(10); // Izsauc metodi, lai izvadītu skaitļus no 0 līdz 10
    }

    // Metode, kas izvada skaitļus no 0 līdz n (ieskaitot)
    public static void printUntilNumbers(int n) {
        for (int i = 0; i <= n; i += 1) { // Cikls, kas sākas no 0 un palielina i par 1 līdz i sasniedz n
            System.out.println(i); // Izvada pašreizējo i vērtību uz ekrāna
        }
    }
}
