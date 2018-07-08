/*
 * Copyright (C) 2018 scott
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package genesisprototype.controller;

/**
 *
 * @author scott
 */
 
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class PCADetailsController {

    


    private Stage dialogStage;
    private boolean okClicked = false;

    private String pca_fname_s, fam_fname_s,  pheno_fname_s;
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    
    @FXML 
    Button pcaEntryOKButton;

    @FXML
    Button pcaEntryCancelButton;
    
    @FXML
    TextField pca_fname;
    
    @FXML 
    TextField fam_fname;
            
    @FXML
    TextField pheno_fname;
    
    
    @FXML
    private void initialize() {
        System.out.println("init the pcadetailscontroller");
    }

    /**
     * Sets the stage of this dialog.
     * 
     * @param dialogStage
     */
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

    
    /**
     * Returns true if the user clicked OK, false otherwise.
     * 
     * @return
     */
    public boolean isOkClicked() {
        return okClicked;
    }

    
    @FXML void handlePcaFname() {
        pca_fname_s = pca_fname.getText();  
        fam_fname.setText(pca_fname_s);
        System.out.println(pca_fname_s);
        
    }
    
    @FXML void handleFamFname() {
        fam_fname_s = pca_fname.getText(); 
          System.out.println(fam_fname_s);
    }   
    
    @FXML void handlePhenoFname() {
        pheno_fname_s = pca_fname.getText();
        System.out.println(pheno_fname_s);
    } 
    
    
    /**
     * Called when the user clicks ok.
     */
    @FXML
    private void handlePcaEntryOK() {

            okClicked = true;
            dialogStage.close();
            System.out.println("OK");
       
    }

    /**
     * Called when the user clicks cancel.
     */
    @FXML
    private void handlePcaEntryCancel() {
        System.out.println("Cancel");
        dialogStage.close();
    }

    /**
     * Validates the user input in the text fields.
     * 
     * @return true if the input is valid
     */
  
}     