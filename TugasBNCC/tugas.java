package TugasBNCC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class tugas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu;
        ArrayList<Karyawan> karyawans = new ArrayList<>(); 
        do
        {
            System.out.println("----Menu bar----");
            System.out.println("1. Insert Data");
            System.out.println("2. View Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.err.println("Press any number beside 1-4 to exit");
            menu = scan.nextInt();
            scan.nextLine();
            if(menu == 1)
            {
                Karyawan karyawan = new Karyawan(); 
                do
                {
                    System.out.println("Input nama karyawan [>=3]");
                    karyawan.nama = scan.nextLine();   
                }
                while(karyawan.nama.length()<3);
                do
                {
                    System.out.println("Input jenis kelamin[Laki - Laki | Perempuan");
                    karyawan.gender = scan.nextLine();
                }
                while(!(karyawan.gender.compareTo("Laki-laki")==0 || karyawan.gender.compareTo("Perempuan")==0));
                String[] occupation = {"Manager", "Supervisor", "Admin"};
                int flag=1;
                do
                {
                    System.out.println("Input jabatan [Manager | Supervisor | Admin");
                    karyawan.jabatan = scan.nextLine();
                    flag = 1;
                    Integer gaji=0;
                    for(int i=0; i<3; i++)
                    {
                        if(karyawan.jabatan.compareTo(occupation[i])==0)
                        {
                            flag = 0;
                            if(i==0)
                            {
                                gaji = 8000000;
                            }
                            else if(i==1)
                            {
                                gaji = 6000000;
                            }
                            else if(i==2)
                            {
                                gaji = 4000000;
                            }
                            karyawan.gaji = gaji;
                            break;
                        }      
                    }
                }
                while(flag==1);
                karyawan.kode="";
                for(int i=0; i<2; i++)
                {
                    Character abjad = (char)((int)(Math.random() * (25 - 0 + 1)) + 'A');
                    karyawan.kode = karyawan.kode.concat(abjad.toString());
                    System.out.println(abjad);
                }
               
                karyawan.kode = karyawan.kode.concat("-");
                for(int i=0; i<4; i++)
                {
                    Integer number = ((int)(Math.random() * (9 - 0 + 1)) );
                    karyawan.kode = karyawan.kode.concat(number.toString());
                }
                karyawans.add(karyawan);
                int worker = karyawans.size();
                if(worker>3)
                {
                    Integer bonus=0;
                    double persentase = 0.00;
                    if(karyawan.jabatan.compareTo("Manager")==0)
                    {
                        persentase = 0.1;
                    }
                    else if(karyawan.jabatan.compareTo("Supervisor")==0)
                    {
                        persentase = 0.075;
                    }
                    else
                    {
                        persentase = 0.05;
                    }
                    for(int i=0; i<worker-1; i++)
                    {
                        bonus = (int)(karyawans.get(i).gaji * persentase);
                        karyawans.get(i).gaji += bonus;
                        System.out.println(karyawans.get(i).gaji);
                    }
                    
                }               
            }
            else if(menu == 2)
            {
                ArrayList<Karyawan> karyawansTemp = karyawans;
                Collections.sort(karyawansTemp, Karyawan.karyawanNameComparator);
                System.out.printf("|%-4s|%-17s|%-30s|%-15s|%-14s|%-13s|\n", "No" , "Kode Karyawan", "Nama Karyawan", "Jenis Kelamin", "Jabatan", "Gaji Karyawan");
    
                for(int i=0; i<karyawansTemp.size(); i++)
                {
                    System.out.printf("|%4d|%17s|%30s|%15s|%14s|%13d|\n", i+1, karyawansTemp.get(i).kode , karyawansTemp.get(i).nama, karyawans.get(i).gender, karyawans.get(i).jabatan, karyawans.get(i).gaji); 
                }
            }
            else if(menu == 3)
            {
                ArrayList<Karyawan> karyawansTemp = karyawans;
                Collections.sort(karyawansTemp, Karyawan.karyawanNameComparator);
                System.out.printf("|%-4s|%-17s|%-30s|%-15s|%-14s|%-13s|\n", "No" , "Kode Karyawan", "Nama Karyawan", "Jenis Kelamin", "Jabatan", "Gaji Karyawan");
                for(int i=0; i<karyawansTemp.size(); i++)
                {
                    System.out.printf("|%4d|%17s|%30s|%15s|%14s|%13d|\n", i+1, karyawansTemp.get(i).kode , karyawansTemp.get(i).nama, karyawans.get(i).gender, karyawans.get(i).jabatan, karyawans.get(i).gaji); 
                }
                System.out.println("Masukkan no yang ingin diganti\n");
                int indexkaryawan = scan.nextInt() - 1;
                scan.nextLine();
                Karyawan karyawan = new Karyawan(); 
                do
                {
                    System.out.println("Input nama karyawan [>=3]");
                    karyawan.nama = scan.nextLine();   
                }
                while(karyawan.nama.length()<3);
                do
                {
                    System.out.println("Input jenis kelamin[Laki - Laki | Perempuan");
                    karyawan.gender = scan.nextLine();
                }
                while(!(karyawan.gender.compareTo("Laki-laki")==0 || karyawan.gender.compareTo("Perempuan")==0));
                String[] occupation = {"Manager", "Supervisor", "Admin"};
                int flag=1;
                do
                {
                    System.out.println("Input jabatan [Manager | Supervisor | Admin");
                    karyawan.jabatan = scan.nextLine();
                    flag = 1;
                    Integer gaji=0;
                    for(int i=0; i<3; i++)
                    {
                        if(karyawan.jabatan.compareTo(occupation[i])==0)
                        {
                            flag = 0;
                            if(i==0)
                            {
                                gaji = 8000000;
                            }
                            else if(i==1)
                            {
                                gaji = 6000000;
                            }
                            else if(i==2)
                            {
                                gaji = 4000000;
                            }
                            karyawan.gaji = gaji;
                            break;
                        }      
                    }
                }
                while(flag==1);
                karyawan.kode="";
                for(int i=0; i<2; i++)
                {
                    Character abjad = (char)((int)(Math.random() * (25 - 0 + 1)) + 'A');
                    karyawan.kode = karyawan.kode.concat(abjad.toString());
                    System.out.println(abjad);
                }
               
                karyawan.kode = karyawan.kode.concat("-");
                for(int i=0; i<4; i++)
                {
                    Integer number = ((int)(Math.random() * (9 - 0 + 1)) );
                    karyawan.kode = karyawan.kode.concat(number.toString());
                }
                karyawans.get(indexkaryawan).setnama(karyawan.nama);
                karyawans.get(indexkaryawan).setkode(karyawan.kode);
                karyawans.get(indexkaryawan).setgender(karyawan.gender);
                karyawans.get(indexkaryawan).setjabatan(karyawan.jabatan);
                karyawans.get(indexkaryawan).setgaji(karyawan.gaji);
            }
            else if(menu == 4)
            {
                ArrayList<Karyawan> karyawansTemp = karyawans;
                Collections.sort(karyawansTemp, Karyawan.karyawanNameComparator);
                System.out.printf("|%-4s|%-17s|%-30s|%-15s|%-14s|%-13s|\n", "No" , "Kode Karyawan", "Nama Karyawan", "Jenis Kelamin", "Jabatan", "Gaji Karyawan");
                // print tabel
                for(int i=0; i<karyawansTemp.size(); i++)
                {
                    System.out.printf("|%4d|%17s|%30s|%15s|%14s|%13d|\n", i+1, karyawansTemp.get(i).kode , karyawansTemp.get(i).nama, karyawans.get(i).gender, karyawans.get(i).jabatan, karyawans.get(i).gaji); 
                } 
                System.out.println("Masukkan no yang ingin diganti");
                int indexdiganti = scan.nextInt() - 1;
                scan.nextLine();
                karyawans.remove(indexdiganti);
            }

        }
        while(menu >= 1 && menu <=4);
    }
}
