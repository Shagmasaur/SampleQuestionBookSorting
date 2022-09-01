public class Book
{
    private String BookName;
    private String author;
    private long iSBN;
    private double price;

    public Book(String bookName, String author, long iSBN, double price) {
        BookName = bookName;
        this.author = author;
        this.iSBN = iSBN;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                ", author='" + author + '\'' +
                ", iSBN=" + iSBN +
                ", price=" + price +
                '}';
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getiSBN() {
        return iSBN;
    }

    public void setiSBN(long iSBN) {
        this.iSBN = iSBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
