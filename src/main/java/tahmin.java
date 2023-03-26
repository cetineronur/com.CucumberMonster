import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class tahmin  {
    /*
    random olarak 1 ile 100 arasinda bir sayi olusturun kullanicidan bu sayiyi bilmesini isteyin
    kullanici her deger girdiginde tuttugumuz sayi ile karsilastirip tahminini buyult/kucult diyelim
    kullanici tuttugumuz sayiyi bildiginde tahmin sayisini ve
    - 3 veya daha az tahminde bildiyse "Vaowww"
    - 4-8 tahminde bildiyse "Aferin"
    - daha fazla tahminde bildiyse "basarisiz"
    yazdirin
 */
    tahmin(){

    }
    static Scanner scan = new Scanner(System.in);
    public static  void main(String[] args) {
        Vater vater = new Vater();
        //eingang(vater.girilen,  scan ,vater.a, vater.count);
        wiederholen();
        array();
        enYuksekMaas();
        camelKelime();
    }

    private static void camelKelime() {
        String ifade = "ali VELi gEL buRAyA";
        String ifadeYeni="";
        String [] ifadeTeil =ifade.split(" ");

        for (int i = 0; i < ifadeTeil.length ; i++) {
            ifadeTeil[i]= ifadeTeil[i].toLowerCase();
            if(i!=0) {
                ifadeTeil[i]= ifadeTeil[i].toUpperCase().substring(0,1)+ifadeTeil[i].substring(1);
            }
            ifadeYeni+=ifadeTeil[i];
        }
            System.out.println("Camel Ifade = " + ifadeYeni);
    }

    private static void enYuksekMaas() {
        int [] maas = {50,100,200,250,20,90};
        int enYuksek1=0;
        int enYuksek2=0;

        for (int i = 0; i < maas.length-1 ; i++) {
            if (maas[i]>enYuksek1){
                enYuksek2=enYuksek1;
                enYuksek1=maas[i];
            }else if(maas[i]>enYuksek2){
                enYuksek2=maas[i];
            }
        }
        System.out.println("enYuksek1 = " + enYuksek1);
        System.out.println("enYuksek2 = " + enYuksek2);
    }

    private static void eingang(int girilen, Scanner scan, int a, int count){
            System.out.println("Lutfen 1 ile 100 arasinda bir sayi giriniz: ");
            girilen = scan.nextInt();
            count++;
            bewerten(count, a, girilen);
        }

        private static void bewerten(int count, int a, int girilen){
             if (girilen>a){
                 System.out.println("Bitte noch verkleinen ");
                 eingang(girilen, scan,a, count);
                }else if(girilen<a) {
                 System.out.println("Bitte noch vergrossen ");
                 eingang(girilen, scan,a, count);
                 }else  {
                     if(count<=3){
                     System.out.println(count + ". hakkinizda bildiniz waovvv");
                     }else if(count>=4&count<8){
                     System.out.println(count +". hakkinizda bildiniz aferin!..");
                      }else{
                     System.out.println(count+ ". kerede bildiniz basarisiz");
                 }
            }
         }
         private static void wiederholen(){
            int[] array = {7,7,7,8,8,9,6,6,3,7,5};
             List<Integer> list = new ArrayList<>();
             for (int i = 0; i < array.length-1 ; i++) {
                 for (int j = i+1; j < array.length ; j++) {
                     if(array[i]==array[j]){
                         if (!list.contains(array[i])){
                             list.add(array[i]);
                         }
                      }
                }
             }System.out.print(list);
         }
         private static void array(){
             int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7,};
             List<Integer> list=new ArrayList<>();
             int sayac=0;
             int indexBul=1;
             do {
                 int toplam=0;
                 for (int i = 0 ; i <= sayac; i++) {
                     toplam += arr[indexBul-1+i];
                 }
                 sayac++;
                 indexBul += sayac;
                 list.add(toplam);
             } while (sayac < arr.length/2-1);
             System.out.println();
             System.out.println(list);
         }
    }

