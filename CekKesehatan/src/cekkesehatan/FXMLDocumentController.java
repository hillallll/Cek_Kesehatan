/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Hillal
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private RadioButton perem;
    @FXML
    private ToggleGroup Pilihan;
    @FXML
    private RadioButton laki;
    @FXML
    private TextField editnama;
    @FXML
    private TextField editberat;
    @FXML
    private TextField edittinggi;
    @FXML
    private TextField ideal;
    @FXML
    private Button ButtonProses;
    @FXML
    private Button ButtonReset;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void proses(ActionEvent event) {
        String nama=editnama.getText();
        int berat=Integer.parseInt(editberat.getText());
        int tinggi=Integer.parseInt(edittinggi.getText());
        int ideall = tinggi - 105;
        int idealp= tinggi -110;
        String hasill = null;
        String sarann = null;
        String print= null ;
        if(laki.isSelected()){
            
            if(ideall == berat){
                ideal.setText(""+ideall);
                print = "\n Nama Anda : "+nama+"\n Berat badan anda : "+berat+"\n Tinggi anda : "+tinggi+"\n Anda : "
                +hasill;
                hasill = "ideal";
                sarann = "saran: ok sip";
            }
            else if (ideall > berat){
                ideal.setText(""+ideall);
                print = "\n Nama Anda : "+nama+"\n Berat badan anda : "+berat+"\n Tinggi anda : "+tinggi+"\n Anda : "
                +hasill;
                hasill = "under weight";
                sarann = "saran: makan yang banyak";
            }
            else if (ideall < berat){
                ideal.setText(""+ideall);
                print = "\n Nama Anda : "+nama+"\n Berat badan anda : "+berat+"\n Tinggi anda : "+tinggi+"\n Anda : "
                +hasill;
                hasill = "over weight";
                sarann = "saran: makan yang sedikit";
            }
        }    
        if(perem.isSelected()){
            
            if(idealp == berat){
                ideal.setText(""+idealp);
                print = "\n Nama Anda : "+nama+"\n Berat badan anda : "+berat+"\n Tinggi anda : "+tinggi+"\n Anda : "
                +hasill;
                hasill = "ideal";
                sarann = "saran: ok sip";
            }
            else if (ideall > berat){
                ideal.setText(""+idealp);
                print = "\n Nama Anda : "+nama+"\n Berat badan anda : "+berat+"\n Tinggi anda : "+tinggi+"\n Anda : "
                +hasill;
                hasill = "under weight";
                sarann = "saran: makan yang banyak";
            }
            else if (ideall < berat){
                ideal.setText(""+idealp);
                print =  "\n Nama Anda : "+nama+"\n Berat badan anda : "+berat+"\n Tinggi anda : "+tinggi+"\n Anda : "
                +hasill;
                hasill = "over weight";
                sarann = "saran: makan yang sedikit";
            }
        }
        
        hasil.setText("" + print);
        saran.setText(""+sarann);
        }
        
    @FXML
        private void hapus(ActionEvent event) {
editnama.setText("");
editberat.setText("");
edittinggi.setText("");
ideal.setText("");
hasil.setText("");
saran.setText("");
laki.setSelected(false);
perem.setSelected(false);
        
    }
}
    

    
     

