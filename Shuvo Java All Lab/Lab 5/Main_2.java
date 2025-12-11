
class LibraryBook {
    String title;
    String author;
    String bookID;

    
    LibraryBook(String title, String author, String bookID) {
        this.title = title;
        this.author = author;
        this.bookID = bookID;
    }

    
    void displayBookInfo() {
        System.out.println("Book ID : " + this.bookID);
        System.out.println("Title   : " + this.title);
        System.out.println("Author  : " + this.author);
    }
}


public class Main_2 {
    public static void main(String[] args) {
        
        LibraryBook book1 = new LibraryBook("Java Programming", "Shakil Ahmed", "B001");
        LibraryBook book2 = new LibraryBook("Python Basics", "Ayesha Khan", "B002");

        book1.displayBookInfo();
        book2.displayBookInfo();
    }
}
