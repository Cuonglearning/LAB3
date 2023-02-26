package LAB31;

import java.util.Scanner;

public class HinhTron {
    Scanner scan=new Scanner(System.in);
    public float bk;
    public HinhTron(){    
    }
    public HinhTron(float bk){
        this.bk=bk;
    }
    public void HinhTron(float bk){
        System.out.println("Hay nhap ban kinh hinh tron:");
        bk=scan.nextFloat();
    }
    public void setbanKinh(float bk){
        this.bk=bk;
    }   
    public void chuVi(){
        System.out.println("Chu vi hinh tron la "+3.14*bk*2);
    }
    public void dienTich(){
        System.out.println("Dien tich hinh tron la "+3.14*bk*bk);
    }
    public double getchuVi(){
        return 3.14*bk*2;
    }
    public double getdienTich(){
        return 3.14*bk*bk;
    }
    public String toString(){
        return "hinh vuong co do dai "+bk+" chu vi la "+3.14*bk*2+" dien tich "+3.14*bk*bk;
    }
}
