package Library;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.awt.*;

public class ManageMemberController {

    public TextField txtName;

    public TextField txtId;

    public ListView<inputMember> listView;

    private ObservableList<inputMember> memberList = FXCollections.observableArrayList();


    public void addMember(ActionEvent actionEvent) {
        updateMember();
        printList();
    }

    public void updateMember(){
        memberList.add(new inputMember(txtName.getText(),txtId.getText()));
        clearList();
    }

    public void printList(){
        listView.setItems(memberList);
        listView.refresh();
    }

    public  void clearList(){
        txtName.setText("");
        txtId.setText("");
    }

    public void editMember(ActionEvent actionEvent) {
    }
}
