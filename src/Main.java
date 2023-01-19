public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[5];
        Book book1 = new Book(1, "Forest", "Mark Twen", "Romashka", 2008, 500, 300, "A");
        books[0] = book1;
        Book book2 = new Book(1, "Forests", "Ernest Hewingway", "Romashka", 1980, 500, 300, "A");
        books[1] = book2;
        Book book3 = new Book(1, "Forest under the forest", "Mark Twen", "Lucky Chicken", 2001, 500, 300, "A");
        books[2] = book3;
        Book book4 = new Book(1, "About Universe", "Arthur Konan Deul", "Romashka", 1900, 500, 300, "A");
        books[3] = book4;
        Book book5 = new Book(1, "Forest2", "Mark Twen", "Lucky Chicken", 2012, 500, 300, "A");
        books[4] = book5;

        Books result = new Books(books);

        result.printInfo();
        System.out.println();
        result.findBooksOfExactAuthor("Mark Twen");
        System.out.println();
        result.findBooksOfExactPublisher("Romashka");
        System.out.println();
        result.findBooksPublishedAfterGivenYear(2000);
        System.out.println();
    }
}