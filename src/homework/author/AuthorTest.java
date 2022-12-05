package homework.author;

import java.util.Scanner;

public class AuthorTest {

    static AuthorStorage authorStorage = new AuthorStorage();
    static Scanner scanner = new Scanner(System.in);
    static BookStorage bookStorage=new BookStorage();



    private static final String EXIT = "0";
    private static final String ADD_AUTHOR = "1";
    private static final String ADD_BOOK = "2";
    private static final String SEARCH_AUTHORS = "3";
    private static final String SEARCH_AUTHORS_BY_AGE = "4";
    private static final String SEARCH_BOOKS_BY_TITLE = "5";
    private static final String PRINT_AUTHORS = "6";
    private static final String PRINT_BOOKS = "7";

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommand();

            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case ADD_BOOK:
                    addBook();
                    break;
                case SEARCH_AUTHORS:
                    searchByname();
                    break;
                case SEARCH_AUTHORS_BY_AGE:
                    searchByAge();
                    break;
                case SEARCH_BOOKS_BY_TITLE:
                    searchByTitle();
                case PRINT_AUTHORS:
                    authorStorage.print();
                    break;
                case PRINT_BOOKS:
                    bookStorage.print();
                    break;
                default:
                    System.out.println("invalid command");
            }


        }


    }

    private static void searchByTitle() {
        System.out.println("Please write book's title");
        String title=scanner.nextLine();
        bookStorage.searchByTitle(title);
    }

    private static void addBook() {
        System.out.println("please input book's title ");
        String title = scanner.next();
        System.out.println("please input book's description");
        String desc = scanner.next();
        System.out.println("please input book's price ");
        double price = Double.parseDouble(scanner.next());
        System.out.println("please input book's count ");
        int count = scanner.nextInt();

        Book book=new Book(title,desc,price,count);
        bookStorage.add(book);
    }

    private static void searchByAge() {
        System.out.println("Please input min age");
        int minAge = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input max age");
        int maxAge = Integer.parseInt(scanner.nextLine());
        authorStorage.searchByAge(minAge, maxAge);
    }

    private static void printCommand() {
        System.out.println("Please input " + EXIT + " for Exit");
        System.out.println("Please input " + ADD_AUTHOR + " for add author");
        System.out.println("Please input " + ADD_BOOK + " for add book");
        System.out.println("Please input " + SEARCH_AUTHORS + " for search author");
        System.out.println("Please input " + SEARCH_BOOKS_BY_TITLE + " for search book");
        System.out.println("Please input " + PRINT_AUTHORS + " for print author");
        System.out.println("Please input " + PRINT_BOOKS + " for print book");

    }

    private static void searchByname() {
        System.out.println("Please input a keyword");
        String keyword = scanner.nextLine();
        authorStorage.searchByName(keyword);
    }

    private static void addAuthor() {

        System.out.println("please input author's name");
        String name = scanner.next();
        System.out.println("please input author's surname");
        String surname = scanner.next();
        System.out.println("please input author's email");
        String email = scanner.next();
        System.out.println("please input author's age");
        int age = scanner.nextInt();
        System.out.println("please input author's gender");
        String gender = scanner.next();
        Author author = new Author(name, surname, email, age, gender);
        authorStorage.add(author);

    }

}
