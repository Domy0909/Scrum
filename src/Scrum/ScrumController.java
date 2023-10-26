/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Scrum;

import esercitazionescrum.Operazioni_avanzate;
import esercitazionescrum.Operazioni_base;
import esercitazionescrum.Operazioni_trigonometriche;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ScrumController implements Initializable {

    @FXML
    private TextField Tf1;
    @FXML
    private TextField Tf2;
    @FXML
    private TextField Rf;
    @FXML
    private MenuItem Sum;
    @FXML
    private MenuItem Dif;
    @FXML
    private MenuItem Molt;
    @FXML
    private MenuItem Div;
   
    @FXML
    private Button ButtonOn;
    @FXML
    private Button ButtonOff;
    @FXML
    private Pane Pane;
    Operazioni_base ob=new Operazioni_base();
    @FXML
    private MenuItem MSin;
    @FXML
    private MenuItem MCos;
    @FXML
    private MenuItem MTan;
    Operazioni_trigonometriche ot=new Operazioni_trigonometriche();
    @FXML
    private MenuItem MLog10;
    @FXML
    private MenuItem MLogN;
    @FXML
    private MenuItem Msqrt2;
    @FXML
    private MenuItem MsqrtN;
    @FXML
    private MenuItem Mpot;
    Operazioni_avanzate ov=new Operazioni_avanzate();
    @FXML
    private Label Label1;
    @FXML
    private Label Label2;
    

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Pane.setVisible(false);
        Tf1.setText(null);
        Tf2.setText(null); 
    }    

 

    @FXML
    public void Sum(ActionEvent event) {
        try {
            Label1.setText("Inserire un addendo");
            Label2.setText("Inserire un addendo");
            double a = Double.parseDouble(Tf1.getText());
            double b = Double.parseDouble(Tf2.getText());
            double risultato = ob.somma(a, b);
            Rf.setText(Double.toString(risultato));
            Tf1.setText(Double.toString(risultato));
            Tf2.setText(null);
        } catch (NumberFormatException | NullPointerException e) {
            Rf.setText("Errore: Inserisci numeri validi");
        }
    }

    @FXML
    private void Dif(ActionEvent event) {
        try {
            Label1.setText("Inserire un numero");
            Label2.setText("Inserire un numero");
            double a = Double.parseDouble(Tf1.getText());
            double b = Double.parseDouble(Tf2.getText());
            double risultato = ob.differenza(a, b);
            Rf.setText(Double.toString(risultato));
            Tf1.setText(Double.toString(risultato));
            Tf2.setText(null);
        } catch (NumberFormatException | NullPointerException e) {
            Rf.setText("Errore: Inserisci numeri validi");
        }
    }

    @FXML
    private void Molt(ActionEvent event) {
      try {
            Label1.setText("Inserire un numero");
            Label2.setText("Inserire un numero");
            double a = Double.parseDouble(Tf1.getText());
            double b = Double.parseDouble(Tf2.getText());
            double risultato = ob.moltiplicazione(a, b);
            Rf.setText(Double.toString(risultato));
            Tf1.setText(Double.toString(risultato));
            Tf2.setText(null);
        } catch (NumberFormatException | NullPointerException e) {
            Rf.setText("Errore: Inserisci numeri validi");
        }
    }

    @FXML
    private void Div(ActionEvent event) {
        try {
            Label1.setText("Inserire un dividendo");
            Label2.setText("Inserire un divisore");
            double a = Double.parseDouble(Tf1.getText());
            double b = Double.parseDouble(Tf2.getText());
            double risultato = ob.divisione(a, b);
            Rf.setText(Double.toString(risultato));
            Tf1.setText(Double.toString(risultato));
            Tf2.setText(null);
        } catch (NumberFormatException | NullPointerException e) {
            Rf.setText("Errore: Inserisci numeri validi");
        }catch(ArithmeticException ae){
            Rf.setText("Errore: Divisione per zero non consentita!");
        }
    }

    @FXML
    private void On(ActionEvent event) {
        Pane.setVisible(true);
        ButtonOn.setVisible(false);
    }

    @FXML
    private void Off(ActionEvent event) {
        Platform.exit();
    }    

    @FXML
    private void Sin(ActionEvent event) {
        try{
            Label1.setText("Inserire un numero in gradi");
            Label2.setText(null);
            double a = Double.parseDouble(Tf1.getText());
            Tf2.setText("Il numero sarà in gradi");
            double risultato = ot.seno(a);
            Rf.setText(Double.toString(risultato));
            Tf1.setText(Double.toString(risultato));
        }catch (NumberFormatException | NullPointerException e) {
            Rf.setText("Errore: Inserisci un numero valido");
    }
    }
    
    @FXML
    private void Cos(ActionEvent event) {
        try{
            Label1.setText("Inserire un numero in gradi");
            Label2.setText(null);
            double a = Double.parseDouble(Tf1.getText());
            Tf2.setText("Il numero sarà in gradi");
            double risultato = ot.coseno(a);
            Rf.setText(Double.toString(risultato));
            Tf1.setText(Double.toString(risultato));
        }catch (NumberFormatException | NullPointerException e) {
            Rf.setText("Errore: Inserisci un numero valido");
    }
    }

    @FXML
    private void Tan(ActionEvent event) {
        try{
            Label1.setText("Inserire un numero in gradi");
            Label2.setText(null);
            double a = Double.parseDouble(Tf1.getText());
            Tf2.setText("Il numero sarà in gradi");
            double risultato = ot.tangente(a);
            Rf.setText(Double.toString(risultato));
            Tf1.setText(Double.toString(risultato));
        }catch (NumberFormatException | NullPointerException e) {
            Rf.setText("Errore: Inserisci un numero valido");
    }
    }

    @FXML
    private void Log10(ActionEvent event) {
        try{
          Label1.setText("Inserire un numero");
          Label2.setText(null);
          double a = Double.parseDouble(Tf1.getText());
          Tf2.setText("Log 10 numero sopra");
          double risultato = ov.logaritmo_basedieci(a); 
          Rf.setText(Double.toString(risultato));
          Tf1.setText(Double.toString(risultato));
        }catch(NumberFormatException | NullPointerException e){
            Rf.setText("Errore: Inserisci un numero valido");
        }
    }

    @FXML
    private void LogN(ActionEvent event) {
        try{
          Label1.setText("Inserire un numero");
          Label2.setText(null);
          double a = Double.parseDouble(Tf1.getText());
          Tf2.setText("Log naturale sopra");
          double risultato = ov.logaritmo_naturale(a); 
          Rf.setText(Double.toString(risultato));
          Tf1.setText(Double.toString(risultato));
        }catch(NumberFormatException | NullPointerException e){
            Rf.setText("Errore: Inserisci un numero valido");
        }
    }

    @FXML
    private void Sqrt2(ActionEvent event) {
        try{
          Label1.setText("Inserire un numero");
          Label2.setText(null);
          double a = Double.parseDouble(Tf1.getText());
          Tf2.setText("Radice quadrata sopra");
          double risultato = ov.radice_quadrata(a); 
          Rf.setText(Double.toString(risultato));
          Tf1.setText(Double.toString(risultato));
        }catch(NumberFormatException | NullPointerException e){
            Rf.setText("Errore: Inserisci un numero valido");
        }
    }

    @FXML
    private void SqrtN(ActionEvent event) {
        try{
          Label1.setText("Inserire base");
          Label2.setText("Inserire esponente");
          double a = Double.parseDouble(Tf1.getText());
          double b = Double.parseDouble(Tf2.getText());
          double risultato = ov.radice(a, b); 
          Rf.setText(Double.toString(risultato));
          Tf1.setText(Double.toString(risultato));
        }catch(NumberFormatException | NullPointerException e){
            Rf.setText("Errore: Inserisci due numeri validi nei due TF");
        }
    }

    @FXML
    private void Pot(ActionEvent event) {
        try{
          Label1.setText("Inserire base");
          Label2.setText("Inserire esponente");
          double a = Double.parseDouble(Tf1.getText());
          double b = Double.parseDouble(Tf2.getText());
          double risultato = ov.potenza(a, b); 
          Rf.setText(Double.toString(risultato));
          Tf1.setText(Double.toString(risultato));
        }catch(NumberFormatException | NullPointerException e){
            Rf.setText("Errore: Inserisci due numeri validi nei due TF");
        }
    }
}
