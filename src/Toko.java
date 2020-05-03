public class Toko {
    String pemilik;
    String alamat;
    String pegawai;
    String telpon ;
    String Email;

    public Toko(){
    }

    void pengenalan (){
        System.out.println("Toko elektronik ini milik "+ pemilik);
        System.out.println("Toko ini beralamatkan di "+ alamat);
        System.out.println("kami mempunyai pegawai berjumlah "+ pegawai);
        System.out.println("kalian bisa menghubungi toko kami lewat telpon "+ telpon + " atau lewat email ini " + Email);
        System.out.println(" ");
    }

    void kipasAngin(){
        System.out.println("Ditoko kami menjual kipas angin dengan berbagai macam merk");
    }
    void kulkas(){
        System.out.println("Kulkas juga ada berbagai macam merk dan tipe seperti 1 pintu atau 2 pintu");
    }
    void telivisi(){
        System.out.println("disini kami cuman menjual telivisi bentuk led aja seperti sony, samsung, sharp, dll..... ");
    }
}

