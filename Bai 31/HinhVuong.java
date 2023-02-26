package LAB31;
import java.util.Scanner;

public class HinhVuong {
    Scanner scan=new Scanner(System.in);
    public float Canh;
    public HinhVuong(){    
    }
    public HinhVuong(float Canh){
        this.Canh=Canh;
    }
    public void HinhVuong(float Canh){
        System.out.println("Hay nhap canh hinh vuong:");
        Canh=scan.nextFloat();
    }
    public void setcanhHinhVuong(float canh){
        this.Canh=canh;
    }   
    public void chuVi(){
        System.out.println("Chu vi hinh vuong la "+4*Canh);
    }
    public void dienTich(){
        System.out.println("Dien tich hinh vuong la "+Canh*Canh);
    }
    public float getchuVi(){
        return 4*Canh;
    }
    public float getdienTich(){
        return Canh*Canh;
    }
    public String toString(){
        return "hinh vuong co do dai "+Canh+" chu vi la "+4*Canh+" dien tich "+Canh*Canh;
    }
}
