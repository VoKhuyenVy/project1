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
public class HocSinh {
    private int mahs;
    private String ho;
    private String ten;
    private String lop;   
    
    public void HocSinh(){
    //hàm dựng(contractor)    
    }

    public int getMahs() {
        return mahs;
    }

    public void setMahs(int mahs) {
        this.mahs = mahs;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    
    public void nhapThongTin ()   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap Ma HS");
        mahs = sc.nextInt();
        sc.nextLine();
        System.out.println("Hay nhap Ho");
        ho = sc.nextLine();
        System.out.println("Hay nhap Ten");
        ten = sc.nextLine();
        System.out.println("Hay nhap Lop");
        lop = sc.nextLine();       
    }
    
    public void inThongTin(HocSinh hs){
        System.out.println("MaHS"+ hs.getMahs());
        System.out.println("HoHS"+ hs.getHo());
        System.out.println("TenHS"+ hs.getTen());
        System.out.println("Lop"+ hs.getLop());
    }
}


