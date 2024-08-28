import java.util.ArrayList;
class Library
{

    private ArrayList<Book>books;
    private ArrayList<Member>members;
    private Librarian librarian;

    public Library( Librarian librarian)
    {
        this.books = new ArrayList<>();
        this.members =new ArrayList<>();
        this.librarian = librarian;
    }
    public void addBook(Book book)
    {
        books.add(book);
        System.out.println("Book added is:"+book.getTitle());
    }
    public void addMember(Member member)
    {
        members.add(member);
        System.out.println("Member added is:"+member.getName());
    }
    public void BorrowBook(Member members,Book book)
    {
        if(books.contains(book))
        {
            books.remove(book);
            System.out.println("Member borrow this book is: "+members.getName()+" and book name is: "+book.getTitle());
        }
        else
        {
            System.out.println("The book is not available.");
        }
    }
    public void returnBook(Member member,Book book)
    {
        books.add(book);
        System.out.println("Member :"+member.getName()+" returned "+book.getTitle());
    }
    public void displayAllBooks()
    {
        for(Book book:books)
        {
            book.displayInfo();
        }
    }
    public void displayMembers()
    {
        System.out.println("Members in library:");
        for (Member member : members)
        {
            member.displayInfo();
        }
    }
}
