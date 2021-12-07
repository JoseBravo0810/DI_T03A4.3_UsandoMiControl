/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usandomicontrol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import miscontroles.CampoTextoBoton;
import campotextonumerico.CampoTextoNumerico;

/**
 *
 * @author jose
 */
public class UsandoMiControl extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        
        // Contenedor para tener mi control
        // Al estar definido como un AnchorPane, no se mueve al redimensionar, el otro componente si se posiciona siempre en el centro
        Parent miControl = FXMLLoader.load(getClass().getResource("UsandoMiControlView.fxml"));
        
        CampoTextoBoton btnText = new CampoTextoBoton();
        btnText.setText("Hello!");
        btnText.setAlignment(Pos.CENTER);
        
        CampoTextoNumerico campoNumerico = new CampoTextoNumerico();
        
        root.getChildren().addAll(new Separator(), new Label("MiControl"), miControl, 
                                  new Separator(), new Label("CampoTextoBoton"), btnText,
                                  new Separator(), new Label("CampoTextoNumerico"), campoNumerico);
        
        stage.setScene(new Scene(root));
        stage.setTitle("Control Personalizado");
        stage.setWidth(320);
        stage.setHeight(880);
        stage.show();
    /*
        Parent root = FXMLLoader.load(getClass().getResource("UsandoMiControlView.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    */
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
