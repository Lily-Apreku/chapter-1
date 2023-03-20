// Online Java Compiler
// Use this editor to write, compile and run your Java code online
 class Book{
    String title;
    String author;
    String ISBN;
    int pageCount;
    double price;
    
public Book(String bookTitle,String bookAuthor,String bookISBN,int bookpageCount, double bookPrice){
       title= bookTitle;
       author=bookAuthor;
       ISBN =  bookISBN;
        pageCount=bookpageCount;
        price= bookPrice;
    }    
public static void main(String[] args){
    Book book1=new Book("Changes", "Ama Atta Aidoo","123456",110,20.20);
    System.out.println(book1.title);
    System.out.println(book1.author);
    System.out.println(book1.ISBN);
     System.out.println(book1.pageCount);
    System.out.println(book1.price);

    
    

    
}
       
}
    
    
    
    
    
    
    
    
    
