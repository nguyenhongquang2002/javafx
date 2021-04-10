package baikiemtra;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {
    public TextField txtID;
    public TextField txtName;
    public TextField txtPhone;
    public TextArea txtAddress;
    public TextArea txtDeparture;
    public TextArea txtReturn;
    public TextArea txtKetqua;

    public static ArrayList<String> ds = new ArrayList<>();

    public void Add() {
        String i = txtID.getText();
        String n = txtName.getText();
        String p = txtPhone.getText();
        String a = txtAddress.getText();
        String d = txtDeparture.getText();
        String r = txtReturn.getText();
        if (!i.isEmpty() || !n.isEmpty() || !p.isEmpty() || !a.isEmpty()|| !d.isEmpty()|| !r.isEmpty()) {
            ds.add(i + "_" + n + "_" + p +"_" + a +"_" + d +"__" + r +"\n");
            String txt = "";
            for (String s : ds) {
                txt += s;
            }
            txtKetqua.setText(txt);
            txtID.setText("");
            txtName.setText("");
            txtPhone.setText("");
            txtAddress.setText("");
            txtDeparture.setText("");
            txtReturn.setText("");
        }

    }

    public void Display(){

    }
    public void Exit(){

    }


}