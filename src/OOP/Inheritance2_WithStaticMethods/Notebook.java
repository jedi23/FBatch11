package OOP.Inheritance2_WithStaticMethods;

public class Notebook extends Book{
    int numberOFPages;
    public static int getNumberOfPages() {
        return 500;
    }

    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.getNumberOfPages()); // 404

        Notebook noteBook = new Notebook();
        System.out.println(noteBook.getNumberOfPages()); // 500


    }
}
