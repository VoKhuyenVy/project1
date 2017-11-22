/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ABC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      HocSinh hs = new HocSinh();// tạo đối tượng HS
      TinhDiem diem = new TinhDiem();// tạo đối tượng điểm
      hs.nhapThongTin();// gọi phương thức nhập tt của đối tượng hs
      diem.Nhapdiem();//gọi phương thức nhập điểm
      hs.inThongTin(hs);
      diem.XuatDiem(diem);
      // System.out.println("Mã học sinh là " + hs.getMahs());//in ra sử dụng get giá trị
    }
}
