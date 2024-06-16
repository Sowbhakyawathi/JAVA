package Task3;

 
public class Library {

	private Book[] books;
    private int maxBooks;
    private int currentSize;

   
    public Library(int maxBooks) {
        this.maxBooks = maxBooks;
        this.books = new Book[maxBooks];
        this.currentSize = 0;
    }

   
    public void addBook(Book book) {
        if (currentSize < maxBooks) {
            books[currentSize] = book;
            currentSize++;
            System.out.println("Book added successfully!");
        } else {
            System.out.println("Cannot add more books. Library is full.");
        }
    }

    
    public void removeBook(int bookID) {
        boolean found = false;
        for (int i = 0; i < currentSize; i++) {
            if (books[i].getBookID() == bookID) {
                 
                for (int j = i; j < currentSize - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[currentSize - 1] = null; // Clear the last element
                currentSize--;
                found = true;
                System.out.println("Book removed successfully!");
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + bookID + " not found.");
        }
    }

     
    public void searchBook(int bookID) {
        boolean found = false;
        for (int i = 0; i < currentSize; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].displayBook();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book with ID " + bookID + " not found.");
        }
    }

     
    public void displayBooks() {
        if (currentSize == 0) {
            System.out.println("Library is empty.");
        } else {
            System.out.println("Listing all books:");
            for (int i = 0; i < currentSize; i++) {
                books[i].displayBook();
            }
        }
    }
}
