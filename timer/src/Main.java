


public class Main {
    public static void main(String[] args) {

        vakit vkt =new vakit();


        vkt.saat=23;
        vkt.dakika=59;
        vkt.saniye=59;

       

 
 // while true olarak yazılırsa saat, dakika ve saniyenin tam olarak çalıştığına bakılabilir  
        
        while(true) {
            vkt.sureyiyazma();
            vkt.ilerleme();


           
        }






    }
}
