package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            GUI gui = new GUI();
            gui.showGUI();
            // if input is not empty
            SearchGoogle sg = new SearchGoogle();
            sg.search();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
