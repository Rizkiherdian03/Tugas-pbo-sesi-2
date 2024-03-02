// Nama : M. Rizki Herdian
// Kelas : TI 22 J
// NIM : 20220040018


public class Komputer{ //>>>>>>>> NO 1 Adalah ( Class Declaration )

    String jenis_komputer; //>>>>>>> NO 2 (Instance Variables (Atribut))
    private String merk; /////////////////////

    public void setDataKomputer(String jenis, String merk){ /////// NO 3 (Setter Method)
        jenis_komputer = jenis; ///////////////////////////////////
        this.merk = merk; /////////////////////////////////////////
    }

    public String getJenis (){ //////////// NO 4 (Getter Method)
        return jenis_komputer; ////////////////////////////
    }

    public String getMerk(){ ///////////////// NO 5 (Getter Method)
        return merk; ////////////////////////////////////////

    }

    public static void main(String[] args) {
        Komputer mykom = new Komputer (); ///////////////////////////// NO 6 (Main Method)(Membuat objek mykom dari kelas Komputer)
        mykom.setDataKomputer("Laptop","Lenovo"); ////////// NO 7 (Main Method) (Mengatur nilai jenis dan merk komputer menggunakan method setDataKomputer)

        System.out.println(mykom.getJenis()); //////////////// NO 8 (Main Method)(Mencetak jenis komputer menggunakan method getJenis dan method getMerk)
        System.out.println(mykom.getMerk()); ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        
    }
}
