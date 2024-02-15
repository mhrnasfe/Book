package view;

import controller.LibraryController;
import model.entity.Book;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryController libraryController = new LibraryController();
        Scanner input = new Scanner(System.in);

        int chooseNumber;

        for (;;) {
            showMenu();
            chooseNumber = input.nextInt();
            input.nextLine();
            switch (chooseNumber) {
                case 1 : {
                    Book book = new Book();
                    System.out.println("Enter the name of the book: ");
                    book.setName(input.nextLine());
                    System.out.println("Enter the author of the book: ");
                    book.setAuthor(input.nextLine());
                    System.out.println("Enter the year of publication: ");
                    book.setYear(input.nextInt());

                    libraryController.saveBook(book);
                    break;
                }

                case 2 : {
                    List<Book> bookList = libraryController.findAll();
                    for (Book book : bookList) {
                        System.out.println(book);
                    }
                    break;
                }

                case 3 : {
                    return;
                }
                default:
                    System.out.println("wrong number");
            }

        }
    }

    private static void showMenu() {
        System.out.println("1.add book");
        System.out.println("2.show list");
        System.out.println("3.exit");
    }


}
