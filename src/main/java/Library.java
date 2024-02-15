    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class Library {
        public static void main(String[] args) {
            List<Book> library = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the name of the book: ");
            String name = scanner.nextLine();
            System.out.println("Enter the author of the book: ");
            String author = scanner.nextLine();
            System.out.println("Enter the year of publication: ");
            int year = scanner.nextInt();

            Book book = new Book(name, author, year);
            library.add(book);
            System.out.println("Book saved successfully");

            System.out.println("List of books: ");
            for (Book book1 : library) {
                System.out.println("Name: " + book1.getName() + ", Author: " + book1.getAuthor() + ", Year: " + book1.getYear());
            }


        }
    }
