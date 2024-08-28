class Book
{
    private String author;
    private String title;
    private String isbn;

    public Book(String author, String title, String isbn)
    {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }
    public void displayInfo()
    {
        System.out.println("title is:"+title);
        System.out.println("author is:"+author);
        System.out.println("isbn is:"+isbn);
    }
}
