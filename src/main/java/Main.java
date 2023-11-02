import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pilihan; //Deklarasi variabel pilihan
        boolean keluar = false; //Deklarasi variabel keluar
        Scanner scanner = new Scanner(System.in);
        PhoneUser user = new PhoneUser();
        Phone xiaomi = new Xiaomi();
        Phone oppo = new Oppo();
        Phone iphone = new iPhone();
        Phone samsung = new Samsung();

        System.out.println("1. Xiaomi");
        System.out.println("2. Oppo");
        System.out.println("3. iPhone");
        System.out.println("4. Samsung");
        System.out.print("Pilih Handphone yang diinginkan (1-4) : ");
        pilihan = scanner.nextInt();

        //Percabangan hasil dari inputan user untuk memilih HP
        if (pilihan == 1){
            user.phone = xiaomi; //Pemanggilan kelas PhoneUser dengan objek user yang nantinya akan diarahkan ke kelas Xiaomi
            user.turnOnThePhone(); //Pemanggilan kelas PhoneUser dengan objek user dan memanggil metode untuk menyalakan HP
        } else if (pilihan == 2) {
            user.phone = oppo; //Pemanggilan kelas PhoneUser dengan objek user yang nantinya akan diarahkan ke kelas Oppo
            user.turnOnThePhone(); //Pemanggilan kelas PhoneUser dengan objek user dan memanggil metode untuk menyalakan HP
        } else if (pilihan == 3) {
            user.phone = iphone; //Pemanggilan kelas PhoneUser dengan objek user yang nantinya akan diarahkan ke kelas iPhone
            user.turnOnThePhone(); //Pemanggilan kelas PhoneUser dengan objek user dan memanggil metode untuk menyalakan HP
        } else if (pilihan == 4) {
            user.phone = samsung; //Pemanggilan kelas PhoneUser dengan objek user yang nantinya akan diarahkan ke kelas Samsung
            user.turnOnThePhone(); //Pemanggilan kelas PhoneUser dengan objek user dan memanggil metode untuk menyalakan HP
        }


        //Implementasi do while untuk menampilkan menu pada HP
         do{
             System.out.println("1. Tambah Volume");
             System.out.println("2. Kurangi Volume");
             System.out.println("3. Cek Volume");
             System.out.println("4. Matikan HP");
             System.out.print("Apa yang ingin dilakukan? (1-4) : ");
             pilihan = scanner.nextInt();
             if (pilihan == 1){
                 user.makePhoneLouder(); //Pemanggilan kelas PhoneUser dengan objek user dan memanggil metode untuk menaikkan volume
             } else if (pilihan == 2) {
                 user.makePhoneSilent(); //Pemanggilan kelas PhoneUser dengan objek user dan memanggil metode untuk mengurangi volume
             } else if (pilihan == 3){
                 user.getPhoneVolume(); //Pemanggilan kelas PhoneUser dengan objek user dan memanggil metode untuk menampilkan informasi volume
             } else if (pilihan == 4) {
                 user.turnOffThePhone(); //Pemanggilan kelas PhoneUser dengan objek user dan memanggil metode untuk mematikan HP
                 keluar = true; //Statement untuk memberhentikan program ketika HP sudah mati
             } else {
                 System.out.println("Pilihan tidak valid!");
             }
         }while(!keluar); //kondisi ketika dalam ranah do bernilai false maka perulangan akan berhenti
    }
}
