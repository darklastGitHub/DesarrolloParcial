/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Daniel's
 */
public class DbConnection {
    
    private static String bd = "basedatos";
	private static String login = "root";
	private static String password = "123456";
	private static String url = "jdbc:mysql://localhost/" + bd;

	private Connection connection = null;

	/** Constructor de DbConnection */
	public DbConnection() {
		try {
			// obtenemos el driver de para mysql
			Class.forName("com.mysql.jdbc.Driver");
			// obtenemos la conexiÃ³n
			connection = DriverManager.getConnection(url, login, password);
			if (connection != null) {
				System.out.println("ConexiÃ³n a base de datos " + bd + " OK\n");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** Permite retornar la conexiÃ³n */
	public Connection getConnection() {
		return connection;
	}
}
