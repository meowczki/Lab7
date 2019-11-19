public class Tenisista implements Comparable<Tenisista> {
    private int miejsce;
    private String kraj;
    private String imie;
    private String nazwisko;
    private int wiek;
    private int punkty;
    private int liczbaTurnieji;

    @Override
    public String toString() {
        return "Tenisista{" +
                "miejsce=" + miejsce +
                ", kraj='" + kraj + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", punkty=" + punkty +
                ", liczbaTurnieji=" + liczbaTurnieji +
                '}';
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Tenisista() {
    }

    public int getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(int miejsce) {
        this.miejsce = miejsce;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public int getLiczbaTurnieji() {
        return liczbaTurnieji;
    }

    public void setLiczbaTurnieji(int liczbaTurnieji) {
        this.liczbaTurnieji = liczbaTurnieji;
    }

    public Tenisista(int miejsce, String kraj, String imie, String nazwisko, int wiek, int punkty, int liczbaTurnieji) {

        this.miejsce = miejsce;
        this.kraj = kraj;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.punkty = punkty;
        this.liczbaTurnieji = liczbaTurnieji;
    }

    @Override
    public int compareTo(Tenisista o) {
        return Integer.compare(wiek,o.wiek);
    }
}
