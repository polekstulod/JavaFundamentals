public class App{
    public static void main(String[] args){
        Book scienceBook = new Book();

        System.out.println(scienceBook.name);
        System.out.println(scienceBook.author);

        scienceBook.openBook();
        System.out.println(scienceBook.isOpen);
    }
}

