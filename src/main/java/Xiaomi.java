public class Xiaomi implements Phone { //Mengimplementasikan interface dari Phone
    public boolean isPowerOn; //Atribut bertipe boolean, digunakan untuk menyimpan status ponsel
    public int volume; //Atribut bertipe integer, digunakan untuk menyimpan volume ponsel

    public Xiaomi() { //Konstruktor untuk menginisialisasi atribut
        this.isPowerOn = true;
        this.volume = 0;
    }

    @Override
    public void powerOn() { //Metode untuk menghidupkan HP
        isPowerOn = true;
        System.out.println("Handphone Xiaomi berhasil dinyalakan!");
    }

    @Override
    public void poweroff() { //Metode untuk mematikan HP
        isPowerOn = false;
        System.out.println("Handphone Xiaomi berhasil dimatikan!");
    }

    @Override
    public void volumeUp() { //Metode untuk menambah volume HP
        if (isPowerOn && volume < MAX_VOLUME) {
            volume++;
            System.out.println("Volume dinaikkan ke " + volume);
            //Ketika kondisi HP menyala dan tidak lebih dari nilai konstanta MAX_VOLUME maka volume bisa ditambahkan
        } else {
            System.out.println("Volume tidak berhasil dinaikkan");
            //Ketika kondisi tidak terpenuhi maka volume tidak bisa ditambahkan
        }
    }

    @Override
    public void volumeDown() { //Metode untuk mengurangi volume HP
        if (isPowerOn && volume > MIN_VOLUME) {
            volume--;
            System.out.println("Volume diturunkan ke " + volume);
            //Ketika kondisi HP menyala dan lebih dari nilai konstanta MIN_VOLUME maka volume bisa dikurangi
        } else {
            System.out.println("Volume tidak berhasil diturunkan");
            //Ketika kondisi tidak terpenuhi maka volume tidak bisa diturunkan
        }
    }

    @Override
    public void getVolume(){ //Metode untuk menampilkan kondisi volume terkini
        System.out.println("Volume saat ini : " + volume);
    }
}

