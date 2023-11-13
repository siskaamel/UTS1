import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {

        // mengkonversi nilai suhuu celcius ke fahrenheit
        // dengan nilai suhu celcius 20 derajat celcius
        // divalidasi apakah merupakan kelipatan 2 dan 5
        // jika benar tampilkan hasil konversi beserta status kelipatannya


        Scanner Input = new Scanner(System.in);
        System.out.println("masukkan jenis suhu (Fahrenheit/F/Reamur/R: ");
        char jenisSuhu= Input.next().charAt(0);
        System.out.println("masukkan nilai suhu celcius: ");
        double suhucelcius = Input.nextDouble();
        double hasilkonversi = 0;
        if (jenisSuhu == 'F' || jenisSuhu == 'f'){
            hasilkonversi = (suhucelcius * 9 / 5) + 32;
        } else if (jenisSuhu == 'R' || jenisSuhu == 'r'){
            hasilkonversi = suhucelcius *4 / 5;
        }else {
            System.out.println("jenis program tidak valid. program berhenti.");
            System.exit(0);
        }
        System.out.println("hasil konversi: " + hasilkonversi);

        //validasi kelipatan 2 dan 5
        if (hasilkonversi % 2 == 0 && hasilkonversi % 5== 0){
            System.out.println("hasil konversi adalah kelipatan 2 dan 5.");
        }else{
            System.out.println("hasil konversi bukan kelipatan 2 dan 5.");
        }
        Input.close();
    }
}



