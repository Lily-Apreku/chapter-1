
class Book {
    String title;
    String author;
    String ISBN;
    int pageCount; // Changed variable name to pageCount without space
    double price;

    // Changed the parameter names to avoid confusion
    // Also added 'this.' to avoid using the same name for parameters and instance variables 
    public Book(String title, String author, String ISBN, int pageCount, double price) {
        this.title = title; 
        this.author = author;
        this.ISBN = ISBN;
        this.pageCount = pageCount;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(String ISBN) {  // Changed data type to String as ISBN is an alphanumeric value
        this.ISBN = ISBN;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Renamed the class to HelloWorld with capitalized W as per Java conventions
class HelloWorld {
    public static void main(String[] args) {
        Book book1 = new Book("Changes", "Ama Atta Aidoo", "123456", 110, 20.20);
        System.out.println(book1.title); // Changed print statement to print book title
    }
}


