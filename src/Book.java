public class Book {
    String name = "Science Book";
    String author = "John Doe";
    String type = "Non fiction";

    static boolean isOpen = false;

    public static void openBook(){
        isOpen = true;
        System.out.println("Book is now open");
    }
}
