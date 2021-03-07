package TugasBNCC;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Karyawan {
    public String kode;
    public String nama;
    public String gender;
    public String jabatan;
    public Integer gaji;
    public void setnama(String nama)
    {
        this.nama = nama;
    }
    public void setkode(String kode)
    {
        this.kode = kode;
    }
    public void setgender(String gender)
    {
        this.gender = gender;
    }
    public void setjabatan(String jabatan)
    {
        this.jabatan = jabatan;
    }
    public void setgaji(Integer gaji)
    {
        this.gaji = gaji;
    }
    public static Comparator<Karyawan> karyawanNameComparator = new Comparator<Karyawan>(){
        public int compare(Karyawan k1, Karyawan k2) {
          String namaKaryawan1 = k1.nama.toUpperCase();
          String namaKaryawan2 = k2.nama.toUpperCase();
          return namaKaryawan1.compareTo(namaKaryawan2);
        }
      };
}
