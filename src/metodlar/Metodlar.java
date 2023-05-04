/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodlar;

/**
 *
 * @author melek
 */
public class Metodlar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        sayiBulmaca(); //tanımlanan metod main metodunda çağarıldı
        int toplam=topla(5,7);
        int toplamımız=topla2(1,2,3,4,5,6,7,8); //variable argument
        System.out.println(toplamımız);


    }
    public static void sayiBulmaca(){ //metot tanımlama
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacak=6;
        boolean varMi=false;
        for(int sayi:sayilar){
            if(sayi==aranacak){
                varMi=true;
                break;
            } else {
            }
            
        }
        String mesaj;
        if(varMi=true){
            mesaj="sayı mevcuttur"+aranacak;
           mesajVer(mesaj);
        }else{
            mesaj="sayı mevcut değildir"+aranacak;
            mesajVer(mesaj);
        }
    
    }

    public static void mesajVer(String mesaj){ //void fonksiyonlar bir eylemin yapılmasını sağlar
    
        System.out.println(mesaj); //ekrana mesaj yazması sonuç döndürdüğü anlamına gelmez
        //void olan fonksiyonlar bir değere atanmaz
        return; //bitir demek
    }

    public static int topla(int a, int b){ //void yerine int yazdık.bu fonksiyon geriye integer türünde bir değer döndürür
        return a+b; //bitir ve 5 sayısını döndür

    }

    public static String sehirVer(){
        String sehir = "ankara";
        return null;

    }

    public static int topla2(int... sayilar){ //variable arguments.
        // üç nokta birden fazla integer sayı göndereceğimizi gösterir.İstediğimiz kadar sayı gönderebiliriz
        //java girilen integer değerleri bir integer arraya çevirir.
        //integer array üzerinde gezinmek için for döngüsünü kullanabiliriz
        //nesne gönderdiğimizde yapıların test edilebilirliği zayıfladığı için variable argument yerine koleksiyon kullanımı tercih edilir
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;

        
        
    }
    
}
