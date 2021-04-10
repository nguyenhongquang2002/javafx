package session.s8;

import sample.model.entily.SinhVien;
import sample.model.entily.SinhVienAccessObject;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //gia su can lay ds sinh vien
        SinhVienAccessObject svao = new SinhVienAccessObject();
        ArrayList<SinhVien> ds = svao.getList();
        //tao 1 sinh vien
        SinhVien s = new SinhVien(null,"Nguyen Hong Quang",19,5);
        if( svao.create(s)){
            System.out.println("tao thanh cong");
        }else{
            System.out.println("tao that bai ");
        }
    }
}
