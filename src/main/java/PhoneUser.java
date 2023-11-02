public class PhoneUser {
    Phone phone; //atribut phone dengan bertipe Phone, digunakan untuk memanggil interface sehingga metode dari interface Phone bisa terpanggil

    void turnOnThePhone(){ //Metode untuk menyalakan HP
        phone.powerOn(); //Pemanggilan metode yang berada pada interface Phone
    }

    void turnOffThePhone(){ //Metode untuk mematikan HP
        phone.poweroff(); //Pemanggilan metode yang berada pada interface Phone
    }

    void makePhoneLouder(){ //Metode untuk menambah volume
        phone.volumeUp(); //Pemanggilan metode yang berada pada interface Phone
    }

    void makePhoneSilent(){ //Metode untuk mengurangi volume
        phone.volumeDown(); //Pemanggilan metode yang berada pada interface Phone
    }

    void getPhoneVolume(){ //Metode untuk menampilkan volume terkini
        phone.getVolume(); //Pemanggilan metode yang berada pada interface Phone
    }
}
