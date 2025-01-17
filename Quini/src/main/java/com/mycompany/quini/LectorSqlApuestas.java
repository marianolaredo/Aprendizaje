
package com.mycompany.quini;
import static ConectorSql.ConSql.DB_URL;
import static ConectorSql.ConSql.USER;
import static ConectorSql.ConSql.PASS;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class LectorSqlApuestas {
 public static int[] resultadosQuini = new int[6];
    
    public static int[] resultadosPasados(){
    {
    
    Connection conectar = null;
    PreparedStatement consultar = null;
  
        try { 
           
            conectar = DriverManager.getConnection(DB_URL, USER, PASS) ;            
            String query = "SELECT N0, N1, N2, N3, N4, N5 FROM Quini6.jugadas WHERE ID = ?";
            consultar = conectar.prepareStatement(query);
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese numero de jugada a comparar");
            String numjug = teclado.next();
            consultar.setString(1, numjug);
           ResultSet jugadas = consultar.executeQuery();
           System.out.println("Conexion establecida");
           
           while(jugadas.next()) {
                       int num0 = jugadas.getInt("N0");
        	           resultadosQuini[0] = num0;		  
        	           int num1 = jugadas.getInt("N1");
        	           resultadosQuini[1] = num1;
        	           int num2 = jugadas.getInt("N2");
        	           resultadosQuini[2] = num2;
        	           int num3 = jugadas.getInt("N3");
        	           resultadosQuini[3] = num3;
        	           int num4 = jugadas.getInt("N4");
        	           resultadosQuini[4] = num4;
        	           int num5 = jugadas.getInt("N5");
        	           resultadosQuini[5] = num5;
 }
           
           conectar.close();
           consultar.close();
           jugadas.close();
}
		catch (SQLException e){
			e.printStackTrace();
			//System.out.println("Error " + se.getErrorCode());
			//se.getStackTrace();
		}finally {
			try {
				if (consultar != null)
					consultar.close();
			}catch (SQLException se2) {			
		    }
			try {
				if (conectar != null)
					conectar.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}

}
    return resultadosQuini;

    }
}
