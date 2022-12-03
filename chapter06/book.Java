package chapter06.book

public class book{

    private String bookname;
    private String author;

    public book(){

    }

    public book (String bookname, String author){
        this.bookname = bookname;
        this.author = author;
    }

    public String getbookname(){
        return bookname;
    }

    public void setbookname(String bookname){
        this.bookname = bookname;
    }

    public void setbookname(String bookname){
        this.bookname = bookname;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(string author){
        this.author = author;
    }

    public void showBookInfo(){
        System.out.println(bookname+","+author)
    }
}