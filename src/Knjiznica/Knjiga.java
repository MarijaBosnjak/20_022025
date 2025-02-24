package Knjiznica;

public class Knjiga implements PosudbaKnjige,Comparable<Knjiga>{
    String naslovKnjige;
    String dostupnost;

    public Knjiga(String naslovKnjige, String dostupnost) {
        this.naslovKnjige = naslovKnjige;
        this.dostupnost = dostupnost;
    }

    @Override
    public void posudivanjeKnjige() {

    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslovKnjige='" + naslovKnjige + '\'' +
                ", dostupnost='" + dostupnost + '\'' +
                '}';
    }

    @Override
    public void vracanjeKnjge() {

    }

    @Override
    public int compareTo(Knjiga o) {
        return  this.naslovKnjige.compareTo(o.naslovKnjige);
    }
}
