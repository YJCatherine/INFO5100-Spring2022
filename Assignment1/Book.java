public class Book {

    private String name;
    private int bookID;
    private String genres;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public static void main(String[] args){
        Book book = new Book();
        book.setName("Application Engineer & Dev");
        book.setBookID(5100);
        book.setGenres("Great");
        book.setPrice(100);
        System.out.println("Book Details: " + book.getName() + " | " + book.getBookID() + " | " + book.getGenres() + " | " + book.getPrice());

    }

}
