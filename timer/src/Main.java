


public class Main {
    public static void main(String[] args) {

        vakit vkt =new vakit();


        vkt.saat=23;
        vkt.dakika=59;
        vkt.saniye=59;

        int counter =0;

        while(counter<100) {
            vkt.sureyiyazma();
            vkt.ilerleme();


            counter++;
        }






    }
}
