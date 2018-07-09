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
 
import genesisprototype.GenesisPrototype;
import genesisprototype.model.Project;
import java.io.File;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;



public class ProjectDetailsController extends AnchorPane {

   

    private Stage dialogStage;
    private boolean okClicked = false;

    private String  fam_fname_s="",  pheno_fname_s="";
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    
    @FXML 
    Button entryOKButton;

    @FXML
    Button entryCancelButton;
    

    @FXML 
    Button fam_fname;

    public String getFam() {
        return fam_fname_s;
    }

    public String getPheno() {
        return pheno_fname_s;
    }
            
    @FXML
    Button pheno_fname;
    
    @FXML private  TextField proj_name;
    
    private Project project;

    public Project getProject() {
        return project;
    }
    
    @FXML
    private void initialize() {
        System.out.println("init the pcadetailscontroller");
    }
    
    public ProjectDetailsController(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(GenesisPrototype.class.getResource(fxml));
        loader.setRoot(this);
        loader.setController(this);
        loader.load();
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

    
    private File getFile(String which) {
       File wanted;
       FileChooser fileChooser = new FileChooser();
       fileChooser.setTitle(which);
       wanted = fileChooser.showOpenDialog(dialogStage); 
       return wanted;
        
    }
    
  
    
    @FXML void handleProjectName() {
        System.out.println(proj_name);
        if (fam_fname.getText().length()>0)  
          entryOKButton.setDisable(false);
        
    }
    
    @FXML void handleFamFname() {
      File fam = getFile("Choose FAM file");  
      fam_fname_s=fam.getAbsolutePath();
      fam_fname.setText(fam.getName());
      fam_fname.setStyle("-fx-text-fill: green");
      if (proj_name.getText().length()>0)  
          entryOKButton.setDisable(false);

    }   
    
    @FXML void handlePhenoFname() {
      File phen = getFile("Choose FAM file");  
      pheno_fname_s = phen.getAbsolutePath();
      pheno_fname.setText(phen.getName());
      pheno_fname.setStyle("-fx-text-fill: green");
    }  
    
    
    /**
     * Called when the user clicks ok.
     */
    @FXML
    private void handlePcaEntryOK() throws IOException {
            okClicked = true;
            dialogStage.close();
            project = new Project(proj_name.getText(), fam_fname_s, pheno_fname_s);
       
    }

    /**
     * Called when the user clicks cancel.
     */
    @FXML
    private void handlePcaEntryCancel() {
        System.out.println("Cancel");
        dialogStage.close();
    }

    
    public String getProjectName() {
        return proj_name.getText();
    }
    
    
    /**
     * Validates the user input in the text fields.
     * 
     * @return true if the input is valid
     */
  
}     