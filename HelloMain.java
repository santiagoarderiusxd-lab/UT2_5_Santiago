import loginapp.*;
import helloapp.*;
import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.fxml.*;
import javafx.beans.property.*;
import java.io.File;
import java.lang.Exception;

public class HelloApp_Launcher extends Application {

@Override
public void start(Stage stage) throws Exception {

Login logger = new Login();
try {logger.login();} catch(Exception e) {e.printStackTrace(System.out);}

Login.isValidated.addListener((obs,oldValue,newValue) -> {

if (newValue) {

Login.login_stage.close();

HelloApp my_app = new HelloApp();
try {my_app.hello_app();} catch(Exception e) {e.printStackTrace(System.out);}
 
  }


});

   }

public static void main(String[] args) {

launch();

}

   }
