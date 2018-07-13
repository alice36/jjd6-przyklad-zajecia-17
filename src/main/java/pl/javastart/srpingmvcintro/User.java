package pl.javastart.srpingmvcintro;

public class User {

    private String imie;
    private String nazwisko;
    private int wiek;

    public User(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + wiek + " lat";
    }
}
