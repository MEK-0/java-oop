

public class vakit {

    public int saat;
    public int dakika;
    public int saniye;

    // Değişkenleri tanımlıyoruz


    public void ilerleme(){
        // burada saat kısmında bizim manuel olarak kullanacağımız değişken saniye değişkeni
        //saniye değişkenini belli değerlerde kısıtlayıp sıfırlayarak dakika ve saat değerlerini
        //arttıracağız :D

          // saniye değerine bir int değer vermemiz gerekiyor ki sayaç artarken hata çıkmasın

        saniye++;

        // saniye = 0 , saniye+1 ,saniye=60 olduğunda saniye 0 olması lazım ve dakika değeri +1 olması lazım

        if(saniye == 60){
            saniye = 0;

            dakika++;

        if (dakika == 60) {
            dakika = 0;
            saat++;

            if (saat == 24) {
                saat = 0;
            }
        }
        }

    }


    public void sureyiyazma(){

         System.out.printf("vakt =%d--%d--%d \n",saat,dakika,saniye);
    }


}
