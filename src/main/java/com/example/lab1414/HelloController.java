package com.example.lab1414;

import com.example.lab1414.model.Amount;
import com.example.lab1414.model.AmountList;
import com.example.lab1414.model.DataAmount;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button addOrDeleteBtn;

    @FXML
    private TableView<Amount> balanceTable;

    @FXML
    private TableColumn<Amount, Integer> earnTC;

    @FXML
    private TableColumn<Amount, Double> expensiveTC;

    @FXML
    private TextField balanceTC;


    @FXML
    private Button earnsBtn;

    @FXML
    private Button expensiveFBtn;



    @FXML
    private Button refreshBtn;

    @FXML
    private Button seeListCombiBTN;

    @FXML
    void addOrDelete(ActionEvent event) {

    }

    @FXML
    void refresh(ActionEvent event) {

    }

    @FXML
    void seeBoth(ActionEvent event) {

    }

    @FXML
    void seeEarns(ActionEvent event) {

    }

    @FXML
    void seeExpensive(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        earnTC.setCellValueFactory(new PropertyValueFactory<>("earns"));
        expensiveTC.setCellValueFactory(new PropertyValueFactory<>("expensives"));





        balanceTable.setItems(
                AmountList.getInstance().getAmounts(
        ));

        addOrDeleteBtn.setOnAction(action->{
            HelloApplication.openWindow("addOrDelete.fxml");
        });




        earnsBtn.setOnAction(action->{
            AmountList.getInstance().setAmounts(DataAmount.getInstance().earns());

            balanceTable.setItems(
                    AmountList.getInstance().getAmounts(
                    ));
        } );


        expensiveFBtn.setOnAction(actionEvent -> {
            AmountList.getInstance().setAmounts(DataAmount.getInstance().expensives());
            balanceTable.setItems(
                    AmountList.getInstance().getAmounts(
                    ));
        });


        seeListCombiBTN.setOnAction(actionEvent -> {

            AmountList.getInstance().setAmounts((DataAmount.getInstance().all()));
            balanceTable.setItems(
                    AmountList.getInstance().getAmounts(
                    ));
        });


        refreshBtn.setOnAction(actionEvent -> {
            String balance = DataAmount.getInstance().balance();
            balanceTC.setText(balance);
        });

    }
}
