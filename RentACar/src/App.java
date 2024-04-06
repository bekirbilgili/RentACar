import core.Db;
import core.Helper;
import view.LoginView;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {
       // Connection conn = Db.getInstance();
        Helper.setTheme();
        LoginView loginView = new LoginView();
    }
}
