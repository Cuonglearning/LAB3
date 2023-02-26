package LAB3;
import java.util.Scanner;

public class Student {
    Scanner scan=new Scanner(System.in);
    public String stID;
    public String stName;
    public String stClass;
    public Student(){
    }
    public Student(String stID,String stName,String stClass){
        this.stClass=stClass;
        this.stID=stID;
        this.stName=stName;
    }
    public Student(Student st){
        System.out.println("Hay nhap ma so sinh vien:");
        stID=scan.next();
        System.out.println("Hay nhap ten sinh vien:");
        stName=scan.next();
        System.out.println("Hay nhap lop cua sinh vien:");
        stClass=scan.next();
    }
    public String getStID(){
        return stID;
    }
    public String getStName(){
        return stName;
    }
    public String getStClass(){
        return stClass;
    }
    public void setStID(String id){
        this.stID=id;
    }
    public void setStName(String name){
        this.stName=name;
    }
    public void setStClass(String Class){
        this.stClass=Class;
    }
    public String toString(){
        return "student "+stName+" ID:"+stID+" class:"+stClass;
    }
}
