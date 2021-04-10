package quanlysinhvien.themsinhvien;

import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import quanlysinhvien.model.SinhVien;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    public TableColumn<SinhVien,String> txtName;
    public TableColumn<SinhVien,Integer> txtAge;
    public TableColumn<SinhVien,Integer> txtMark;

    public final static String connectString = "jdbc:mysql://localhost:3306/T2009M";
    public final static String username = "root";
    public final static String password = "root";// dung xampp thi bo root di

//    @Override
//    public void initialize(URL location, ResourceBundle resources) {
//        txtName.setCellValueFactory(new PropertyValueFactory<>("name"));
//        txtAge.setCellValueFactory(new PropertyValueFactory<>("age"));
//        txtMark.setCellValueFactory(new PropertyValueFactory<>("mark"));
}
