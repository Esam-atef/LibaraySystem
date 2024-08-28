public class Main
{
    public static void main(String[] args)
    {
        Librarian librarian=new Librarian("Alice", "123 Main St", 101);
        Library library=new Library(librarian);

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789");
        Book book2 = new Book("1984", "George Orwell", "987654321");

        Member member1 = new Member("John Doe", "456 Elm St", 201);
        Member member2 = new Member("Jane Smith", "789 Pine St", 202);

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);

        library.BorrowBook(member1,book1);
        library.returnBook(member1,book1);

        library.displayAllBooks();
        library.displayMembers();

    }
}