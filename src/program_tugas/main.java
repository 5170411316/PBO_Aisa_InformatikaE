
package program_tugas;

import java.util.*;
/**
 *
 * @author Bismillah
 */
public class main {

    /**
     * @param args
     */
public static void TampilData() {
        
    }
    
    public static void InputData() {
        MHS mahasiswa = new MHS();
        Scanner s = new Scanner(System.in);
        System.out.print("Nim : ");
        String nims = s.nextLine();
        System.out.print("Nama: ");
        String nama = s.nextLine();
        System.out.print("IPK : ");
        String ipk = s.nextLine();
        mahasiswa.isiData(nims, nama, ipk);
    }
    
    public static void main(String[] args) {
        MHS mhs = new MHS();
        int pil = 0;
        do {
            Scanner s = new Scanner(System.in);
            pindah:
            System.out.println("1. Input Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Urut data");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pil = s.nextInt();
            switch (pil) {
                case 1:
                    InputData();
                    break;
                case 2:
                    mhs.tampilData();
                    break;
                case 3:
                    System.out.println("1. Sort By Nim");
                    System.out.println("2. Sort By Nama");
                    System.out.println("3. Sort By IPK");
                    System.out.println("4. Keluar");
                    pil = s.nextInt();
                    if (pil == 1) {
                        mhs.sortNim();
                    } else if (pil == 2) {
                        mhs.sortNama();
                    } else if (pil == 3) {
                        mhs.sortIpk();
                    } 
                    break;
            }        
        } while (pil != 4);
        
        
    }
}
    
    

