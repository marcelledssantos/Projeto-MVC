package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private static final String USERNAME = "root";

	private static final String PASSWORD = "Dorgas100!";

	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/Mvcbd";

	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return connection;
	}

	public static void main(String[] args) throws Exception {
		Connection con = createConnectionToMySQL();
		if (con != null) {
			System.out.println("Conexão obtida com sucesso" + con);

		}

	}
}
