package genesisprototype.controller;


import genesisprototype.GenesisPrototype;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

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

/**
 *
 * @author scott
 */
public class Open0Controller implements Initializable {
    
     
    @FXML
    private MenuBar menuBar;
    
    @FXML
    private void newPCA(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(GenesisPrototype.class.getResource("view/PCADialogEntry.fxml"));
        AnchorPane page = (AnchorPane) loader.load();
        
        Stage dialogStage = new Stage();
        dialogStage.setTitle("New PCA details");
        dialogStage.initModality(Modality.WINDOW_MODAL);
        Window primaryStage = menuBar.getScene().getWindow();
        dialogStage.initOwner(primaryStage);
        Scene scene = new Scene(page);
        dialogStage.setScene(scene);
        PCADetailsController controller = loader.getController();
        controller.setDialogStage(dialogStage);
        System.out.println("Switching to dialog");
        dialogStage.showAndWait();
        
        
    }

    
    @FXML
    private void handleKeyInput(final InputEvent event) {
       if (event instanceof KeyEvent) {
        final KeyEvent keyEvent = (KeyEvent) event;
        if (keyEvent.isControlDown() && (keyEvent.getKeyCode() == KeyCode.A.getCode()) ){
           provideAboutFunctionality();
        }
     }
    }
  
    
    private void provideAboutFunctionality() {
        
    }
  
    @Override
    public void initialize(java.net.URL arg0, ResourceBundle arg1) {
     menuBar.setFocusTraversable(true);
   
    }   
    
}
