package LAB31;

import java.util.Scanner;

public class Vector{
    Scanner scan=new Scanner(System.in);
    int hoanhDo;
    int tungDo;
    int caoDo;
    public Vector(){
        
    }
    public Vector(int hoanhDo,int tungDo,int caoDo){
        this.hoanhDo=hoanhDo;
        this.tungDo=tungDo;
        this.caoDo=caoDo;
    }
    public void sethoanhDo(int HD){
        this.hoanhDo=HD;
    }
    public void settungDo(int TD){
        this.tungDo=TD;
    }
    public void setcaoDo(int CD){
        this.caoDo=CD;
    }
    public void nhapVector(Vector v){
        System.out.println("Hay nhap lan luot hoanhDo,tung do va cao do");
        hoanhDo=scan.nextInt();
        tungDo=scan.nextInt();
        caoDo=scan.nextInt();
    }
    public Vector cong(Vector v2){
        this.hoanhDo=hoanhDo+v2.hoanhDo;
        this.tungDo=tungDo+v2.tungDo;
        this.caoDo=caoDo+v2.caoDo;
        return new Vector(hoanhDo,tungDo,caoDo);
    }
    public Vector tru(Vector v2){
        this.hoanhDo=hoanhDo-v2.hoanhDo;
        this.tungDo=tungDo-v2.tungDo;
        this.caoDo=caoDo-v2.caoDo;
        return new Vector(hoanhDo,tungDo,caoDo);
    }
    public Vector hangSo(int n){
        System.out.println("Hay nhap so can nhan:");
        n=scan.nextInt();
        this.hoanhDo=n*hoanhDo;
        this.tungDo=n*tungDo;
        this.caoDo=n*caoDo;
        return new Vector(hoanhDo,tungDo,caoDo);
    }
    public Vector voHuong(Vector v2){
        this.hoanhDo=hoanhDo*v2.hoanhDo;
        this.tungDo=tungDo*v2.tungDo;
        this.caoDo=caoDo*v2.caoDo;
        int n=(hoanhDo+tungDo+caoDo);
        System.out.println("/n"+n);
        return new Vector(hoanhDo,tungDo,caoDo);
    }
}