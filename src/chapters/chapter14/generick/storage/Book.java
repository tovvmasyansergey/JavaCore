package chapters.chapter14.generick.storage;

public class Book {
    private String tittle;
    private String description;
    private double price;

    public Book(String tittle, String description, double price) {
        this.tittle = tittle;
        this.description = description;
        this.price = price;
    }

    public Book() {

    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
