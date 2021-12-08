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
        
        // Damos ancho al escenario
        stage.setWidth(320);
        // Damos alto al escenario
        stage.setHeight(880);
        
        // VBox que será el nodo raiz de la escena
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        
        // Contenedor para tener mi control
        // Al estar definido como un AnchorPane, no se mueve al redimensionar, el otro componente si se posiciona siempre en el centro
        Parent miControl = FXMLLoader.load(getClass().getResource("UsandoMiControlView.fxml"));
        
        // Control personalizado CampoTextoBoton
        CampoTextoBoton btnText = new CampoTextoBoton();
        btnText.setText("Hello!");
        btnText.setAlignment(Pos.CENTER);
        
        // Control personalizado CampoTextoNumerico
        CampoTextoNumerico campoNumerico = new CampoTextoNumerico();
        // Le quitamos 20 pixeles de ancho para que no quede pegado al borde
        campoNumerico.setMaxWidth(stage.getWidth() - 20);
        
        // Añadimos los componentes personalizados al VBox (nodo raiz)
        root.getChildren().addAll(new Separator(), new Label("4.3. MiControl"), miControl, 
                                  new Separator(), new Label("4.5.1 CampoTextoBoton"), btnText,
                                  new Separator(), new Label("4.5.6 CampoTextoNumerico"), campoNumerico);

        
        // Establecemos la escena
        stage.setScene(new Scene(root));
        // Damos titulo a la ventana
        stage.setTitle("Controles Personalizado");
        
        // Mostramos el escenario
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
