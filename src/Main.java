//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//Interface imamo 2 nacina za napraviti, moze biti unutar main
// klase ili napraviti novu klasu u koju ga spremamo
// klase ili napraviti novu klasu u koju ga spremamo
//Kod sucelja nemamo definiranih nekakvih polja
//nekakvih kljucnih rijeci abstract
//negosamo metode neka ponsasanja(ta ponasanjadefiniramo kroz te metode)
interface Zivotinje {
    void glasanje();// kao kod abstraktnih klasa ne moramo imati tijelo metode
//Ova metoda je definaina bez neke logike a mozemo uvijek i dodati neku logiku
}

class Pas implements Zivotinje {
    @Override
    public void glasanje() {
        System.out.println("Wuff Wuff");

    }
}

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Pas pas = new Pas();
        Zivotinje pas1=new Pas();
        pas.glasanje();
        System.out.println("Test");
        pas1.glasanje();
    }
}