package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import sample.model.Student;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public TextField txtName;
    public TextField txtMark;
    public TextArea txtAddress;
    public TextArea ketqua;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //can lam gi khi mo app thi viet vao day
    }

    public static ArrayList<Student> ds = new ArrayList<>();
    public static boolean flag = true;
    public void submit(){
        String n = txtName.getText();
        String m = txtMark.getText();
        String a = txtAddress.getText();
        if(!n.isEmpty() && !m.isEmpty() && !a.isEmpty()){
            Integer diemthi = Integer.parseInt(m);// chuyen string thanh number
            //ds.add(new Student(n,diemthi,a));
            Student s = new Student(n,diemthi,a);
            // ds.add(n+"--"+e+"--"+a+"\n");
            // gọi file để output ra
            try{
                FileOutputStream fos = new FileOutputStream("student.bin");
                DataOutputStream dos = new DataOutputStream(fos);
                dos.writeBytes(s.getName()+"--"+s.getMark());
            }catch(IOException io){
            }
            // sort
            String txt= "";
            for(Student student :ds){
                txt+= s.getName()+"--"+s.getMark()+s.getAddress()+"\n";
            }
            ketqua.setText(txt);
            txtName.setText("");
            txtMark.setText("");
            txtAddress.setText("");
        }

    }
    public void sort(){
        if(flag) {
            // sap xep diem thi tu thap - cao
            Collections.sort(ds, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.getMark() - o2.getMark();
                }
            });
            flag = false;
        }else{
            // sap xep diem thi tu cao - thap
            Collections.sort(ds, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o2.getMark() - o1.getMark();
                }
            });
            flag = true;
        }
        // in lai danh sach
        String txt= "";
        for(Student s:ds){
            txt+= s.getName()+"--"+s.getMark()+s.getAddress()+"\n";
        }
        ketqua.setText(txt);
    }
}