//interface
public interface Phone {
    int MAX_VOLUME = 100; //Nilai konstanta batas atas volume
    int MIN_VOLUME = 0; //Nilai konstanta batas bawah volume
    void powerOn(); //Metode untuk menyalakan HP
    void poweroff(); //Metode untuk mematikan HP
    void volumeUp(); //Metode untuk menambah volume HP
    void volumeDown(); //Metode untuk mengurangi volume HP
    void getVolume(); //Metode untuk mendapatkan info volume terkini
}
