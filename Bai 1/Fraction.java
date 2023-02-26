package LAB3;
import java.util.Scanner;

public class  Fraction {
    Scanner scan=new Scanner(System.in);
    public int num;
    public int den;
    
    public Fraction(){
        this.num=0;
        this.den=1;
    }
    public Fraction(int num,int den){
        if (den==0){
            System.out.println("Mau so khac 0");
            this.num=0;
            this.den=1;
        }else{
        this.num=num;
        this.den=den;
        }
    }
    public void Fraction(Fraction f){
        do {
            System.out.println("Nhap vao tu so:");
            num=scan.nextInt();
            System.out.println("Nhap vao mau so:");
            den=scan.nextInt();
            if (den==0){
                System.out.println("vui long nhap mau khac 0");
            }
        }while (den==0);
    }
    public Fraction add(Fraction f2){
        int tu=num*f2.den+den*f2.num;
        int mau=den*f2.den;
        return new Fraction(tu,mau);
    }
    public Fraction sub(Fraction f2 ){
        int tu=num*f2.den-den*f2.num;
        int mau=den*f2.den;
        return new Fraction(tu,mau);
    }
    public Fraction mul(Fraction f2){
        int tu=num*f2.num;
        int mau=den*f2.den;
        return new Fraction(tu,mau);
    }
    public Fraction div(Fraction f2){
        int tu=num*f2.den;
        int mau=den*f2.num;
        return new Fraction(tu,mau);
    }
    public String toString(){
        return "Fraction["+num+";"+den+"]"; 
    }
}
