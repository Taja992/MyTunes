package dk.MyTunes;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import dk.MyTunes.GUI.FXML.GraphicalGUI;


public class Main {
    public static void main(String[] args) throws SQLServerException {
       GraphicalGUI.run();
    }
}