public class Book {
    String title;
    String author;
    int pages;
    Book (String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // 2
    Book(String title, String author){
        this.title = title;
        this.author = author;
        this.pages = 0;
    }
    void displayBookInfo(){
        System.out.println("Book: {");
        System.out.println("\tTitle: " + title);
        System.out.println("\tAuthor: " + author);
        System.out.println("\tPages: " + pages);
        System.out.println("}");
    }
}
