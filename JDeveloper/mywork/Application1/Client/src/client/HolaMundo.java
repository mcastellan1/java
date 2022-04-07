package client;
import java.sql.*;
import oracle.jdbc.driver.OracleDriver;

public class HolaMundo {
    public static void main(String[] args) {
        String username = "ddjj";
        String password = "martes";
        String databaseUrl = "jdbc:oracle:thin:@10.30.205.136:1521/segsoc";
        System.out.println("Hola Mundo Paso 1");
        try {
            System.out.println("Hola Mundo Paso 2");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Hola Mundo Paso 3");
            Connection cconnection = DriverManager.getConnection(databaseUrl, username, password);
            System.out.println("Hola Mundo Paso 4");
            Statement stmt = cconnection.createStatement();
            ResultSet rs;

            rs = stmt.executeQuery("select pc.* from ddjj.rcx_param_captura pc order by id_param_captura");
            while (rs.next()) {
                String ID_PARAM_CAPTURA = rs.getString("ID_PARAM_CAPTURA");
                String ESTADO = rs.getString("ESTADO");
                String FECALTA = rs.getString("FECALTA");
                System.out.println(ID_PARAM_CAPTURA + " - " + ESTADO + " + " + FECALTA);
            }
            cconnection.close();
            System.out.println("Hola Mundo Paso 5");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Hola Mundo Paso 6");
        }

    }
}
