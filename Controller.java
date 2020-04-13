package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Controller {

    @FXML
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,start;
    @FXML
    Label time;
    int i=0;


    public void game(ActionEvent e){
        if(e.getSource()==b1){
            i++;
            time.setText("Licznik ruchów: "+i);
            String label=b1.getText();
            if(b2.getText().equals(" ")){
                b2.setText(label);
                b1.setText(" ");
            }
            if(b4.getText().equals(" ")){
                b4.setText(label);
                b1.setText(" ");
            }
        }
        if(e.getSource()==b2){
            i++;
            time.setText("Licznik ruchów: "+i);
            String label=b2.getText();
            if(b1.getText().equals(" ")){
                b1.setText(label);
                b2.setText(" ");
            }
            if(b3.getText().equals(" ")){
                b3.setText(label);
                b2.setText(" ");
            }
            if(b5.getText().equals(" ")){
                b5.setText(label);
                b2.setText(" ");
            }
        }
        if(e.getSource()==b3){
            i++;
            time.setText("Licznik ruchów: "+i);
            String label=b3.getText();
            if(b2.getText().equals(" ")){
                b2.setText(label);
                b3.setText(" ");
            }
            if(b6.getText().equals(" ")){
                b6.setText(label);
                b3.setText(" ");
            }
        }
        if(e.getSource()==b4){
            i++;
            time.setText("Licznik ruchów: "+i);
            String label=b4.getText();
            if(b1.getText().equals(" ")){
                b1.setText(label);
                b4.setText(" ");
            }
            if(b7.getText().equals(" ")){
                b7.setText(label);
                b4.setText(" ");
            }
            if(b5.getText().equals(" ")){
                b5.setText(label);
                b4.setText(" ");
            }
        }
        if(e.getSource()==b5){
            i++;
            time.setText("Licznik ruchów: "+i);
            String label=b5.getText();
            if(b2.getText().equals(" ")){
                b2.setText(label);
                b5.setText(" ");
            }
            if(b6.getText().equals(" ")){
                b6.setText(label);
                b5.setText(" ");
            }
            if(b4.getText().equals(" ")){
                b4.setText(label);
                b5.setText(" ");
            }
            if(b8.getText().equals(" ")){
                b8.setText(label);
                b5.setText(" ");
            }
        }
        if(e.getSource()==b6){
            i++;
            time.setText("Licznik ruchów: "+i);
            String label=b6.getText();
            if(b9.getText().equals(" ")){
                b9.setText(label);
                b6.setText(" ");
            }
            if(b3.getText().equals(" ")){
                b3.setText(label);
                b6.setText(" ");
            }
            if(b5.getText().equals(" ")){
                b5.setText(label);
                b6.setText(" ");
            }
        }
        if(e.getSource()==b7){
            i++;
            time.setText("Licznik ruchów: "+i);
            String label=b7.getText();
            if(b4.getText().equals(" ")){
                b4.setText(label);
                b7.setText(" ");
            }
            if(b8.getText().equals(" ")){
                b8.setText(label);
                b7.setText(" ");
            }
        }
        if(e.getSource()==b8){
            i++;
            time.setText("Licznik ruchów: "+i);
            String label=b8.getText();
            if(b9.getText().equals(" ")){
                b9.setText(label);
                b8.setText(" ");
            }
            if(b7.getText().equals(" ")){
                b7.setText(label);
                b8.setText(" ");
            }
            if(b5.getText().equals(" ")){
                b5.setText(label);
                b8.setText(" ");
            }
        }
        if(e.getSource()==b9){
            i++;
            time.setText("Licznik ruchów: "+i);
            String label=b9.getText();
            if(b6.getText().equals(" ")){
                b6.setText(label);
                b9.setText(" ");
            }
            if(b8.getText().equals(" ")){
                b8.setText(label);
                b9.setText(" ");
            }
        }
        if(b1.getText().equals("1")&&b2.getText().equals("2")&&b3.getText().equals("3")&&b4.getText().equals("4")&&b5.getText().equals("5")&&b6.getText().equals("6")&&b7.getText().equals("7")&&b8.getText().equals("8")&&b9.getText().equals(" ")){
            time.setText("Graulacje!!, zajelo ci to: "+i+" ruchy!!!");
        }
    }

    public void Start(ActionEvent event){
        if(start.getText().equals("Start")) {
            i=0;
            time.setText("Licznik ruchów: "+i);
            start.setText("Stop");
            b1.setText("5");
            b2.setText("8");
            b3.setText("7");
            b4.setText("6");
            b5.setText("4");
            b6.setText(" ");
            b7.setText("1");
            b8.setText("3");
            b9.setText("2");

        }
        else{
            start.setText("Start");
        }
    }

}
