/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ABC
 */
public class TinhDiem {
    private double DiemToan;
    private double DiemLy;
    private double DiemHoa;
    private double DTB;
      
    public void TinhDiem(){
    
    }  
    
    public void TinhDiem(String ngaynhap){
    
    } 

    public double getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(double DiemToan) {
        this.DiemToan = DiemToan;
    }

    public double getDiemLy() {
        return DiemLy;
    }

    public void setDiemLy(double DiemLy) {
        this.DiemLy = DiemLy;
    }

    public double getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(double DiemHoa) {
        this.DiemHoa = DiemHoa;
    }
    public void Nhapdiem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Điểm Toán");
        DiemToan = sc.nextDouble();
        System.out.println("Điểm Lý");
        DiemLy = sc.nextDouble();
        System.out.println("Điểm Hóa");
        DiemHoa = sc.nextDouble();
        TinhDiemTB();
    }
    
    public double TinhDiemTB(){
        double DTB1 = (DiemToan+DiemLy+DiemHoa)/3;
        return DTB1;
    }
    
    public void TinhDiemTB1(){
        this.DTB = (DiemToan+DiemLy+DiemHoa)/3;
    }
    
    public void XuatDiem(TinhDiem diem){
       System.out.println("Điểm Toán" + diem.DiemToan);
       System.out.println("Điểm lý" + diem.DiemLy);
       System.out.println("Điểm Hóa" + diem.DiemHoa);
       System.out.println("Điểm TB" + TinhDiemTB());
    }
      
}
