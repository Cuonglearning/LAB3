package LAB3;
import java.util.Scanner;

public class Book {
    Scanner scan=new Scanner(System.in);
    public String boCode;
    public String boTitle;
    public String boAuthor;
    public Book(){
    }
    public Book(String boCode,String boTitle,String boAuthor){
        this.boCode=boCode;
        this.boTitle=boTitle;
        this.boAuthor=boAuthor;
    }
    public Book(Book bo){
        System.out.println("Hay nhap ma sach:");
        boCode=scan.next();
        System.out.println("Hay nhap ten sach:");
        boTitle=scan.next();
        System.out.println("Hay nhap ten tac gia:");
        boAuthor=scan.next();
    }
    public String getBoCode(){
        return boCode;
    }
    public String getBoTitle(){
        return boTitle;
    }
    public String getBoAuthor(){
        return boAuthor;
    }
    public void setBoCode(String code){
        this.boCode=code;
    }
    public void setBoTitle(String title){
        this.boTitle=title;
    }
    public void setBoAuthor(String author){
        this.boAuthor=author;
    }
    public String toString(){
        return "sach "+boTitle+" ma:"+boTitle+" tac gia "+boAuthor;
    }
    
}
