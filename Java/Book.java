import java.util.ArrayList;

class Book {
   
    private String title;
    private String author;
    private String ISBN;

   
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

  
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    
    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }

    
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN;
    }
}

class Library {
    
    private ArrayList<Book> bookCollection;

    
    public Library() {
        bookCollection = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        bookCollection.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    
    public void removeBook(String ISBN) {
        boolean removed = false;
        for (int i = 0; i < bookCollection.size(); i++) {
            if (bookCollection.get(i).getISBN().equals(ISBN)) {
                System.out.println("Book removed: " + bookCollection.get(i).getTitle());
                bookCollection.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Book with ISBN " + ISBN + " not found.");
        }
    }

    
    public void printAllBooks() {
        System.out.println("\nCurrent books in the collection:");
        for (Book book : bookCollection) {
            book.printDetails();
        }
    }

    public static void main(String[] args) {
        
        Library library = new Library();

       
        Book book1 = new Book("1984", "George Orwell", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1122334455");

        
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

     
        library.printAllBooks();

       
        library.removeBook("0987654321");

       
        library.printAllBooks();
    }
}
