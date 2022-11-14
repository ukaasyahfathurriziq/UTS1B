import java.util.Random;
import java.util.Scanner;

public class Main {
    int JumlahProdi = 3;
    static int totalJumlahMahasiswa = 1050;
    public static String[] TI = new String[500];
    public static String [] DKV = new String[300];
    public static String [] TeknikKomputer = new String[250];

    public static void PrintInfoPendaftaran() {
        int totalTI = 0;
        int totalSisaKuota = 0;
        for (int index = 0; index < TI.length; index++) {
            if (TI[index] != null) {
                totalTI++;
            }
        }
        int totalDKV = 0;
        for (int index = 0; index < DKV.length; index++) {
            if (DKV[index] != null) {
                totalTI++;
            }
        }
        int totalTeknikKomputer = 0;
        for (int index = 0; index < TeknikKomputer.length; index++) {
            if (TeknikKomputer[index] != null) {
                totalTeknikKomputer++;
            }
        }
        totalSisaKuota = totalJumlahMahasiswa - totalTI - totalDKV - totalTeknikKomputer;
        System.out.println("Total Mahasiswa TI : " + totalTI + " | Total Mahasiswa DKV : " + totalDKV + " | Total Mahasiswa Teknik Komputer : " + totalTeknikKomputer);
        System.out.println("Jumlah Seluruh Mahasiswa : " + totalJumlahMahasiswa + " | Total Sisa Kuota : " + totalSisaKuota);
        System.out.println();
    }

    public static void CheckIndexArray(String[] myArray, String mahasiswa){
        int indexNow = 0;
        for(int index = 0; index < myArray.length; index++){
            if(myArray[index] !=null){
                indexNow = index+1;
            }
        }
        if(indexNow < myArray.length){
            myArray[indexNow] = mahasiswa;
        }
    }
    public static void simpanMahasiswa(int angkaRandom, String mahasiswa){
        switch (angkaRandom){
            case 1:
                CheckIndexArray(TI,mahasiswa);
                System.out.println("Anda Mendapat Nik : TI22"+ angkaRandom);
                PrintInfoPendaftaran();
                break;
            case 2:
                CheckIndexArray(DKV,mahasiswa);
                System.out.println("Anda Mendapat Nik : DK22"+ angkaRandom);
                PrintInfoPendaftaran();
                break;
            case 3:
                CheckIndexArray(TeknikKomputer,mahasiswa);
                System.out.println("Anda Mendapat Nik : TK22"+ angkaRandom);
                PrintInfoPendaftaran();
                break;
        }
    }
    private static void inputMahasiswa() {
        Scanner inputData = new Scanner(System.in);
        while (true) {
            System.out.println("Nama Mahasiswa : ");
            String namaSiswa = inputData.nextLine();
            System.out.println("Prodi : ");
            String prodi = inputData.nextLine();
            if (namaSiswa.isBlank()) {
                System.out.println("Nama Mahasiswa Wajib Diisi");
                inputMahasiswa();
            } else {
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3) + 1;
                simpanMahasiswa(JenisRandom, namaSiswa);
            }
        }
    }

    public static void main(String[] args) {
        inputMahasiswa();
    }
}


