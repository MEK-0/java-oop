


public class Main {
    public static void main(String[] args) {

        vakit vkt =new vakit();


        vkt.saat=23;
        vkt.dakika=59;
        vkt.saniye=59;

        int counter =0;

 // saniyenin +1 artışı saniyede 1 olacak şekilde değildir 
 // while true olarak yazılırsa saat, dakika ve saniyenin tam olarak çalıştığına bakılabilir  
        
        while(counter<100) {
            vkt.sureyiyazma();
            vkt.ilerleme();


            counter++;
        }






    }
}
