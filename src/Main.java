//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ogrenci[] ogrenciler = {
                new Ogrenci("2021101003", "Bilgisayar Mühendisliği"),
                new Ogrenci("Gökhan", "Bilgisayar Mühendisliği", 2020, 0.0),
                new Ogrenci("Ayşe ", "Makine Mühendisliği", 2018, 0.0),
                new Ogrenci("Elif", "Elektrik Elektronik Mühendisliği", 2017, 1.98)

        };
        System.out.println("Öğrenci Bilgileri");
        for (int k = 0; k < ogrenciler.length; k++) {
            System.out.println("OGR-" + (k + 1) + " " + ogrenciler[k]);
            Ogrenci.i++;
        }
        for (int m = 0; m < ogrenciler.length; m++) {
            if (ogrenciler[m].harcHesaplama() > 0)
                System.out.println(m + 1 + ". Öğrencinin ödeyeceği harç :" + ogrenciler[m].harcHesaplama());
        }
    }
}

