class book
{
    private String author_name;
    book(String a)
    {
        System.out.println("AUTHOR NAME = "+a);
    }
}
class book_publication extends book
{
    private String title;
    book_publication()
    {
        super("AUTHOR1");
    }
    public void display(String title)
    {
        System.out.println("BOOK PUBLICATION = "+title);
    }
}
class paper_publication extends book
{
    private String title;
    paper_publication()
    {
        super("AUTHOR2");
    }
    public void display(String title)
    {
        System.out.println("PAPER PUBLICATION = "+title);
    }
}

public class Lab_6_2
{
    public static void main(String[] args)
    {
        book_publication bp1 = new book_publication();
        bp1.display("ABC");
        paper_publication p1 = new paper_publication();
        p1.display("XYZ");
    }
}
