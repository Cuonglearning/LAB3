package LAB31;
import java.util.Scanner;

    public class nhanvien {
        Scanner scan=new Scanner(System.in);
        public String tenNhanVien;
        public double luongCoBan,heSoLuong,LUONGMAX,luong;
    public nhanvien(){
        
    }
    public nhanvien(String tenNhanVien,double luongCoBan,double heSoLuong, double LUONGMAX){
        luong=luongCoBan*heSoLuong;
        this.tenNhanVien=tenNhanVien;
        this.luongCoBan=luongCoBan;
        this.heSoLuong=heSoLuong;
        this.LUONGMAX=LUONGMAX;
    }
    public String gettenNhanVien() {
        return tenNhanVien;
    }
 
    public void settenNhanVien(String hoTen) {
        this.tenNhanVien = hoTen;
    }
    public double getluongCoBan() {
        return luongCoBan;
    }
 
    public void setluongCoBan(double CB) {
        this.luongCoBan = CB;
    }
    public double getheSoLuong() {
        return heSoLuong;
    }
 
    public void setheSoLuong(double HSL) {
        this.heSoLuong = HSL;
    }
    public double getLUONGMAX() {
        return LUONGMAX;
    }
 
    public void setLUONGMAX(double max) {
        this.LUONGMAX = max;
    }
    public void nhap(){
        System.out.println("Nhap ho va ten:");
        tenNhanVien=scan.next();
        System.out.println("Nhap luong co ban:");
        luongCoBan=scan.nextDouble();
        System.out.println("Nhap he so luong:");
        heSoLuong=scan.nextDouble();
        System.out.println("Nhap luong toi da:");
        LUONGMAX=scan.nextDouble();
    }
    public boolean tangLuong(double l){
        System.out.println("Nhap so luong tang:");
        l=scan.nextDouble();
        if((luongCoBan*heSoLuong+l)>LUONGMAX){
            System.out.println("Khong duoc lon hon luong toi da!");
            return false;
        }else{
            luong=this.luong+l;
            return true;
        }
    }
    public void inTTin(){
        System.out.println("nhan vien "+tenNhanVien);
        System.out.println("luong co ban: "+luongCoBan);
        System.out.println("he so luong :"+heSoLuong);
        System.out.println("luong tong cong:"+luong);
    }
}
