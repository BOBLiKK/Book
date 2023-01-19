public class Book {

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int amountOfPages;
    private int price;
    private String typeOfBindnig;

    public Book(){
        this.id = 0;
        this.name = "";
        this.author = "";
        this.publisher = "";
        this.yearOfPublishing = 0;
        this.amountOfPages = 0;
        this.price = 0;
        this.typeOfBindnig = "";
    }

    public Book(int id, String name, String author, String publisher, int yearOfPublishing, int amountOfPages, int price, String typeOfBindnig) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.typeOfBindnig = typeOfBindnig;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfBindnig() {
        return typeOfBindnig;
    }

    public void setTypeOfBindnig(String typeOfBindnig) {
        this.typeOfBindnig = typeOfBindnig;
    }

    public void prtintBooksInformation(){
        System.out.println("Book's information:");
        System.out.println("Book's id: " + getId());
        System.out.println("Book's name: " + getName());
        System.out.println("Book's author: " + getAuthor());
        System.out.println("Book's publisher: " + getPublisher());
        System.out.println("Book's year of publishing: " + getYearOfPublishing());
        System.out.println("Book's price: " + getPrice());
        System.out.println("Book's type of bindning: " + getTypeOfBindnig());
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book book)) {
            return false;
        }

        if (getId() != book.getId()) {
            return false;
        }
        if (getYearOfPublishing() != book.getYearOfPublishing()) {
            return false;
        }
        if (getAmountOfPages() != book.getAmountOfPages()) {
            return false;
        }
        if (getPrice() != book.getPrice()) {
            return false;
        }
        if (getName() != null ? !getName().equals(book.getName()) : book.getName() != null) {
            return false;
        }
        if (getAuthor() != null ? !getAuthor().equals(book.getAuthor()) : book.getAuthor() != null) {
            return false;
        }
        if (getPublisher() != null ? !getPublisher().equals(book.getPublisher()) : book.getPublisher() != null) {
            return false;
        }
        return getTypeOfBindnig() != null ? getTypeOfBindnig().equals(book.getTypeOfBindnig()) : book.getTypeOfBindnig() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getAuthor() != null ? getAuthor().hashCode() : 0);
        result = 31 * result + (getPublisher() != null ? getPublisher().hashCode() : 0);
        result = 31 * result + getYearOfPublishing();
        result = 31 * result + getAmountOfPages();
        result = 31 * result + getPrice();
        result = 31 * result + (getTypeOfBindnig() != null ? getTypeOfBindnig().hashCode() : 0);
        return result;
    }
}
