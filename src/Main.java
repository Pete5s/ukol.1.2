public class Main {
    public static void main(String[] args) {


        Prodejce prodejce = new Prodejce("Vincent Mažňák", "09.11.1975", 5, 10, "Praha", "4S39842", 6.7, "192.168.0.1");
        Prodejce Prodejce = new Prodejce("Donald Vega", "02.03.1985", 3, 6, "Beroun", "5B9654", 4.9, "192.168.0.1");

        double prumerMrkveNaSmlouvu = prodejce.mnozstviMrkveVTunach / prodejce.pocetSmluv;

        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu: " + prumerMrkveNaSmlouvu + " tun.");
    }
}

class Prodejce {
    String jmenoAPrijmeni;
    String datumNarozeni;
    int pocetSmluv;
    int mnozstviMrkveVTunach;
    String nazevMesta;
    String spzVozidla;
    double spotrebaVozidlaNa100Km;
    String ipAdresaPocitace;

    public Prodejce(String jmenoAPrijmeni, String datumNarozeni, int pocetSmluv, int mnozstviMrkveVTunach,
                    String nazevMesta, String spzVozidla, double spotrebaVozidlaNa100Km, String ipAdresaPocitace) {

        this.jmenoAPrijmeni = jmenoAPrijmeni;
        this.datumNarozeni = datumNarozeni;
        this.pocetSmluv = pocetSmluv;
        this.mnozstviMrkveVTunach = mnozstviMrkveVTunach;
        this.nazevMesta = nazevMesta;
        this.spzVozidla = spzVozidla;
        this.spotrebaVozidlaNa100Km = spotrebaVozidlaNa100Km;
        this.ipAdresaPocitace = ipAdresaPocitace;
    }
}
