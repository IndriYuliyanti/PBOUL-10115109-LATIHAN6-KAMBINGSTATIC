/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10115109.latihan6.kambingstatic;

/**
 *
 * @author User
 */
public class Pboulang10115109Latihan6Kambingstatic {
//variabel jumlahkambing dideklarasikan sbg static
    public static int jumlahKambing;
}
    

public class KambingStatic {
//nama_kambing sbg konstanta
    public static final String NAMA_KAMBING = "midun";
    public static void main(String[] args) {
        Pboulang10115109Latihan6Kambingstatic.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki kambing seanyak" + Pboulang10115109Latihan6Kambingstatic.jumlahKambing);
    }

}
