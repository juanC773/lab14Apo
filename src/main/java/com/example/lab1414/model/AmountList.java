package com.example.lab1414.model;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;


public class AmountList {



        //Globales
        private ObservableList<Amount> amounts = FXCollections.observableArrayList();

        //Constructor privado
        public ObservableList<Amount> getAmounts() {
            return amounts;
        }

        public void setAmounts(ObservableList<Amount> amounts) {
            this.amounts = amounts;
        }


        private AmountList(){};

        private static AmountList instance = null;

        public static AmountList getInstance(){
            if(instance == null){
                instance = new AmountList();
            }
            return instance;
        }







}
