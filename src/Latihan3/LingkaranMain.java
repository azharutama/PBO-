package Latihan3;
public class LingkaranMain {
    public static void ubahJari2(Lingkaran obj) {
        obj.setJari2(4);
    }



    public static void main(String[] args) {

        //slide 8 dan 9
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;
        System.out.println(l1.getJari2()); // 5
        System.out.println(l2.getJari2()); // 5
        l2.setJari2(10);
        System.out.println(l1.getJari2()); // 10
        System.out.println(l2.getJari2()); // 10

        System.out.println(" ");

        //slide 10-11

        Lingkaran l3 = new Lingkaran(7);
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
        l2 = l3;
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());

        System.out.println(" ");
        //slide 12-14

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
        l2 = null; //l2 tidak lagi mereferensi ke objek Lingkaran
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2()); //Error
        System.out.println(l3.getJari2());

        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
        l2 = null;
        System.out.println(l1.getJari2());
        if (l2 != null) System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
        l1 = null;
        l2 = null;
        l3 = null;

       //latihan lingkaran

            System.out.println(l1.getJari2()); //5
            System.out.println(l2.getJari2()); //5
            ubahJari2(l2);
            System.out.println(l1.getJari2()); //4
            System.out.println(l2.getJari2());	 //4
        }





    }



