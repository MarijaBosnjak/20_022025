package Knjiznica;
//Zadatak: Sustav upravljanja knjiznicom
//Napravite jednostavan sustav knjiznice gdje:
//Definirate vlastito sucelje pod nazivom "PosudbaKnjige", koja sadrži
//metode za posuđivanje i vracanje knjige.
//Implementirajte ovo sucelje u klasu knjiga.
//Klasa Knjiga takodertreba implemetirati ugrađeno Java sučelje
//Comparable<Knjiga>, kako bi se knjige sortirale po naslovu.
//U main metodi kreirajte popis knjiga, posudite/vratite knjigu i sortirajte ih
//Zahtjevi:
//Definirajte sučelje PosudbaKnjige s metodama
//void posudiKnjigu();
//void vratiKnjigu();
//Implementirajte ovo sucelje u klasi Knjiga s:
//Atributima: naslovKnjige i status Dostupnosti(je Posudjena).
//Metodom compareTo() za sortiranje knjige abecedno po naslovu
//*U main metodi:
//Kreirajte popis Knjiga.
//Posudite i vratite Knjigu.
//Sortirajte knjige abecedno i prikazite ih.
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Knjiga> knjige=new ArrayList<>();
        knjige.add(new Knjiga("C", "Posudena"));
        knjige.add(new Knjiga("B", "vraceno"));
        knjige.add(new Knjiga("A", "vraceno"));
        Collections.sort(knjige);
        //knjige.sort(na);
        for (Knjiga knjiga : knjige) {
            System.out.println(knjiga);
        }
    }
}
