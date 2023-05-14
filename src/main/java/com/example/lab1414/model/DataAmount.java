package com.example.lab1414.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class DataAmount {



    private ArrayList<Amount> amountsData;


    public ArrayList<Amount> getAmountsData() {
        return amountsData;
    }

    public void setAmountsData(ArrayList<Amount> amountsData) {
        this.amountsData = amountsData;
    }

    private DataAmount(){
        amountsData=new ArrayList<>();
    };

    private static DataAmount instance = null;

    public static DataAmount getInstance(){
        if(instance == null){
            instance = new DataAmount();
        }
        return instance;
    }



    public ObservableList<Amount> earns(){

        ObservableList<Amount> list= FXCollections.observableArrayList();

        for (int i = 0; i <getInstance().getAmountsData().size() ; i++) {


            if(getAmountsData().get(i).getEarns()>0){


                list.add(getAmountsData().get(i));
            }

        }

       return list;
    }

    public ObservableList<Amount> expensives(){

        ObservableList<Amount> list= FXCollections.observableArrayList();

        for (int i = 0; i <getInstance().getAmountsData().size() ; i++) {


            if(getAmountsData().get(i).getExpensives()<0){


                list.add(getAmountsData().get(i));
            }

        }

        return list;
    }

    public ObservableList<Amount> all(){

        ObservableList<Amount> list= FXCollections.observableArrayList();

        for (int i = 0; i <getInstance().getAmountsData().size() ; i++) {


            if(getAmountsData().get(i).getExpensives()<0 || getAmountsData().get(i).getEarns()>0){


                list.add(getAmountsData().get(i));
            }

        }

        return list;
    }

    public String balance(){


        int balance=0;
        int expensive=0;
        int earns=0;

        for (int i = 0; i <getInstance().getAmountsData().size() ; i++) {


            if(getAmountsData().get(i).getExpensives()<0){

                expensive-=getAmountsData().get(i).getExpensives();

            }else {
                earns+=getAmountsData().get(i).getEarns();
            }


            balance=earns-expensive;

        }

        return Integer.toString(balance);
    }


}
