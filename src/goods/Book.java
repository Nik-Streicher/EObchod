
package goods;

public class Book extends Goods {
    private String author;

    public Book(int price, String name, String author) {
        super(price, name);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}