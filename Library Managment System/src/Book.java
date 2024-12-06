public class Book {
    private int id;
    private String baslik;
    private String yazar;
    private boolean durum;

    public Book(int id, String baslik, String yazar) {
        this.id = id;
        this.baslik = baslik;
        this.yazar = yazar;
        this.durum = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return baslik;
    }

    public String getAuthor() {
        return yazar;
    }

    public boolean isBorrowed() {
        return durum;
    }

    public void borrowBook() {
        durum = true;
    }

    public void returnBook() {
        durum = false;
    }

    @Override
    public String toString() {
        return "Kitap ID: " + id + ", Kitap Adı: " + baslik + ", Yazar: " + yazar + ", Kitap Durumu: " + (durum ? "Müsait Değil" : "Müsait");
    }
}
