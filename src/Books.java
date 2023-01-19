public class Books {

    private int amount;
    Book[] books;

    public Books(Book[] ourBooks){
        this.amount = ourBooks.length;
        books = new Book[amount];

        for(int i = 0; i < this.amount; i++){
            this.books[i] = ourBooks[i];
        }
    }

    private int getAmount(){
        return this.amount;
    }

    public void findBooksOfExactAuthor(String author){
        System.out.println("Books written by " + author + ":");
        for(int i = 0; i < getAmount(); i++){
            if(books[i].getAuthor().compareTo(author) == 0){
                books[i].prtintBooksInformation();
            }
        }
    }

    public void findBooksOfExactPublisher(String publisher){
        System.out.println("Books published by " + publisher + ":");
        for(int i = 0; i < getAmount(); i++){
            if(books[i].getPublisher().compareTo(publisher) == 0){
                books[i].prtintBooksInformation();
            }
        }
    }

    public void findBooksPublishedAfterGivenYear(int year){
        System.out.println("Books published after " + year + " year:");
        for(int i = 0; i < getAmount(); i++){
            if(books[i].getYearOfPublishing() >= year){
                books[i].prtintBooksInformation();
            }
        }
    }

    public void printInfo(){
        for(int i = 0; i < this.amount; i++){
            books[i].prtintBooksInformation();
        }
    }
}
