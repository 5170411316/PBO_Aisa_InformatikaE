
package program_tugas;
import java.util.*;

/**
 *
 * @author Bismillah
 */
public class MHS {
    private String nim;
    private String nama, ipk;
    public static List<MHS> sMhs = new ArrayList<>();
    

    public MHS() {
    }
        
    public MHS(String nim, String nama, String ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }
    
    public void sortIpk() {
        Collections.sort(sMhs, new Comparator<MHS>(){
            @Override
            public int compare(MHS t, MHS t1) {
                return t.getIpk().compareTo(t1.getIpk());
            }
        });
        
        for (MHS mahasiswa : sMhs) {
            System.out.println(mahasiswa.getIpk() + " => " + mahasiswa.getIpk());
        }
    }
    
    
    public void sortNama() {
        Collections.sort(sMhs, new Comparator<MHS>(){
            @Override
            public int compare(MHS t, MHS t1) {
                return t1.getNama().compareTo(t.getNama());
            }
            
        });
        
        for (MHS mahasiswa : sMhs) {
            System.out.println(mahasiswa.getNama() + " => " + mahasiswa.getNama());
        }
    }
    
    public void sortNim() {
        Collections.sort(sMhs, new Comparator<MHS>(){
            @Override
            public int compare(MHS t, MHS t1) {
                return t.getNim().compareTo(t1.getNim());
            }
            
        });
        
        for (MHS mahasiswa : sMhs) {
            System.out.println(mahasiswa.getNim() + " => " + mahasiswa.getNim());
        }
    }
    
    public void isiData(String nim, String nama, String ipk) {
        sMhs.add(new MHS(nim, nama, ipk));
        //System.out.println(nama);
    }
    
    public void tampilData() {
        int i=1;
        for (MHS mahasiswa : sMhs) {
            System.out.println("Data ke - " + i++);
            System.out.println("Nim  : " + mahasiswa.nim);
            System.out.println("Nama : " + mahasiswa.nama);
            System.out.println("IPK  : " + mahasiswa.ipk);
        }
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getIpk() {
        return ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

    @Override
    public String toString() {
        String str = "Nim: " + nim + "\n" +
                "Nama: " + nama + "\n" + 
                "IPK: " + ipk;
        return str;
    }
    
    
}
