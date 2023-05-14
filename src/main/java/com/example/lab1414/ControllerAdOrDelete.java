package com.example.lab1414;

import com.example.lab1414.model.Amount;
import com.example.lab1414.model.AmountList;
import com.example.lab1414.model.DataAmount;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerAdOrDelete {



    @FXML
    private TextField amountTF;




    @FXML
    private TextField descriptionTF;

    @FXML
    private  TextField dateTF;


    @FXML
    private Button earnBtn;

    @FXML
    private Button expensiveBtn;


    @FXML
    void earnAction(ActionEvent event) {

        Amount amount = new Amount(Integer.parseInt(amountTF.getText()),0);

        DataAmount.getInstance().getAmountsData().add(amount);


        Stage stage = (Stage) earnBtn.getScene().getWindow();
        stage.close();

    }

    @FXML
    void expensiveAction(ActionEvent event) {

        Amount amount = new Amount(0,Integer.parseInt(amountTF.getText()));

        int negativeAmount= amount.getExpensives()*-1;
        amount.setExpensives(negativeAmount);

        DataAmount.getInstance().getAmountsData().add(amount);


        Stage stage = (Stage) expensiveBtn.getScene().getWindow();
        stage.close();

    }
}
